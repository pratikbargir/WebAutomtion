Feature: Demo Feature
  Scenario Outline: Demo Scenario Outline
    Given I am on the Amazon homepage "<url>"
    When I search for "Laptop"
    Then I should see search results related to "Laptop"
    Examples:
        | url                |
        | https://www.amazon.in |

  Scenario Outline: Add to Cart Scenario
  Given I am on the Amazon homepage "<url>"
    When I search for "iphone 15"
    Then I should see search results related to "iphone 15"
    When I click on the first search result
    And I add the product to the cart
    And I proceed to checkout
    Then I should see the checkout page
    Examples:
      | url |
      | https://www.amazon.in |