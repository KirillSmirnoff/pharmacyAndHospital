package MyTestProject.PharmacyAndHospital.validator;

import MyTestProject.PharmacyAndHospital.dao.ConnectToBase;
import MyTestProject.PharmacyAndHospital.domain.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterChecker {

    public static final String INSERT = "SELECT role from pharmacy_client where login= ? and password = ?";

    private static final String ADMIN = "Administrator";
    private static final String PHARM = "PharmacyUser";
    private static final String HOSPITAL = "HospitalUser";
//    private static final String DOC = "Doctor";

    public Person checkLogin(String log, String pass) {

        Person person = checkInDB(log, pass);

        if (ADMIN.equals(person.role.roleName))
            return new Staff(new Role(ADMIN));
        else if (PHARM.equals(person.role.roleName))
            return new PharmacyUser(new Role(PHARM));
        else if (HOSPITAL.equals(person.role.roleName))
            return new HospitalUser(new Role(HOSPITAL));

        else return null;
    }

    private Person checkInDB(String log, String pass) {
        String permission = "";

        try (Connection con = ConnectToBase.connect();
             PreparedStatement stmt = con.prepareStatement(INSERT)) {

            con.setAutoCommit(false);

            try {
                stmt.setString(1, log);
                stmt.setString(2, pass);
//                          statement.setString(3, pass);

                ResultSet resultSet = stmt.executeQuery();

//                ResultSet genKeys = stmt.getGeneratedKeys();

                if (resultSet.next())
                    permission = resultSet.getString("role");

                con.commit();

            } catch (SQLException e) {
                e.printStackTrace();
                con.rollback();
            }

        } catch (SQLException e) {
            e.printStackTrace();

        }

        return new Person(new Role(permission));
    }

    public void register(String log, String pass) {
        System.out.println("let register");
//        ConnectToBase.connect(log,pass);
    }
}
