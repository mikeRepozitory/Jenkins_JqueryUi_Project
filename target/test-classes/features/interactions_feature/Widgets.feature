@Widgets
Feature: Interactions

  Background:
    Given user goes to "https://jqueryui.com/"

  @Accordion
  Scenario: Successfully selects Accordion selections
    Then  user selects Accordion button
    Then user click on Accordion Sections one by one all 4 elements


  @Autocomplete
  Scenario: Successfully searches something on Autocomplete bar
    Then  user selects Autocomplete button
    Then user click on search and types "ja"
    Then user should be able to select "Java" from the suggested options