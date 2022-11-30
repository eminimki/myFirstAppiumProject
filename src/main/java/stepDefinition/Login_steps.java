package stepDefinition;

import Pages.LoginPage;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Login_steps {
    LoginPage loginPage = new LoginPage();


    @Test
    private void loginTests(){
        loginPage.sendKeysEmail("");
        loginPage.sendKeysPassword("");
        loginPage.waitASome(1000);
        loginPage.clickOnLoginButton();

    }

    @AfterTest
    private void afterTest(){
        System.out.println("AFTER TEST KISIM");
    }
}
