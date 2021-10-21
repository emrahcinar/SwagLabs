package com.swaglabs.login.step_definitions;

import com.swaglabs.login.pages.LoginPage;
import com.swaglabs.login.utulities.ConfigurationReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import javax.xml.ws.handler.LogicalHandler;

public class Negative_Login_StepDefinition {

    LoginPage loginPage=new LoginPage();

    @When("I fill the account information for account LockedOutUser into the Username field and the Password field")
    public void i_fill_the_account_information_for_account_locked_out_user_into_the_username_field_and_the_password_field() {

        loginPage.usernameInput.sendKeys(ConfigurationReader.getProperty("Username_negative"));
        loginPage.passswordInput.sendKeys(ConfigurationReader.getProperty("Password_negative"));

    }

    @Then("I verify the Error Message contains the text {string}")
    public void i_verify_the_error_message_contains_the_text(String actualMessage) {

        String expextedMessage=loginPage.errorMessage.getText();

        Assert.assertEquals("Message does not MATCH",expextedMessage,actualMessage);

    }


}
