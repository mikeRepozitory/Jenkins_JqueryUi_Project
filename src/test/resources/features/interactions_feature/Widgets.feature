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






















