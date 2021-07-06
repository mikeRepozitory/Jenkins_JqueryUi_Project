package com.jqueryUi.step_definitions;

import com.jqueryUi.pages.MainPage_JqueryUi;
import io.cucumber.java.en.*;
import org.testng.Assert;

import static com.jqueryUi.base.Hook.*;

public class Widgets_Steps {

    MainPage_JqueryUi mainPage_jqueryUi = new MainPage_JqueryUi(driver);

    @Then("user selects Accordion button")
    public void user_selects_accordion_button() {
        mainPage_jqueryUi.setAccordion_link();
    }

    @Then("user click on Accordion Sections one by one all {int} elements")
    public void user_click_on_accordion_sections_one_by_one_all_elements(Integer int1) {
        mainPage_jqueryUi.selectAllAccordionWidgets_Items();
    }

    @Then("user selects Autocomplete button")
    public void userSelectsAutocompleteButton() {
        mainPage_jqueryUi.setAutocomplete_link();
    }

    @Then("user click on search and types {string}")
    public void userClickOnSearchAndTypes(String keysToSend) {
        mainPage_jqueryUi.sendKeysToAutocomplete_searchBox(keysToSend);
    }

    @Then("user should be able to select {string} from the suggested options")
    public void userShouldBeAbleToSelectFromTheSuggestedOptions(String actual) {
        mainPage_jqueryUi.assertionEqualsMethod(actual, "Java");
    }

    @Then("user selects Button Widgets")
    public void userSelectsButtonWidgets() {
        mainPage_jqueryUi.setButton_link();
    }

    @Then("clicking all the available Buttons")
    public void clickingAllTheAvailableButtons() {
        mainPage_jqueryUi.selectAllButtons();
    }

    @Then("user selects Checkboxradio Widgets")
    public void userSelectsCheckboxradioWidgets() {
        mainPage_jqueryUi.setCheckboxradio_link();
    }

    @Then("clicking all the available Checkboxradio")
    public void clickingAllTheAvailableCheckboxradio() {
        mainPage_jqueryUi.selectCheckboxRadio_Options();
    }

    @Then("user selects Controlgroup Widget")
    public void userSelectsControlgroupWidget() {
        mainPage_jqueryUi.setControlGroup_link();
    }

    @Then("user selects car type Full size car")
    public void userSelectsCarTypeFullSizeCar() {
        mainPage_jqueryUi.selectControlGroupCar_Options();


    }


    @Then("user selects type {string} car")
    public void userSelectsTypeCar(String actual) {
        Assert.assertEquals(mainPage_jqueryUi.rentalCar_Option_AddAutomatic(actual), "Automatic");

    }


    @Then("user add {string} to the rental")
    public void userAddToTheRental(String actual) {
        Assert.assertEquals(mainPage_jqueryUi.rentalCar_Option_AddInsurance(actual), "Insurance");
    }


    @Then("user selects {string} vehicle and clicks on Book now")
    public void userSelectsVehicleAndClicksOnBookNow(String numberOfCars) {
        String numberOfCarsAdded = mainPage_jqueryUi.rentalCar_Option_AddNumberOfCars(numberOfCars.toString());
       /* System.out.println("numberOfCarsAdded:  "+numberOfCarsAdded.toString());
        Assert.assertEquals(numberOfCarsAdded, "1");*/

    }

    @Then("user selects Datepicker Widget")
    public void userSelectsDatepickerWidget() {
        mainPage_jqueryUi.setDatePicker_link();
    }

    @Then("user clicks on date picker and selects  July first and  verifies that the correct data is {string}")
    public void userClicksOnDatePickerAndSelectsJulyFirstAndVerifiesThatTheCorrectDataIs(String actualDate) {
        mainPage_jqueryUi.sendDateTo_DatePicker();
       // Assert.assertEquals(actualDate, mainPage_jqueryUi.sendDateTo_DatePicker());
    }



    @Then("user selects Dialog Widget")
    public void userSelectsDialogWidget() {
    }

    @Then("user moves Dialog box around")
    public void userMovesDialogBoxAround() {
    }

    @Then("user resizes the box")
    public void userResizesTheBox() {
    }

    @Then("user closes the box by clicking X")
    public void userClosesTheBoxByClickingX() {
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
