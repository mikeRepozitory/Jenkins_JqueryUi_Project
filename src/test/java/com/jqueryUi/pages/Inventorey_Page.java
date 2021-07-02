package com.jqueryUi.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Inventorey_Page {

    @FindBy(id = "react-burger-menu-btn") WebElement burger_icon;
    @FindBy(id = "logout_sidebar_link") WebElement burger_button;

    public Inventorey_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    public void logout() throws InterruptedException {
        burger_icon.click();
        Thread.sleep(1000);
        burger_button.click();
    }



}
