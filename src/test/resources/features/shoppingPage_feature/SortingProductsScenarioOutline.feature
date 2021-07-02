@SortingItems


Feature: Sorting products items

  Background:
    Given user is on products page


  Scenario Outline: Sorting products page successfully
    When  user click on product sort container and picks "container"
    Then the products should be displayed in "sorted order"
    Examples:
      | container  | sorted order |
      | A & Z      | A & Z        |
      | Z & A      | Z & A        |
      | Low to Hig | Low to Hig   |
      | Hig to Low | Hig to Low   |




