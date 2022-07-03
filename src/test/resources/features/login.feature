@UPGNX-313
Feature: Login Functionality

  @UPGNX-307
  Scenario Outline: Users can log in with valid credentials
    Given User goes to the login page
    When User gives valid email "<email>" in the email input box
    And User gives valid password "<password>" in the password input box
    And User clicks login button
    Then User login to the app successfully and verify title "Odoo"

    Examples:
      | email                   | password     |
      | salesmanager5@info.com  | salesmanager |
      | salesmanager14@info.com | salesmanager |
      | salesmanager35@info.com | salesmanager |
      | salesmanager34@info.com | salesmanager |
      | salesmanager33@info.com | salesmanager |
      | posmanager5@info.com    | posmanager   |
      | posmanager15@info.com   | posmanager   |
      | posmanager35@info.com   | posmanager   |
      | posmanager6@info.com    | posmanager   |
      | posmanager5@info.com    | posmanager   |


  @UPGNX-308
  Scenario Outline: "Wrong login/password" should be displayed for invalid credentials
    Given User goes to the login page
    When User gives email in the email input box "<email>"
    And User gives password in the password input box "<password>"
    And User clicks login button
    Then User sees error message


    Examples:
      | email                   | password       |
      | salesmanager35@info.com | salesmanager35 |
      | slsmngr15@info.com      | salesmanager   |
      | sales33@info.com        | 123            |
      | posmanager@info.com     | posmanager     |
      | psmngr15@info.com       | posmanager     |
      | salesmanager@info.com   | salesmanager   |


  @UPGNX-309
  Scenario: "Please fill out this field" message should be displayed if the password or username is empty
    Given User goes to the login page
    When User clicks login button
    Then Users sees "Lütfen bu alanı doldurun." message

  @UPGNX-310
  Scenario: User land on the ‘reset password’ page after clicking on the "Reset password" link
    Given User goes to the login page
    When User clicks Reset Password link
    Then User access Reset Password page

  @UPGNX-311
  Scenario:  User should see the password in bullet signs by default
    Given User goes to the login page
    When User writes anything in the password box "salesmanager"
    Then User sees the password in bullet signs

  @UPGNX-312
  Scenario: Verify if the ‘Enter’ key of the keyboard is working correctly on the login page.
    Given User goes to the login page
    When User gives valid email "salesmanager14@info.com"
    And User gives valid password "salesmanager" and clicks enter
    Then User login to the app successfully and verify title "Odoo"
