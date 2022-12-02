Feature: Login Tests
  Scenario: Succesfully login
    Given open application
    And see login page
    And type user email "contact@eminimki.com"
    And type user password "Password"
    When click on login button
    Then check for login status