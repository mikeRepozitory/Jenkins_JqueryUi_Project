package com.jqueryUi.step_definitions;

import com.jqueryUi.pages.Widgets_MainPage;
import io.cucumber.java.en.*;
import org.testng.Assert;

import static com.jqueryUi.common.Hook.*;

public class Widgets_Steps {

    Widgets_MainPage widgets_mainPage = new Widgets_MainPage(driver);

    @Then("user selects Accordion button")
    public void user_selects_accordion_button() {
        widgets_mainPage.setAccordion_link();
    }

    @Then("user click on Accordion Sections one by one all {int} elements")
    public void user_click_on_accordion_sections_one_by_one_all_elements(Integer int1) {
        widgets_mainPage.selectAllAccordionWidgets_Items();
    }

    @Then("user selects Autocomplete button")
    public void userSelectsAutocompleteButton() {
        widgets_mainPage.setAutocomplete_link();
    }

    @Then("user click on search and types {string}")
    public void userClickOnSearchAndTypes(String keysToSend) {
        widgets_mainPage.sendKeysToAutocomplete_searchBox(keysToSend);
    }

    @Then("user should be able to select {string} from the suggested options")
    public void userShouldBeAbleToSelectFromTheSuggestedOptions(String actual) {
        widgets_mainPage.assertionEqualsMethod(actual, "Java");
    }

    @Then("user selects Button Widgets")
    public void userSelectsButtonWidgets() {
        widgets_mainPage.setButton_link();
    }

    @Then("clicking all the available Buttons")
    public void clickingAllTheAvailableButtons() {
        widgets_mainPage.selectAllButtons();
    }

    @Then("user selects Checkboxradio Widgets")
    public void userSelectsCheckboxradioWidgets() {
        widgets_mainPage.setCheckboxradio_link();
    }

    @Then("clicking all the available Checkboxradio")
    public void clickingAllTheAvailableCheckboxradio() {
        widgets_mainPage.selectCheckboxRadio_Options();
    }

    @Then("user selects Controlgroup Widget")
    public void userSelectsControlgroupWidget() {
        widgets_mainPage.setControlGroup_link();
    }

    @Then("user selects car type Full size car")
    public void userSelectsCarTypeFullSizeCar() {
        widgets_mainPage.selectControlGroupCar_Options();

    }

    @Then("user selects type {string} car")
    public void userSelectsTypeCar(String actual) {
        Assert.assertEquals(widgets_mainPage.rentalCar_Option_AddAutomatic(actual), "Automatic");
    }


    @Then("user add {string} to the rental")
    public void userAddToTheRental(String actual) {
        Assert.assertEquals(widgets_mainPage.rentalCar_Option_AddInsurance(actual), "Insurance");
    }


    @Then("user selects {string} vehicle and clicks on Book now")
    public void userSelectsVehicleAndClicksOnBookNow(String numberOfCars) {
        String numberOfCarsAdded = widgets_mainPage.rentalCar_Option_AddNumberOfCars(numberOfCars.toString());
       /* System.out.println("numberOfCarsAdded:  "+numberOfCarsAdded.toString());
        Assert.assertEquals(numberOfCarsAdded, "1");*/
    }
    @Then("user selects Datepicker Widget")
    public void userSelectsDatepickerWidget() {
        widgets_mainPage.setDatePicker_link();
    }

    @Then("user clicks on date picker and selects  July first and  verifies that the correct data is {string}")
    public void userClicksOnDatePickerAndSelectsJulyFirstAndVerifiesThatTheCorrectDataIs(String actualDate) {
        widgets_mainPage.sendDateTo_DatePicker();
        // Assert.assertEquals(actualDate, mainPage_jqueryUi.sendDateTo_DatePicker());
    }

    @Then("user selects Dialog Widget")
    public void userSelectsDialogWidget() {
        widgets_mainPage.setDialog_link();
    }

    @Then("user moves Dialog box around")
    public void userMovesDialogBoxAround() {
        widgets_mainPage.moveDialog_boxAround(-20, 30);
    }

    @Then("user resizes the box")
    public void userResizesTheBox() {
        widgets_mainPage.resizeDialog_box(20, 20);
    }

    @Then("user closes the box by clicking X")
    public void userClosesTheBoxByClickingX() {
        Boolean isCloseButtonDisplayed = widgets_mainPage.closeDialog_box();
        Assert.assertTrue(isCloseButtonDisplayed);
    }


    @Then("user selects Menu Widget")
    public void userSelectsMenuWidget() {
    }

    @Then("user hover over the music menu")
    public void userHoverOverTheMusicMenu() {
    }

    @Then("user hover over Rock")
    public void userHoverOverRock() {
    }

    @Then("user hover over classic and clicks on it")
    public void userHoverOverClassicAndClicksOnIt() {
    }

    @Then("user selects Progressbar Widget then selects Indeterminate Value")
    public void userSelectsProgressbarWidgetThenSelectsIndeterminateValue() {
    }

    @Then("user clicks on Random Value - Determinate couple times make sure works")
    public void userClicksOnRandomValueDeterminateCoupleTimesMakeSureWorks() {
    }

    @Then("user clicks on Indeterminate {int} time make sure ir works")
    public void userClicksOnIndeterminateTimeMakeSureIrWorks(int arg0) {
    }

    @Then("user clicks on Random Color couple times make sure works")
    public void userClicksOnRandomColorCoupleTimesMakeSureWorks() {
    }

    @Then("user selects SelectMenu Widget")
    public void userSelectsSelectMenuWidget() {
    }

    @Then("user click on Select a speed and select {string}")
    public void userClickOnSelectASpeedAndSelect(String arg0) {
    }

    @And("user click on Select a file and select {string}")
    public void userClickOnSelectAFileAndSelect(String arg0) {
    }

    @And("user click on Select a number and select {string}")
    public void userClickOnSelectANumberAndSelect(String arg0) {
    }

    @And("user click on Select a title and select {string}")
    public void userClickOnSelectATitleAndSelect(String arg0) {
    }

    @Then("user verifies that all selected options are displayed")
    public void userVerifiesThatAllSelectedOptionsAreDisplayed() {
    }


    @Then("user selects Slider Widget")
    public void userSelectsSliderWidget() {
    }

    @Then("user click on Slider handle and move it to the right and back to the left")
    public void userClickOnSliderHandleAndMoveItToTheRightAndBackToTheLeft() {
    }

    @Then("user selects Spinner Widget")
    public void userSelectsSpinnerWidget() {
    }

    @Then("user click on Select a value and types {string}")
    public void userClickOnSelectAValueAndTypes(String arg0) {
    }

    @And("user clicks on Toggle disable enable button twice")
    public void userClicksOnToggleDisableEnableButtonTwice() {
    }

    @And("user clicks on Toggle widget button twice")
    public void userClicksOnToggleWidgetButtonTwice() {
    }

    @And("user clicks on Set value to {int} ones")
    public void userClicksOnSetValueToOnes(int arg0) {
    }

    @Then("user clicks on Get value")
    public void userClicksOnGetValue() {
    }

    @Then("the pop box should display number {string}")
    public void thePopBoxShouldDisplayNumber(String arg0) {
    }


    @Then("user selects Tabs Widget")
    public void userSelectsTabsWidget() {
    }

    @Then("user click on every tab")
    public void userClickOnEveryTab() {
    }

    @And("Tabs should work property")
    public void tabsShouldWorkProperty() {
    }

    @Then("user selects Tooltip Widget")
    public void userSelectsTooltipWidget() {
    }

    @Then("user click on every avalable tab")
    public void userClickOnEveryAvalableTab() {
    }

    @And("Tooltip should work property")
    public void tooltipShouldWorkProperty() {
    }


}
