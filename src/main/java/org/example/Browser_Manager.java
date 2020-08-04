package org.example;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Browser_Manager extends Util
{
    public static Load_Prop load_prop = new Load_Prop();
    public static final String browserName = load_prop.getProperty("BrowserName");
    public static final String USERNAME = load_prop.getProperty("SAUCE_USERNAME");
    public static final String ACCESS_KEY = load_prop.getProperty("SAUCE_ACCESS_KEY");
    //public static final String URL = "https://"+USERNAME+":"+ ACCESS_KEY + "@ondemand.eu-central-1.saucelabs.com:443/wd/hub";
    public static final String URL = "https://NirmohpatelUnique:402a8514-6ebb-45bc-b183-7407cd31c1e8@ondemand.eu-central-1.saucelabs.com:443/wd/hub";

    public static final boolean SAUCE_LAB = true;

    public void setBrowser() // create Method for start up browser
    {
        System.out.println(browserName);

        if (SAUCE_LAB)
        {
            System.out.println("Running with SauceLab" + browserName);

            if (browserName.equalsIgnoreCase("chrome"))
            {
               DesiredCapabilities capabilities = DesiredCapabilities.chrome();
                capabilities.setCapability("platformName", "Windows 10");
                capabilities.setCapability("browserVersion", "83.0");

                try
                {
                    driver = new RemoteWebDriver(new URL(URL),capabilities);

                }catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }

            } else if (browserName.equalsIgnoreCase("Firefox"))
            {

                DesiredCapabilities capabilities = DesiredCapabilities.firefox();
                capabilities.setCapability("platformName", "Windows 10");
                capabilities.setCapability("browserVersion", "78.0");

                try
                {
                    driver=new RemoteWebDriver(new URL(URL),capabilities);

                }catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }

            } else if (browserName.equalsIgnoreCase("safari"))
            {

                DesiredCapabilities capabilities = DesiredCapabilities.safari();
                capabilities.setCapability("platformName", "Windows 10");
                capabilities.setCapability("browserVersion", "latest");

                try
                {
                    driver=new RemoteWebDriver(new URL(URL),capabilities);

                }catch (MalformedURLException e)
                {
                    e.printStackTrace();
                }

            }
            else
                {
                    System.out.println("you browser name is wrong or empty" + browserName);
                }
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            // open the URL
            driver.get(load_prop.getProperty("url"));

        }else {
        if (browserName.equalsIgnoreCase("chrome"))
        {
            // setting up chrome driver path
            System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Browser_Drivers\\chromedriver.exe");

            // create chrome driver object to open Google Chrome browser
            driver = new ChromeDriver();
        }else if (browserName.equalsIgnoreCase("Firefox"))
        {
            // setting up chrome driver path
            System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\Browser_Drivers\\geckodriver.exe");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability("marionette", true);
            driver = new FirefoxDriver();

        } else
        {
            System.out.println("you browser name is wrong or empty" + browserName);
        }

        //String urlName = loadProp.getProperty("url");
        // maximising screen
        driver.manage().window().maximize();
        // Applying implicitly wait of 10 sec to driver instance
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // open the URL
        driver.get(load_prop.getProperty("url"));
    }
    }
    // create new method for Close Browser
    public void closeBrowser() {driver.close();}// reusable method to close browser

}
