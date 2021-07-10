package com.jqueryUi.pages;

import com.jqueryUi.common.Hook;
import com.jqueryUi.common.Library;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


import static com.jqueryUi.common.Hook.driver;

public class EffectsPage {

    Library library = new Library();

    public EffectsPage(WebDriver driver) {
    }




    public void addClass_link() {
        driver.findElement(By.xpath("//a[@href='https://jqueryui.com/addClass/']")).click();
    }

    public void addClass_runEffect() {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        driver.findElement(By.cssSelector(".ui-state-default.ui-corner-all")).click();
    }

    public void addAnimate_link() {
        driver.findElement(By.xpath("//a[@href='https://jqueryui.com/animate/']")).click();
    }

    public void colorAnimation_runEffect() {
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
        driver.findElement(By.cssSelector("[class='ui-state-default ui-corner-all']")).click();
    }

    public String colorAnimation_getColorAfterEffect() {
        String backgroundColor = driver
                .findElement(By.cssSelector("[style='background-color: rgb(170, 0, 0); color: rgb(255, 255, 255); width: 500px;']"))
                .getCssValue("background-color");
        System.out.println("backgroundColor: " + backgroundColor);
        return backgroundColor;
    }

    public void easing_link() {
        driver.findElement(By.xpath("//a[@href='https://jqueryui.com/easing/']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
    }

    public void easing() {
        System.out.println("getAriaRole  " + driver.findElement(By.xpath("(//div[@id='graphs']/div)[1]")).getAriaRole());
        driver.findElement(By.xpath("(//div[@id='graphs']/div)[1]")).click();
    }

    public void swing() {
        System.out.println("getAriaRole  " + driver.findElement(By.xpath("(//div[@id='graphs']/div)[2]")).getAriaRole());
        driver.findElement(By.xpath("(//div[@id='graphs']/div)[2]")).click();
        System.out.println("getAriaRole  " + driver.findElement(By.xpath("(//div[@id='graphs']/div)[3]")).getAriaRole());
        driver.findElement(By.xpath("(//div[@id='graphs']/div)[3]")).click();
    }


    public void effect_link() {
        driver.findElement(By.xpath("//a[@href='https://jqueryui.com/effect/']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
    }

    public void effectTypes_dropDow() {
        Select select = new Select(driver.findElement(By.xpath("//select[@id='effectTypes']")));

        for (int i = 0; i < select.getOptions().size(); i++) {
            select.getOptions().get(i).click();
            library.waitFor(1);
            driver.findElement(By.xpath("//button[text()='Run Effect']")).click();
            library.waitFor(1);
        }
    }

    public int effectTypes_dropDow_verifications(int optionCount) {
        Select select = new Select(driver.findElement(By.xpath("//select[@id='effectTypes']")));

        System.out.println("size: " + select.getOptions().size());
        return optionCount = select.getOptions().size();
    }



    public void getToolTip_link() {
        driver.findElement(By.xpath("//a[@href='https://jqueryui.com/effect/']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
    }

}


//int xOffset, int yOffset



