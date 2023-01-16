@smoke
Feature: F03_Currency feature

  Scenario: User could select euro Currency from drop down list all items shows with the euro symbol

    When User select euro currency

    Then Euro symbol is shown on all products in home page