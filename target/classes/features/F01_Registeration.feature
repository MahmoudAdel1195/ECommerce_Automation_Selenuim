@smoke
  Feature: F01_Register users could register with new accounts

  #TestScenario:
  Scenario: guest could register with valid data successfully

    Given user go to register page
    And user enter valid data

    When user click on register button

    #Expected result
    Then user could register successfully
