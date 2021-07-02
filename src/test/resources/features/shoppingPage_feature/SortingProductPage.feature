@SortingTest
Feature: Sorting product page

Background:
  Given user is on products page

  @SortingA->Z
  Scenario: Sorting products page from A to Z successfully
    When  user click on product sort container and picks A to Z
    Then the products should be displayed in A to Z order

  @SortingZ->A
  Scenario: Sorting products page from Z to A successfully
    When  user click on product sort container and picks Z to A
    Then the products should be displayed in Z to A order

  @SortingPriceLow->High
  Scenario: Sorting products page from Low to Hig successfully
    When  user click on product sort container and picks Low to Hig
    Then the products list should be displayed in Low to Hig  order

  @SortingPriceHigh->Low
  Scenario: Sorting products page from Hig to Low successfully
    When  user click on product sort container and picks Hig to Low
    Then the products list should be displayed in Hig to Low order
