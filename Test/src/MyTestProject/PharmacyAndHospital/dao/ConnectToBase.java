package MyTestProject.PharmacyAndHospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectToBase {

//    public static final String INSERT = "insert into role (role_name, description, status) values (?,?,true)";

    public static Connection connect() throws SQLException {

        Connection con = DriverManager.getConnection(Config.getConfig(Config.URL),
                Config.getConfig(Config.LOG),
                Config.getConfig(Config.PASS));

            return con;
    }
}

