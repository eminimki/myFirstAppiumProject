package Utilities;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;

public class Driver {
    private static AppiumDriver<WebElement> driver;

    public static void setDriver(DesiredCapabilities cap){
        try {
            driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
        }catch (MalformedURLException malformedURLException){
            System.out.println("URL ERROR!!!");
        }
    }

    public static AppiumDriver<WebElement> getDriver() {
        if (driver==null){
            Capabilities.setUp();
        }
        return driver;
    }
}
