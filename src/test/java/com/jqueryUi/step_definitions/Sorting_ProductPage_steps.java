package com.jqueryUi.step_definitions;

import com.jqueryUi.base.Hook;
import com.jqueryUi.pages.Login_Page;
import com.jqueryUi.pages.Products_page;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class Sorting_ProductPage_steps {

    Login_Page login_page = new Login_Page(Hook.driver);
    Products_page products_page = new Products_page(Hook.driver);


    @Given("user is on products page")
    public void user_is_on_products_page() {
        login_page.login("standard_user", "secret_sauce");
    }

    @When("user click on product sort container and picks A to Z")
    public void user_click_on_product_sort_container_and_picks_a_to_z()  {
        products_page.sortProductBy("Name (A to Z)");
    }

    @Then("the products should be displayed in A to Z order")
    public void the_products_should_be_displayed_in_a_to_z_order()  {
        String option = products_page.activeContainerShortOption();
        Assert.assertEquals("Name (A to Z)".toUpperCase(), option.toUpperCase());
        System.out.println("Test passed" + " " +  option);
    }

    @When("user click on product sort container and picks Z to A")
    public void user_click_on_product_sort_container_and_picks_z_to_a() throws InterruptedException {
        products_page.sortProductBy("Name (Z to A)");
    }

    @Then("the products should be displayed in Z to A order")
    public void the_products_should_be_displayed_in_z_to_a_order() throws InterruptedException {
        String option = products_page.activeContainerShortOption();
        Assert.assertEquals("Name (Z to A)".toUpperCase(), option.toUpperCase());
        System.out.println("Test passed" + " " +  option);
    }

    @When("user click on product sort container and picks Low to Hig")
    public void user_click_on_product_sort_container_and_picks_low_to_hig() throws InterruptedException {
        products_page.sortProductBy("Price (low to high)");
    }

    @Then("the products list should be displayed in Low to Hig  order")
    public void the_products_list_should_be_displayed_in_low_to_hig_order() throws InterruptedException {
        String option = products_page.activeContainerShortOption();
        Assert.assertEquals("Price (low to high)".toUpperCase(), option.toUpperCase());
        System.out.println("Test passed" + " " +  option);
    }

    @When("user click on product sort container and picks Hig to Low")
    public void user_click_on_product_sort_container_and_picks_hig_to_low() throws InterruptedException {
        products_page.sortProductBy("Price (high to low)");
    }

    @Then("the products list should be displayed in Hig to Low order")
    public void the_products_list_should_be_displayed_in_hig_to_low_order() throws InterruptedException {
        String option = products_page.activeContainerShortOption();
        Assert.assertEquals("Price (high to low)".toUpperCase(), option.toUpperCase());
        System.out.println("Test passed" + " " +  option);
    }

    @When("user click on product sort container and picks <container>")
    public void userClickOnProductSortContainerAndPicksContainer() {

    }
}
