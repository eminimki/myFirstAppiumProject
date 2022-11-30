import Pages.LoginPage;
import Utilities.Driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest {
    LoginPage loginPage = new LoginPage();


    @Test
    private void loginTests(){
        loginPage.sendKeysEmail("contact@eminimki.com");
        loginPage.sendKeysPassword("password");
        loginPage.clickOnLoginButton();
    }

    @AfterTest
    private void afterTest(){
        System.out.println("This is a AFTER TEST");
        Driver.closeDriver();
    }
}
