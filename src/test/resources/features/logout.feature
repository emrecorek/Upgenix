@UPGNX-344
Feature: Logout functionality


  Background: Login successfully
    Given user goes to the login page
    When user gives correct credentials "salesmanager35@info.com", "salesmanager"
    Then user clicks login button and access the main page

  @UPGNX-342
  Scenario: User can log out and ends up in login page
    When user clicks the username
    And user clicks logout in dropdown
    Then user ends up in login page


  @UPGNX-343
  Scenario: The user can not go to the home page again by clicking the step back button after successfully logged out.
    When user clicks the username
    And user clicks logout in dropdown
    Then user ends up in login page
    And user clicks on the step back button
    Then user sees session expired message

