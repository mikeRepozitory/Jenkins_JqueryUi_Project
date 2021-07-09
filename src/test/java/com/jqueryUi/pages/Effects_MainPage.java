package com.jqueryUi.pages;

import com.jqueryUi.common.Library;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Effects_MainPage {

    Library library = new Library();

    public Effects_MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Effects_MainPage() {
    }

    @FindBy(xpath = "//iframe[@class='demo-frame']")
    WebElement demo_iframe;
    @FindBy(xpath = "//a[@href='https://jqueryui.com/addClass/']")
    WebElement addClass_link;
    @FindBy(css = ".ui-state-default.ui-corner-all")
    WebElement runEffect_button;
    @FindBy(xpath = "//a[@href='https://jqueryui.com/animate/']")
    WebElement animate_link;
    @FindBy(css = "[class='ui-state-default ui-corner-all']")
    WebElement toggleEffect_button;
    @FindBy(css = "[style='background-color: rgb(170, 0, 0); color: rgb(255, 255, 255); width: 500px;']")
    WebElement colorAnimate_backgroundColor;

    @FindBy(xpath = "//a[@href='https://jqueryui.com/easing/']")
    WebElement easing_link;
    @FindBy(xpath = "(//div[@id='graphs']/div)[1]")
    WebElement linear_widget;
    @FindBy(xpath = "(//div[@id='graphs']/div)[2]")
    WebElement swing_widget;
    @FindBy(xpath = "(//div[@id='graphs']/div)[3]")
    WebElement default_widget;

    @FindBy(xpath = "//a[@href='https://jqueryui.com/effect/']")
    WebElement effect_link;
    @FindBy(xpath = "//select[@id='effectTypes']")
    WebElement effectTypes_dropDow;
    @FindBy(xpath = "//button[text()='Run Effect']")
    WebElement runEffect_dropDownButton;
    Select select = new Select(effectTypes_dropDow);


    public void addClass_link() {
        addClass_link.click();
    }

    public void addClass_runEffect() {
        library.switchToIFrame(demo_iframe);
        runEffect_button.click();
    }

    public void addAnimate_link() {
        animate_link.click();
    }

    public void colorAnimation_runEffect() {
        library.switchToIFrame(demo_iframe);
        toggleEffect_button.click();
    }

    public String colorAnimation_getColorAfterEffect() {
        String backgroundColor = colorAnimate_backgroundColor.getCssValue("background-color");
        System.out.println("backgroundColor: " + backgroundColor);
        return backgroundColor;
    }

    public void easing_link() {
        easing_link.click();
        library.switchToIFrame(demo_iframe);
    }

    public void easing() {
        linear_widget.click();
        System.out.println("getAriaRole  " + linear_widget.getAriaRole());
    }

    public void swing() {
        swing_widget.click();
        System.out.println("getAriaRole  " + swing_widget.getAriaRole());
        System.out.println("default_widget getAccessibleName  " + default_widget.getAriaRole());
    }


    public void effect_link() {
        effect_link.click();
        library.switchToIFrame(demo_iframe);
    }

    public void effectTypes_dropDow() {
        for (int i = 0; i < select.getOptions().size(); i++) {
            select.getOptions().get(i).click();
            library.waitFor(1);
            runEffect_dropDownButton.click();
            library.waitFor(1);
        }
    }

    public int effectTypes_dropDow_verifications(int optionCount) {
        System.out.println("size: " + select.getOptions().size());
        return optionCount = select.getOptions().size();
    }


}


//int xOffset, int yOffset



