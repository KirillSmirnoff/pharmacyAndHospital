package MyTestProject.PharmacyAndHospital.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    public static final String URL = "url";
    public static final String LOG = "log";
    public static final String PASS = "pass";
    private static final String SOURCE= "MyTestProject/PharmacyAndHospital/connectProperties";

    private static Properties properties = new Properties();

    public static String getConfig(String propertie){

        try(InputStream stream = Config.class.getClassLoader().getResourceAsStream(SOURCE)){

            properties.load(stream);

        }catch (IOException ex){
            ex.printStackTrace();
        }


        return properties.getProperty(propertie);
    }
}
