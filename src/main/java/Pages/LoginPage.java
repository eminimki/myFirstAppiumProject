package Pages;


import Utilities.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends AbstractClass{
    AppiumDriver<WebElement> driver;
    public LoginPage(){
        driver= Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    public void waitATime(int waittime){
        waitASome(waittime);
    }

    @FindBy(id = "com.eminimki.tableviewsample:id/user_email")
    private WebElement emailTextArea;
    public void sendKeysEmail(String userEmail){
        sendKeysMethod(emailTextArea,userEmail);
    }

    @FindBy(id = "com.eminimki.tableviewsample:id/user_pass")
    private WebElement passwordTextArea;
    public void sendKeysPassword(String password){
        sendKeysMethod(passwordTextArea,password);
    }

    @FindBy(id = "com.eminimki.tableviewsample:id/loginbutton")
    private WebElement loginButtonOnLoginPage;
    public void clickOnLoginButton(){
        clickMethod(loginButtonOnLoginPage);
    }

}