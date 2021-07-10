@Utilities
Feature: Interactions

  @Position
  Scenario: Successfully selects AddClass
    When  user selects Position button
    Then user selects my horizontal position "center"
    Then user selects my vertical position "center"
    Then user selects at horizontal position "center"
    Then user selects at vertical position "center"
    Then user selects collision horizontal position "fit"
    Then user selects collision vertical position "center"

  @WidgetFactory
  Scenario: Successfully selects WidgetFactory colors
    Then  user selects WidgetFactory button
    Then user click on all 3 color buttons
    And the color me should change
    Then user clicks on Toggle disabled option
    And when user click again on cnage the color he should not be able to change it
    When user clicks on go green all the squares should cnage to color green

