Feature: Login functionality

  Scenario Outline: Login with multiple credentials
    Given I launch the browser
    When I open the login page
    And I enter "<username>" and "<password>"
    And I click on the login button
    Then I should see "<result>"

  Examples:
    | username        | password       | result     |
    | standard_user   | secret_sauce   | success    |
    | locked_out_user | secret_sauce   | failure    |
    | problem_user    | wrong_pass     | failure    |