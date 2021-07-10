@Effects
Feature: Interactions

  @AddClass
  Scenario: Successfully selects AddClass
    Then  user selects AddClass button
    Then user click on Run Effect

  @ColorAnimation
  Scenario: Successfully selects ColorAnimation
    Then user click ColorAnimation button
    When user click on Toggle Effect
    Then the color should change to "rgba(170, 0, 0, 1)"

  @Easing
  Scenario: Easing widgets works as per requirement docs
    Then user click Easing button
    When user click on linear graph the graph should close and open back
    When user click on swing graph the graph should close and open back

  @Effect
  Scenario: Effect dropdown should perform as per requirement docs
    Then user click Effect button
    When user selects all the effects one by one
    And then user runs the effects to test that there are <15> options

  @RemoveClass
  Scenario: Effect dropdown should perform as per requirement docs
    Then user click Effect button
    When user selects all the effects one by one
    And then user runs the effects to test that there are <15> options


