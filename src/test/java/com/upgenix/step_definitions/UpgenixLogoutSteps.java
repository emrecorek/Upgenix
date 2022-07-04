package com.upgenix.step_definitions;

import com.upgenix.pages.UpgenixLoginPage;
import com.upgenix.pages.UpgenixMainPage;
import com.upgenix.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class UpgenixLogoutSteps {

    UpgenixLoginPage loginPage = new UpgenixLoginPage();
    UpgenixMainPage mainPage = new UpgenixMainPage();

    @Given("user goes to the login page")
    public void userGoesToTheLoginPage() {
        Driver.getDriver().get("https://qa.upgenix.net/");
    }

    @When("user gives correct credentials {string}, {string}")
    public void userGivesCorrectCredentials(String email, String password) {
        loginPage.emailInbox.sendKeys(email);
        loginPage.passwordInbox.sendKeys(password);
    }

    @Then("user clicks login button and access the main page")
    public void userClicksLoginButton() {
        loginPage.loginButton.click();
    }

    @When("user clicks the username")
    public void userClicksTheUsername() {
        mainPage.userName.click();
    }

    @And("user clicks logout in dropdown")
    public void userClicksLogoutInDropdown() {
        mainPage.logout.click();
    }

    @Then("user ends up in login page")
    public void userEndsUpInLoginPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("login"));
    }

    @And("user clicks on the step back button")
    public void userClicksOnTheStepBackButton() {
        Driver.getDriver().navigate().back();
    }

    @Then("user sees session expired message")
    public void userSeesSessionExpiredMessage() {
        mainPage.sessionExpired.isDisplayed();
    }
}
