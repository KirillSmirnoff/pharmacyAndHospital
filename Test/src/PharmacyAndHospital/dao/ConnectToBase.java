package PharmacyAndHospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToBase {

    public static Connection connect() throws SQLException {

        return DriverManager.getConnection(Config.getConfig(Config.URL),
                Config.getConfig(Config.LOG),
                Config.getConfig(Config.PASS));
    }
}

