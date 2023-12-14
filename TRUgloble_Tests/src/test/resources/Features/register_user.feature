Feature: Amazon User Registration

  Scenario: User registers on Amazon
    Given user oprn the amazon
    Then user navigates to the Amazon registration page
    When user provides registration details
    And user submits the registration form
    Then user should be registered successfully