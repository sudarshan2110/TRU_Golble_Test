Feature: iPhone Purchase

Scenario: User purchases an iPhone

		Given user open the amazon
    When user searches for iPhone
    When user selects from the list
    And goes to the product details page
    And selects and stores the price in a variable
    Then adds the iPhone to the cart