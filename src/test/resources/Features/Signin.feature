Feature: Sign Functionality

  Scenario: Verify Sign Functionality with Signin Credentials
    Given User is on OrangeHRM Signin page
    When user enter "Admin" as username and "admin123" as password
    And user clicks on signin button
    Then user should redirect to the Dashboard page
    And close the borwser
