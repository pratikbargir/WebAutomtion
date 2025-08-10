Feature: Demo Feature
  Scenario Outline: Demo Scenario Outline
    Given I am on the Amazon homepage "<url>"
    When I search for "Laptop"
    Then I should see search results related to "Laptop"
    Examples:
        | url                |
        | https://www.amazon.in |
