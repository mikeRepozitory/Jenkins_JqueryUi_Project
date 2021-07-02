package com.jqueryUi.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.jqueryUi.base.Hook;

import java.util.List;

public class Products_page {

    @FindBy(xpath = "//button[@class='btn btn_primary btn_small btn_inventory']") List<WebElement> addToCart_buttons;
    @FindBy(xpath = "//select[@class='product_sort_container']") WebElement select_product_sort_containerOption;
    @FindBy(className = "shopping_cart_badge") WebElement shoppingCart_badge;
    @FindBy(xpath = "//*[contains(text(), 'Sauce Labs Backpack')]") WebElement displayedItem;
    @FindBy(xpath = "//span[@class='active_option']") WebElement product_sort_container;
    @FindBy(xpath = "//span[@class='select_container']/span") WebElement activeContainerSortingOption;

    Actions actions = new Actions(Hook.driver);

    public int getAddToCart_buttons() {
        return addToCart_buttons.size();
    }

    public Products_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    public void sortProductBy(String sortBy) {
        actions.moveToElement(product_sort_container).click().build().perform();
        Select select = new Select(select_product_sort_containerOption);
        select.selectByVisibleText(sortBy);
    }

    public int addAllItems()  {
        int count = 0;
        for (WebElement btn : addToCart_buttons) {
            btn.click();
            count++;
        }
        return count;
    }

    public String activeContainerShortOption()  {
        return activeContainerSortingOption.getText();
    }

    public void setAddToCart_buttons(List<WebElement> addToCart_buttons) {
        this.addToCart_buttons = addToCart_buttons;
    }

    private int getShoppingCartNumber() {
        return Integer.parseInt(shoppingCart_badge.getText());
    }

    public boolean isItemVisible(String ItemName) {
        return displayedItem.isEnabled();
    }



     /*   public void sortProductHighToLow() {
           actions.moveToElement(product_sort_container).click().build().perform();
           Select select = new Select(select_product_sort_containerOption);
           select.selectByVisibleText("Price (high to low)");
       }*/
    /*   public void sortProductAtoZ() {
           actions.moveToElement(product_sort_container).click().build().perform();
           Select select = new Select(select_product_sort_containerOption);
           select.selectByVisibleText("Name (A to Z)");
       }


       public void sortProductZtoA() {
           actions.moveToElement(product_sort_container).click().build().perform();
           Select select = new Select(select_product_sort_containerOption);
           select.selectByVisibleText("Name (Z to A)");
       }*/

}
