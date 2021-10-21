package com.swaglabs.login.step_definitions;

import com.swaglabs.login.pages.LoginPage;
import com.swaglabs.login.utulities.ConfigurationReader;
import com.swaglabs.login.utulities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Positive_Login_StepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("I am on the Sauce Demo Login Page")
    public void i_am_on_the_sauce_demo_login_page() {

        String url = ConfigurationReader.getProperty("url");
        Driver.getDriver().get(url);

    }

    @When("I fill the account information for account StandardUser into the Username field and the Password field")
    public void i_fill_the_account_information_for_account_standard_user_into_the_username_field_and_the_password_field() {

        String username = ConfigurationReader.getProperty("Username_positive");
        String password = ConfigurationReader.getProperty("Password_positive");
        loginPage.usernameInput.sendKeys(username);
        loginPage.passswordInput.sendKeys(password);


    }

    @When("I click the Login Button")
    public void i_click_the_login_button() {
        loginPage.signInButton.click();
    }

    @Then("I am redirected to the Sauce Demo Main Page")
    public void i_am_redirected_to_the_sauce_demo_main_page() {
        String mainPaigeUrl="https://www.saucedemo.com/inventory.html";
        String expected=Driver.getDriver().getCurrentUrl();

        Assert.assertEquals("URL does not Match" ,expected,mainPaigeUrl);

    }

    @Then("I verify the App Logo exists")
    public void i_verify_the_app_logo_exists() {

        Assert.assertTrue(loginPage.appLogo.isDisplayed());

        Driver.closeDriver();

    }

}
