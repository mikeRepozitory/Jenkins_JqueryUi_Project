@Interactions
Feature: Interactions

  @Draggable
  Scenario: Successfully drag box around
    Then  user selects Draggable button
    Then user click on Drag me around box and drag it around

  @Droppable
  Scenario: Successfully Drag box tot he target
    Then  user selects Droppable button
    Then user click on Drag box and drags it to target

  @Resizable
  Scenario: Successfully Resizable the widget
    Then  user selects Resizable button
    Then user clicks on Resizable icon and try to adjust i by making it smaller or bigger

  @Selectable
  Scenario: Successfully Select one item
    Then  user selects Selectable button
    Then user clicks on Selectable button
    Then user tries to click multiple  Selectable buttons by holding "ctrl" keyboard

  @Sortable
  Scenario: Successfully Sorts items
    Then  user selects Sortable button
    Then user clicks on Sortable element and moves it down

