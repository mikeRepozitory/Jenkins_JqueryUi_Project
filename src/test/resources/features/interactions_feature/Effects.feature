@Effects
Feature: Interactions

  Background:
    Given user goes to "https://jqueryui.com/"

  @AddClass
  Scenario: Successfully selects AddClass
    Then  user selects AddClass button
    Then user click on Run Effect
