package com.jqueryUi.pages;

import com.jqueryUi.common.Library;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static com.jqueryUi.base.Hook.*;

import java.util.List;

public class MainPage_JqueryUi {

    Actions actions = new Actions(driver);
    Library library = new Library();

    public MainPage_JqueryUi(WebDriver driver) {
        System.out.println("in main page constructor");
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

    @FindBy(xpath = "//a[@href='https://jqueryui.com/accordion/']")
    WebElement accordion_link;
    @FindBy(xpath = "//div[@id='accordion']/h3")
    List<WebElement> accordion_AllWidgets;

    @FindBy(xpath = "//a[@href='https://jqueryui.com/autocomplete/']")
    WebElement autocomplete_link;
    @FindBy(id = "tags")
    WebElement autocomplete_searchBox;

    @FindBy(xpath = "//a[@href='https://jqueryui.com/button/']")
    WebElement button_link;
    @FindBy(xpath = "//button[@class='ui-button ui-corner-all ui-widget']")
    WebElement aButton_Element;
    @FindBy(xpath = "//input[@class='ui-button ui-corner-all ui-widget']")
    WebElement aSubmit_Button;
    @FindBy(xpath = "//a[@class='ui-button ui-corner-all ui-widget']")
    WebElement anAnchor_Button;
    @FindBy(xpath = "//button[@class='ui-button ui-widget ui-corner-all']")
    WebElement aButton_Element_2;
    @FindBy(xpath = "//input[@class='ui-button ui-widget ui-corner-all']")
    WebElement aSubmit_Button_2;
    @FindBy(xpath = "//a[@class='ui-button ui-widget ui-corner-all']")
    WebElement anAnchor_Button_2;

    @FindBy(xpath = "//a[@href='https://jqueryui.com/checkboxradio/']")
    WebElement checkboxradio_link;
    @FindBy(xpath = "//div[@class='widget']/fieldset/label")
    List<WebElement> allCheckboxradio;


    @FindBy(xpath = "//a[@href='https://jqueryui.com/controlgroup/']")
    WebElement controlgroup_link;
    // @FindBy(xpath = "(//div[@class='widget']/fieldset)[1]/div/select") WebElement rentalCarSelect_Type;
    @FindBy(xpath = "(//span[@class='ui-selectmenu-text'])[1]")
    WebElement rentalCarSelect_dropDown;
    @FindBy(xpath = "(//div[@class='ui-menu-item-wrapper'])[2]")
    WebElement RentalCar_Option_FullSize;
    @FindBy(xpath = "(//div[@class='controlgroup ui-controlgroup ui-controlgroup-horizontal ui-helper-clearfix']/label)[2]")
    WebElement rentalCar_Option_Automatic;
    @FindBy(xpath = "(//div[@class='controlgroup ui-controlgroup ui-controlgroup-horizontal ui-helper-clearfix']/label)[3]")
    WebElement rentalCar_Option_Insurance_RadioBox;
    @FindBy(xpath = "(//input[@class='ui-spinner-input'])[1]")
    WebElement rentalCar_Option_NumberOfCars_Box;
    @FindBy(xpath = "//button[@class='ui-widget ui-controlgroup-item ui-button ui-corner-right']")
    WebElement submitButton;


    @FindBy(xpath = "//a[@href='https://jqueryui.com/datepicker/']")
    WebElement datePicker_link;
    @FindBy(id = "datepicker")
    WebElement datePicker;


    public void setDraggable_link() {
        draggable_link.click();
    }

    public void draggable_box_move(int xOffset, int yOffset) {
        library.switchToIFrame(demo_iframe);
        actions.dragAndDropBy(Draggable_hox, xOffset, yOffset).build().perform();
    }

    public void setDroppable_link() {
        droppable_link.click();
    }

    public void droppable_box_move() {
        library.switchToIFrame(demo_iframe);
        actions.dragAndDrop(droppable_source, droppable_target).build().perform();
    }

    public void setResizable_link() {
        resizable_link.click();
    }

    public void resizable_box_move(int xOffset, int yOffset) {
        library.switchToIFrame(demo_iframe);
        actions.dragAndDropBy(resizable_icone, xOffset, yOffset).build().perform();
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

    public void setAccordion_link() {
        accordion_link.click();
    }

    public void selectAllAccordionWidgets_Items() {
        //   library.switchToIFrame(demo_iframe);
        //   selectable_item_1k.sendKeys(Keys.CONTROL);
        library.switchToIFrame(demo_iframe);
        for (WebElement element : accordion_AllWidgets) {
            element.click();
            library.waitFor(1);
        }
    }

    public void setAutocomplete_link() {
        autocomplete_link.click();
    }

    public void sendKeysToAutocomplete_searchBox(String keysToSend) {
        library.switchToIFrame(demo_iframe);
        autocomplete_searchBox.sendKeys(keysToSend);
        autocomplete_searchBox.sendKeys(Keys.ARROW_DOWN.ENTER);
    }

    public void assertionEqualsMethod(String actual, String expected) {
        Assert.assertEquals(actual, expected);
        System.out.println("Test passed: " + actual + "  =  " + expected);
    }

    public void setButton_link() {
        button_link.click();
    }

    public void selectAllButtons() {
        library.switchToIFrame(demo_iframe);
        aButton_Element.click();
        aSubmit_Button.click();
        anAnchor_Button.click();
        aButton_Element_2.click();
        aSubmit_Button_2.click();
        anAnchor_Button_2.click();
    }

    public void setCheckboxradio_link() {
        checkboxradio_link.click();
    }

    public void selectCheckboxRadio_Options() {
        library.switchToIFrame(demo_iframe);

        for (WebElement element : allCheckboxradio) {
            if (element.getText().equalsIgnoreCase("London")) {
                element.click();
                System.out.println("Clicked on element:" + element.getText().toString());
            }
        }

        for (WebElement element : allCheckboxradio) {
            if (element.getText().equalsIgnoreCase("5 Star")) {
                element.click();
                System.out.println("Clicked on element:" + element.getText().toString());
            }
        }

        for (WebElement element : allCheckboxradio) {
            if (element.getText().equalsIgnoreCase("1 King")) {
                element.click();
                System.out.println("Clicked on element:" + element.getText().toString());
            }
        }

    }

    public void setControlGroup_link() {
        controlgroup_link.click();
    }

    public void selectControlGroupCar_Options() {
        library.switchToIFrame(demo_iframe);


  /*      Select select = new Select(driver
  .findElement(By.xpath("(//div[@class='widget']/fieldset)[1]/div/select")));
        select.getAllSelectedOptions().`
// library.selectDropDownByVisibleText(visibleText,By.xpath("//select[@id='car-type']"));
 library.waitFor(5);*/
        library.actions().moveToElement(rentalCarSelect_dropDown)
                .click()
                .moveToElement(RentalCar_Option_FullSize)
                .click()
                .build()
                .perform();
    }


    public String rentalCar_Option_AddAutomatic(String rentalCar_Actual_Option) {
        rentalCar_Option_Automatic.click();
        rentalCar_Actual_Option = rentalCar_Option_Automatic.getText().toString();
        System.out.println("rentalCar_Actual_Option added: " + rentalCar_Actual_Option);
        return rentalCar_Actual_Option;
    }


    public String rentalCar_Option_AddInsurance(String rentalCar_Actual_Option) {
        rentalCar_Option_Insurance_RadioBox.click();
        rentalCar_Actual_Option = rentalCar_Option_Insurance_RadioBox.getText().toString();
        System.out.println("rentalCar_Actual_Option added: " + rentalCar_Actual_Option);
        return rentalCar_Actual_Option;
    }


    public String rentalCar_Option_AddNumberOfCars(String numberOfCarsToBeAdded) {
        rentalCar_Option_NumberOfCars_Box.sendKeys(numberOfCarsToBeAdded);
        submitButton.click();
        numberOfCarsToBeAdded = rentalCar_Option_NumberOfCars_Box.getText().toString();
        System.out.println("rentalCar_Actual_Option added: " + numberOfCarsToBeAdded);

        return numberOfCarsToBeAdded;
    }


    public void setDatePicker_link() {
        datePicker_link.click();
    }

    public String sendDateTo_DatePicker() {
        library.switchToIFrame(demo_iframe);
        datePicker.sendKeys("07/01/2021",Keys.ENTER);
  return   datePicker.getText();
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
