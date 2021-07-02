Feature: Login
  @Valid_login
  Scenario: Successfully login
    Given user enters valid credentials
    Then  system should log in


    @Invalid_login
  Scenario: Unsuccessfully login
    Given user enters invalid credentials
    Then  system should not log in
