package com.jqueryUi.step_definitions;

import com.jqueryUi.base.Hook;
import com.jqueryUi.pages.Login_Page;
import com.jqueryUi.pages.Products_page;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class ShoppingCar_Steps {
    Login_Page login_page = new Login_Page(Hook.driver);
    Products_page products_page = new Products_page(Hook.driver);
    int count;


    @Given("user is on invetory page")
    public void user_is_on_invetory_page() {
        login_page.login("standard_user", "secret_sauce");

    }

    @When("user add item to the shopping cart")
    public void user_add_item_to_the_shopping_cart() throws InterruptedException {
        count = products_page.addAllItems();

    }

    @Then("shopping cart icon should diplay the number of item in real-time")
    public void shopping_cart_icon_should_diplay_the_number_of_item_in_real_time() {
        int supposed = products_page.getAddToCart_buttons();
     //   Assert.assertEquals(supposed, count);
        Assert.assertEquals(5,2);
    }

}
