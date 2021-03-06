package com.jqueryUi.pages;

import com.jqueryUi.common.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class InteractionsPage {

    Library library = new Library();

    public InteractionsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@href='https://jqueryui.com/draggable/']")
    WebElement draggable_link;
    @FindBy(xpath = "//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")
    WebElement Draggable_hox;
    @FindBy(xpath = "//iframe[@class='demo-frame']")
    WebElement demo_iframe;

    @FindBy(xpath = "//a[@href='https://jqueryui.com/droppable/']")
    WebElement droppable_link;
    @FindBy(xpath = "//div[@class='ui-widget-content ui-draggable ui-draggable-handle']")
    WebElement droppable_source;
    @FindBy(xpath = "//div[@class='ui-widget-header ui-droppable']")
    WebElement droppable_target;

    @FindBy(xpath = "//a[@href='https://jqueryui.com/resizable/']")
    WebElement resizable_link;
    @FindBy(xpath = "//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']")
    WebElement resizable_icone;

    @FindBy(xpath = "//a[@href='https://jqueryui.com/selectable/']")
    WebElement selectable_link;
    @FindBy(xpath = "(//ol[@class='ui-selectable']/li)[1]")
    WebElement selectable_item_1k;
    @FindBy(xpath = "//ol[@class='ui-selectable']/li")
    List<WebElement> selectable_AllItems;

    @FindBy(xpath = "//a[@href='https://jqueryui.com/sortable/']")
    WebElement sortable_link;
    @FindBy(xpath = "(//ul[@class='ui-sortable'])/li[1]")
    WebElement sortable_element;




    public void setDraggable_link() {
        draggable_link.click();
    }

    public void draggable_box_move(int xOffset, int yOffset) {
        library.switchToIFrame(demo_iframe);
        library.actions().dragAndDropBy(Draggable_hox, xOffset, yOffset).build().perform();
    }

    public void setDroppable_link() {
        droppable_link.click();
    }

    public void droppable_box_move() {
        library.switchToIFrame(demo_iframe);
        library.actions().dragAndDrop(droppable_source, droppable_target).build().perform();
    }

    public void setResizable_link() {
        resizable_link.click();
    }

    public void resizable_box_move(int xOffset, int yOffset) {
        library.switchToIFrame(demo_iframe);
        library.actions().dragAndDropBy(resizable_icone, xOffset, yOffset).build().perform();
        library.switchToDefaultContent();
    }

    //needs improvement
    public void setSelectable_link() {
        selectable_link.click();
    }

    public void selectOneSelectable_Item() {
        library.switchToIFrame(demo_iframe);
        selectable_item_1k.click();
    }

    public void selectAllSelectable_Items() {
        //   library.switchToIFrame(demo_iframe);
        //   selectable_item_1k.sendKeys(Keys.CONTROL);
        for (WebElement element : selectable_AllItems) {
            element.click();
            library.waitFor(1);
        }
    }

    public void setSortable_link() {
        sortable_link.click();
    }

    public void selectOneSortable_Item(int xOffset, int yOffset) {
        library.switchToIFrame(demo_iframe);
        library.actions().dragAndDropBy(sortable_element, xOffset, yOffset).build().perform();
        library.switchToDefaultContent();
    }



}







 /*   public boolean verifyLogin() {
        return HeaderTitle.isEnabled();
    }

    public boolean errorMessageIsDisplayed() {
        return errorMessage.isEnabled();
    }

    public boolean isLoginPageDisplayed() {
        return loginPage.isDisplayed();
    }*/
