package com.upgenix.step_definitions;

import com.upgenix.pages.UpgenixLoginPage;
import com.upgenix.pages.UpgenixMainPage;
import com.upgenix.utilities.Driver;
import com.upgenix.utilities.WaitUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class UpgenixLoginSteps {

    UpgenixLoginPage loginPage = new UpgenixLoginPage();
    UpgenixMainPage mainPage = new UpgenixMainPage();

    @Given("User goes to the login page")
    public void userGoesToTheLoginPage() {
        Driver.getDriver().get("https://qa.upgenix.net/");
    }

    @When("User gives valid email {string} in the email input box")
    public void userGivesValidEmailInTheEmailInputBox(String email) {
        loginPage.emailInbox.sendKeys(email);
    }

    @And("User gives valid password {string} in the password input box")
    public void userGivesValidPasswordInThePasswordInputBox(String password) {
        loginPage.passwordInbox.sendKeys(password);
    }

    @And("User clicks login button")
    public void userClicksLoginButton() {
        loginPage.loginButton.click();
    }

    @Then("User login to the app successfully and verify title {string}")
    public void userLoginToTheAppSuccessfullyAndVerifyTitle(String title) {
        System.out.println(Driver.getDriver().getTitle());
        Assert.assertTrue( Driver.getDriver().getTitle().contains(title));
    }


    @When("User gives email in the email input box {string}")
    public void userGivesIncorrectEmailInTheEmailInputBox(String incorrectEmail) {
        loginPage.emailInbox.sendKeys(incorrectEmail);
    }

    @And("User gives password in the password input box {string}")
    public void userGivesCorrectPasswordInThePasswordInputBox(String correctPassword) {
        loginPage.passwordInbox.sendKeys(correctPassword);
    }

    @Then("User sees error message")
    public void userSeesErrorMessage() {
        loginPage.errorMessage.isDisplayed();
    }

    @When("User clicks Reset Password link")
    public void userClicksResetPasswordLink() {
        loginPage.resetPassword.click();
    }

    @Then("User access Reset Password page")
    public void userAccessResetPasswordPage() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("reset"));
    }

    @When("User writes anything in the password box {string}")
    public void userWritesAnythingInThePasswordBox(String password) {
        loginPage.passwordInbox.sendKeys(password);
    }

    @Then("User sees the password in bullet signs")
    public void userSeesThePasswordInBulletSigns() {
        Assert.assertTrue(loginPage.passwordInbox.getAttribute("type").equals("password"));
    }

    @Then("Users sees {string} message")
    public void usersSeesMessage(String message) {
        Assert.assertTrue(loginPage.emailInbox.getAttribute("validationMessage").equals(message));
        Assert.assertTrue(loginPage.passwordInbox.getAttribute("validationMessage").contains(message));
    }

    @When("User gives valid email {string}")
    public void userGivesValidEmail(String email) {
        loginPage.emailInbox.sendKeys(email);
    }

    @And("User gives valid password {string} and clicks enter")
    public void userGivesValidPassword(String password) {
        loginPage.passwordInbox.sendKeys(password + Keys.ENTER);
    }


}
