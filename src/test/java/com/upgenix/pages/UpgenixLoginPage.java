package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpgenixLoginPage {

    public UpgenixLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login")
    public WebElement emailInbox;

    @FindBy(id = "password")
    public WebElement passwordInbox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(tagName = "p")
    public WebElement errorMessage;

    @FindBy(linkText = "Reset Password")
    public WebElement resetPassword;





}
