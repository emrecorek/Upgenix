package com.upgenix.step_definitions;

import com.upgenix.pages.UpgenixLoginPage;
import com.upgenix.utilities.Driver;
import com.upgenix.utilities.WaitUtils;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test {

    UpgenixLoginPage loginPage = new UpgenixLoginPage();

    @Test
    public void assertFillOutField(){

        Driver.getDriver().get("https://qa.upgenix.net/");


        Assert.assertTrue(loginPage.emailInbox.getAttribute("validationMessage").contains("Lütfen"));
        Assert.assertTrue(loginPage.passwordInbox.getAttribute("validationMessage").contains("Lütfen"));





    }


}
