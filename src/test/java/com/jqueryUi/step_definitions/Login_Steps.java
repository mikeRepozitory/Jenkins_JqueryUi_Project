package com.jqueryUi.step_definitions;

import com.jqueryUi.pages.Login_Page;
import io.cucumber.java.en.*;
import org.testng.Assert;

import static com.jqueryUi.base.Hook.driver;


public class Login_Steps {

    Login_Page login_page = new Login_Page(driver);

    @Given("user enters valid credentials")
    public void user_enters_valid_credentials() {
        login_page.login("standard_user", "secret_sauce");
    }

    @Given("user enters invalid credentials")
    public void user_enters_invalid_credentials() {
        login_page.login("Test", "test");
    }

    @Then("system should log in")
    public void system_should_log_in() {
        boolean isLoggedIn = login_page.verifyLogin();
        Assert.assertTrue(isLoggedIn);
    }

    @Then("system should not log in")
    public void system_should_not_log_in() {
        Assert.assertTrue(login_page.errorMessageIsDisplayed());
    }


}
