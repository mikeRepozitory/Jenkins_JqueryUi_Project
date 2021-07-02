package com.jqueryUi.step_definitions;

import com.jqueryUi.pages.Inventorey_Page;
import com.jqueryUi.pages.Login_Page;
import io.cucumber.java.en.*;
import org.testng.Assert;

import static com.jqueryUi.base.Hook.driver;


public class Logout_Steps {
    Login_Page login_page = new Login_Page(driver);
    Inventorey_Page inventorey_page = new Inventorey_Page(driver);

    @Given("user should be login")
    public void userShouldBeLogin() {
        login_page.login("standard_user", "secret_sauce");
    }

    @When("user logs out")
    public void userLogsOut() throws InterruptedException {
        inventorey_page.logout();
    }

    @And("system should return to log in page")
    public void systemShouldReturnToLogInPage() {
        boolean isRedirectedToLoginPage = login_page.isLoginPageDisplayed();
        Assert.assertTrue(isRedirectedToLoginPage);
    }
}
