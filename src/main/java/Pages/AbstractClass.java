package Pages;

import Utilities.Driver;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public abstract class AbstractClass {
    private AppiumDriver<WebElement> driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, 10);

    public void waitASome(int time){
        try {
            Thread.sleep(time);
        } catch(InterruptedException e) {
            System.out.println("An Excetion occured: " + e);
        }
    }

    public void clickMethod(WebElement clickElement){
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
        waitASome(250);

    }

    public void sendKeysMethod(WebElement sendKeysElement, String text){
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(text);
        waitASome(250);
    }



}
