Feature: Login Functionality

  Scenario: Successful login with valid credentials
    Given I launch the browser
    And I open the login page
    When I enter valid username and password
    And I click on the login button
