@cart_icon
Feature: Shopping cart icon

  when user add or remove item on the inventory page, the shopping cart icon should
  update itself instantly real-time
  showing how many items cart by displaying item count on th eicon

  Scenario: Shopping cart icon real time updates item in the cart
    Given user is on invetory page
    When  user add item to the shopping cart
    Then shopping cart icon should diplay the number of item in real-time