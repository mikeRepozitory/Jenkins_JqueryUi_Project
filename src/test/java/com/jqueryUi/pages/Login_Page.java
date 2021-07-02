package com.jqueryUi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page  {
    public Login_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    WebDriver driver;
    @FindBy(id = "user-name")
    WebElement userName_testBox;
    @FindBy(id = "password")
    WebElement userPassword_testBox;

    @FindBy(id = "login-button")
    WebElement login_button;

    @FindBy(className = "title")
    WebElement HeaderTitle;

    @FindBy(xpath = "//div[@class='error-message-container error']")
    WebElement errorMessage;

    @FindBy(className = "title")
    WebElement loginPage;


    public void login(String userName, String userPassword) {
        userName_testBox.sendKeys(userName);
        userPassword_testBox.sendKeys(userPassword);
        login_button.click();
    }

    public boolean verifyLogin() {
        return HeaderTitle.isEnabled();
    }

    public boolean errorMessageIsDisplayed() {
        return errorMessage.isEnabled();
    }

    public boolean isLoginPageDisplayed() {
        return loginPage.isDisplayed();
    }
}
