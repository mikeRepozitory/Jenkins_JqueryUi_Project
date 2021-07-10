package com.jqueryUi.step_definitions;

import static com.jqueryUi.common.Hook.*;

import com.jqueryUi.pages.UtilitiesPage;
import io.cucumber.java.en.*;


public class UtilitiesSteps {


    UtilitiesPage utilitiesPage = new UtilitiesPage(driver);

    @Then("user selects Position button")
    public void userSelectsPositionButton() {
        utilitiesPage.getPosition_link();

    }

    @Then("user selects my horizontal position {string}")
    public void userSelectsMyHorizontalPosition(String position) {
        String result = utilitiesPage.selectMyHorizontal(position);
        if (result.equalsIgnoreCase(position)) {
            System.out.println("Test passed: " + Thread.currentThread().getStackTrace()[1].getMethodName());

        }
    }

    @Then("user selects my vertical position {string}")
    public void userSelectsMyVerticalPosition(String position) {
        String result = utilitiesPage.selectMy_vertical(position);
        if (result.equalsIgnoreCase(position)) {
            System.out.println("Test passed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        }
    }

    @Then("user selects at horizontal position {string}")
    public void userSelectsAtHorizontalPosition(String position) {
        String result = utilitiesPage.selectAt_horizontal(position);
        if (result.equalsIgnoreCase(position)) {
            System.out.println("Test passed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        }
    }

    @Then("user selects at vertical position {string}")
    public void userSelectsAtVerticalPosition(String position) {
        String result = utilitiesPage.selectAt_vertical(position);
        if (result.equalsIgnoreCase(position)) {
            System.out.println("Test passed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        }
    }

    @Then("user selects collision horizontal position {string}")
    public void userSelectsCollisionHorizontalPosition(String position) {
        String result = utilitiesPage.selectCollision_horizontal(position);
        if (result.equalsIgnoreCase(position)) {
            System.out.println("Test passed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        }
    }

    @Then("user selects collision vertical position {string}")
    public void userSelectsCollisionVerticalPosition(String position) {
        String result = utilitiesPage.selectCollision_vertical(position);
        if (result.equalsIgnoreCase(position)) {
            System.out.println("Test passed: " + Thread.currentThread().getStackTrace()[1].getMethodName());
        }
    }


    @Then("user selects WidgetFactory button")
    public void userSelectsWidgetFactoryButton() {
    }

    @When("the widgetOne color should change to {string}")
    public void theWidgetOneColorShouldChangeTo(String arg0) {
    }

    @When("the widgetTwo color should change to {string}")
    public void theWidgetTwoColorShouldChangeTo(String arg0) {
    }

    @When("the widgetThree color should change to {string}")
    public void theWidgetThreeColorShouldChangeTo(String arg0) {
    }

    @When("user clicks on Toggle disabled option")
    public void userClicksOnToggleDisabledOption() {
    }

    @Then("user should not be able to change any widgets colors")
    public void userShouldNotBeAbleToChangeAnyWidgetsColors() {
    }

    @When("user clicks on go green all the squares should change to color {string}")
    public void userClicksOnGoGreenAllTheSquaresShouldChangeToColor(String arg0) {
    }
}
