package com.jqueryUi.step_definitions;

import static com.jqueryUi.common.Hook.*;

import com.jqueryUi.pages.Effects_MainPage;
import io.cucumber.java.en.*;


public class EffectsSteps {

    Effects_MainPage effects_mainPage = new Effects_MainPage(driver);

    @Then("user selects AddClass button")
    public void user_selects_add_class_button() {
        effects_mainPage.addClass_link();
    }

    @Then("user click on Run Effect")
    public void user_click_on_run_effect() {
        effects_mainPage.addClass_runEffect();
    }

    @Then("user click ColorAnimation button")
    public void userClickColorAnimationButton() {
        effects_mainPage.addAnimate_link();
    }

    @When("user click on Toggle Effect")
    public void userClickOnToggleEffect() {
        effects_mainPage.colorAnimation_runEffect();
    }

    @Then("the color should change to {string}")
    public void theColorShouldChangeTo(String color) {
        String actualColor = effects_mainPage.colorAnimation_getColorAfterEffect();
        if (color.equalsIgnoreCase(actualColor)) {
            System.out.println("test passe");
        }
        System.out.println("test failed");
    }

    @Then("user click Easing button")
    public void userClickEasingButton() {
        effects_mainPage.easing_link();
    }

    @When("user click on linear graph the graph should close and open back")
    public void userClickOnLinearGraphTheGraphShouldCloseAndOpenBack() {
        effects_mainPage.easing();
    }

    @When("user click on swing graph the graph should close and open back")
    public void userClickOnSwingGraphTheGraphShouldCloseAndOpenBack() {
        effects_mainPage.swing();
    }

    @Then("user click Effect button")
    public void userClickEffectButton() {
        effects_mainPage.effect_link();
    }

    @When("user selects all the effects one by one")
    public void userSelectsAllTheEffectsOneByOne() {
        effects_mainPage.effectTypes_dropDow();
    }

    @And("then user runs the effects to test that there are <{int}> options")
    public void thenUserRunsTheEffectsToTestThatThereAreOptions(int options) {
        if (effects_mainPage.effectTypes_dropDow_verifications(options) == 15) {
            System.out.println("test passed");
        } else
            System.out.println("test failed");
    }
}
