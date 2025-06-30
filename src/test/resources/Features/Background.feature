Feature: check Home Page Functionality

  Background: user is login
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user is navigated to the home page

  Scenario: Check Logout link
    When User clicks on welcome link
    Then Logout link is displayed

  Scenario: verify quick launch toolbar is present
    When User clicks on dashboard link
    Then quick launcher toolbar is displayed
