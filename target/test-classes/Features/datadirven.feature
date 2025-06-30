Feature: Datadriven login functionality

  Scenario Outline: verify para login functionality
    Given user is on HRM login page
    When user enter valid username <Username>
    And enter valid password <Password>
    And user submit on signin button
    Then user redirect to board

    Examples: 
      | Username | Password |
      | Admin    | admin123 |
      | Admin    | admin123 |
