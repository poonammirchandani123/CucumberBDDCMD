Feature: login functionality test

  Scenario: Check login with valid credentials
    Given user is on login page
    When user enters valid username and password
    And clicks on login button
    Then user is navigated to the home page

    @Smoke
    Scenario: Check login with invalid credentials
      Given user is on login page
      When user enters valid username and password
      And clicks on login button
      Then error message is dis[layed - Invalid Credentials