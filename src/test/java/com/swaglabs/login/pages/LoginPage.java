package com.swaglabs.login.pages;

import com.swaglabs.login.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LandingPage {
    public LoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(id = "user-name")
    public WebElement usernameInput;

    @FindBy(id="password")
    public WebElement passswordInput;

    @FindBy(id="login-button")
    public WebElement signInButton;

    @FindBy(xpath = "//*[@id='login_button_container']/div/form/div[3]/h3")
    public WebElement errorMessage;



}
