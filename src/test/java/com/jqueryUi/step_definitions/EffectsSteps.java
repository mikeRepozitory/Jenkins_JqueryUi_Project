package com.jqueryUi.step_definitions;

import static com.jqueryUi.common.Hook.*;

import com.jqueryUi.pages.EffectsPage;
import io.cucumber.java.en.*;


public class EffectsSteps {

    EffectsPage effectsPage = new EffectsPage(driver);

    @Then("user selects AddClass button")
    public void user_selects_add_class_button() {
        effectsPage.addClass_link();
    }

    @Then("user click on Run Effect")
    public void user_click_on_run_effect() {
        effectsPage.addClass_runEffect();
    }

    @Then("user click ColorAnimation button")
    public void userClickColorAnimationButton() {
        effectsPage.addAnimate_link();
    }

    @When("user click on Toggle Effect")
    public void userClickOnToggleEffect() {
        effectsPage.colorAnimation_runEffect();
    }

    @Then("the color should change to {string}")
    public void theColorShouldChangeTo(String color) {
        String actualColor = effectsPage.colorAnimation_getColorAfterEffect();
        if (color.equalsIgnoreCase(actualColor)) {
            System.out.println("test passe");
        }
        System.out.println("test failed");
    }

    @Then("user click Easing button")
    public void userClickEasingButton() {
        effectsPage.easing_link();
    }

    @When("user click on linear graph the graph should close and open back")
    public void userClickOnLinearGraphTheGraphShouldCloseAndOpenBack() {
        effectsPage.easing();
    }

    @When("user click on swing graph the graph should close and open back")
    public void userClickOnSwingGraphTheGraphShouldCloseAndOpenBack() {
        effectsPage.swing();
    }

    @Then("user click Effect button")
    public void userClickEffectButton() {
        effectsPage.effect_link();
    }

    @When("user selects all the effects one by one")
    public void userSelectsAllTheEffectsOneByOne() {
        effectsPage.effectTypes_dropDow();
    }

    @And("then user runs the effects to test that there are <{int}> options")
    public void thenUserRunsTheEffectsToTestThatThereAreOptions(int options) {
        if (effectsPage.effectTypes_dropDow_verifications(options) == 15) {
            System.out.println("test passed");
        } else
            System.out.println("test failed");
    }


}
