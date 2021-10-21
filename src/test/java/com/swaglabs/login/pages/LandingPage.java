package com.swaglabs.login.pages;

import com.swaglabs.login.utulities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    public  LandingPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//div[@class='app_logo']")
    public WebElement appLogo;
}
