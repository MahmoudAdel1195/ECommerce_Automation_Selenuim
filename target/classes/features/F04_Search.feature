@smoke
Feature: F04_Search feature | users could search for products using product name and sku.

  Scenario Outline:user could search using "<product name>"

  When user enter "<product name>"
  Then user navigated to search link with "<product name>"
  And User could find relative products to the product name "<product name>"

      Examples:
      | product name |
      | book         |
      | laptop       |
      | nike         |

  Scenario Outline: user could search using product "<product sku>"
    When user enter "<product sku>"
    Then user navigated to  search link with  "<product sku>"

    Examples:
   | product sku |
   | SCI_FAITH   |
   | APPLE_CAM   |
   | SF_PRO_11   |




