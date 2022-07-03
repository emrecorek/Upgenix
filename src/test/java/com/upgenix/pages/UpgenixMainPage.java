package com.upgenix.pages;

import com.upgenix.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UpgenixMainPage {

    public UpgenixMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(className = "oe_topbar_name")
    public WebElement userName;
}
