@smoke

Feature: F02_Login | users could use login functionality to use their accounts

  #TestScenario:
  Scenario: user could login with valid email and password

    Given user go to login page
    When user login with valid data

    And user press on login button

    #Expected result
    Then user login to the system successfully


  Scenario: user could not  login with invalid email and password

    Given user go to login page
    When user login with invalid data

    And user press on login button

    #Expected result
    Then user could not login to the system successfully
