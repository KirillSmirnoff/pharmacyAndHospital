package ru.k2.pharmacy_hospital.dao;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Config {

    public static final String URL = "url";
    public static final String LOG = "log";
    public static final String PASS = "pass";
    private static final String SOURCE= "PharmacyAndHospital/connectProperties";

    private static Properties properties = new Properties();

    public static String getConfig(String properties){

        try(InputStream stream = Config.class.getClassLoader().getResourceAsStream(SOURCE)){

            Config.properties.load(stream);

        }catch (IOException ex){
            ex.printStackTrace();
        }


        return Config.properties.getProperty(properties);
    }
}
