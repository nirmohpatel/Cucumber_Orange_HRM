package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Load_Prop
{
    static Properties prop;
    static FileInputStream input;
    static String fileName = "Test_Data_Config.properties";
    static String fileLocation = "src\\test\\resources\\Test_Data\\";

    public String getProperty (String key)
    {
        prop = new Properties();
        try {
            input = new FileInputStream(fileLocation+fileName);
            prop.load(input);
            input.close();
        }catch (IOException e)
        {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }

}
