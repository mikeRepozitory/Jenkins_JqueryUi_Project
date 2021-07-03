@Utilities
Feature: Interactions

  Background:
    Given user goes to "https://jqueryui.com/"

  @Position
  Scenario: Successfully selects AddClass
    Then  user selects Position button
    Then user click on Image Cycler
    When user click twice on Next button then twice on Previous button
    Then the picture should website should display default picture

  @WidgetFactory
  Scenario: Successfully selects AddClass
    Then  user selects Position button
    Then user click on Image Cycler
    When user click twice on Next button then twice on Previous button
    Then the picture should website should display default picture

