package StepDefinition;

import Pages.LoginPage;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest {
    LoginPage loginPage = new LoginPage();

    @Given("open application")
    public void open_application() {
        System.out.println("sayfa acildi");
    }
    @Given("see login page")
    public void see_login_page() {
        System.out.println("sayfa goruldu");
    }
    @Given("type user email {string}")
    public void type_user_email(String userEmail) {
        loginPage.sendKeysEmail(userEmail);
    }
    @Given("type user password {string}")
    public void type_user_password(String userPassword) {
        loginPage.sendKeysPassword(userPassword);
    }
    @When("click on login button")
    public void click_on_login_button() {
        loginPage.clickOnLoginButton();
    }
    @Then("check for login status")
    public void check_for_login_status() {
        System.out.println("Check edildi");
        Driver.closeDriver();
    }
}
