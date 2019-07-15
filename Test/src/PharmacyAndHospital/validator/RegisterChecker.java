package PharmacyAndHospital.validator;

import PharmacyAndHospital.dao.ConnectToBase;
import PharmacyAndHospital.domain.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class RegisterChecker {

    private static final String CHECK_DB = "SELECT role from pharmacy_client where login= ? and password = ?";

    private static final String REG_DB = "INSERT INTO pharmacy_client(first_name, last_name, login, password, " +
            "phone_number, email) VALUES (?, ?, ?, ?, ?, ?)";

    private static final String ADMIN = "Administrator";
    private static final String PHARM = "PharmacyUser";
    private static final String HOSPITAL = "HospitalUser";
//    private static final String DOC = "Doctor";

    public Person login(String log, String pass) {

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
             PreparedStatement stmt = con.prepareStatement(CHECK_DB)) {

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

    public void register() {
        Scanner sc = new Scanner(System.in);
        int index=0;
        try(Connection con = ConnectToBase.connect();
            PreparedStatement stmt = con.prepareStatement(REG_DB)) {

            con.setAutoCommit(false);

            try {
                System.out.print("Enter First name > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter Last name > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter login > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter password > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter phone number > ");
                stmt.setString(++index,sc.next());
                System.out.print("Enter email > ");
                stmt.setString(++index,sc.next());
                System.out.print("Done");

                stmt.executeUpdate();
                con.commit();
            } catch (SQLException e) {
                con.rollback();
                e.printStackTrace();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
