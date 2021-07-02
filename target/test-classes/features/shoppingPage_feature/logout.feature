@Logout
Feature: Logout

  Scenario: Successfully log out
    Given user should be login
    When user logs out
    And system should return to log in page