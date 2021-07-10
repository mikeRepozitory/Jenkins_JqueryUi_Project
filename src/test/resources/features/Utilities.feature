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
    Then user selects WidgetFactory button
    When the widgetOne color should change to "rgb(228, 23, 109)"
    When the widgetTwo color should change to "rgb(195, 192, 46)"
    When the widgetThree color should change to "rgb(19, 217, 234)"
    When user clicks on Toggle disabled option
    Then user should not be able to change any widgets colors
    When user clicks on go green all the squares should change to color "rgb(64, 250, 8)"

