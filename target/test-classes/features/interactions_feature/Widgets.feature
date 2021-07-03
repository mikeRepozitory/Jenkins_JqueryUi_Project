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

  @Button
  Scenario: Successfully test by clicking all the Buttons available
    Then  user selects Button Widgets
    Then clicking all the available Buttons

  @CheckBoxRadio
  Scenario: Successfully test all the CheckBoxRadio
    Then  user selects Checkboxradio Widgets
    Then clicking all the available Checkboxradio

  @ControlGroup
  Scenario: Successfully test all ControlGroup
    Then  user selects Controlgroup Widget
    Then user selects car type "Full size car"
    Then user selects type "Automatic" car
    Then user add Insurance to the rental
    Then user selects "1" vehicle and clicks on Book now

  @DatePicker
  Scenario: Successfully picks a date
    Then  user selects Datepicker Widget
    Then user clicks on date picker and selects  July 1
    Then user verifies that the correct data is "07/01/2021"

  @Dialog
  Scenario: Successfully moved, resized and closed with the 'x' icon
    Then user selects Dialog Widget
    Then user moves Dialog box around
    Then user resizes the box
    Then user closes the box by clicking X

  @Menu
  Scenario: Successfully selects Rock classic Music
    Then user selects Menu Widget
    Then user hover over the music menu
    Then user hover over Rock
    Then user hover over classic and clicks on it

  @Progressbar
  Scenario: Progressbar Widget works as per requirement docs
    Then user selects Progressbar Widget then selects Indeterminate Value
    Then user clicks on Random Value - Determinate couple times make sure works
    Then user clicks on Indeterminate 1 time make sure ir works
    Then user clicks on Random Color couple times make sure works

  @SelectMenu
  Scenario: SelectMenu Widget works as per requirement docs
    Then user selects SelectMenu Widget
    Then user click on Select a speed and select "Medium"
    And user click on Select a file and select "jQuery.js"
    And user click on Select a number and select "1"
    And user click on Select a title and select "Mr."
    Then user verifies that all selected options are displayed

  @Slider
  Scenario: Slider Widget works as per requirement docs
    Then user selects Slider Widget
    Then user click on Slider handle and move it to the right and back to the left

  @Spinner
  Scenario: Spinner Widget works as per requirement docs
    Then user selects Spinner Widget
    Then user click on Select a value and types "8"
    And user clicks on Toggle disable enable button twice
    And user clicks on Toggle widget button twice
    And user clicks on Set value to 5 ones
    Then user clicks on Get value
    Then the pop box should display number "5"

  @Tabs
  Scenario: Tabs Widget works as per requirement docs
    Then user selects Tabs Widget
    Then user click on every tab
    And Tabs should work property

  @Tooltip
  Scenario: Tooltip Widget works as per requirement docs
    Then user selects Tooltip Widget
    Then user click on every avalable tab
    And  Tooltip should work property





















