package Utilities;

import org.openqa.selenium.remote.DesiredCapabilities;

public class Capabilities {
    public static void setUp(){
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("deviceName", "Pixel 2 API 30");
        cap.setCapability("platformName", "Android");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformVersion", "11.0");
        cap.setCapability("appPackage", "com.eminimki.tableviewsample");
        cap.setCapability("appActivity", "com.eminimki.Promenkul.MainActivity");
        cap.setCapability("skipUnlock", "true");
        cap.setCapability("noReset","false");
        Driver.setDriver(cap);
    }
}
