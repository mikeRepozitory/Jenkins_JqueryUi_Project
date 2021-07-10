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

public class UtilitiesPage {

    Library library = new Library();

    public UtilitiesPage(WebDriver driver) {
    }

    public void getPosition_link() {
        library.find(By.xpath("//a[@href='https://jqueryui.com/position/']")).click();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
    }


    public String selectMyHorizontal(String position) {
        Select select_horizontal = new Select(library.find(By.xpath("//select[@id='my_horizontal']")));
        for (int i = 0; i < select_horizontal.getOptions().size(); i++) {
            if (select_horizontal.getOptions().get(i).getText().equalsIgnoreCase(position)) {
                select_horizontal.getOptions().get(i).click();
            }
        }
        return position;
    }

    public String selectMy_vertical(String position) {
        Select select_vertical = new Select(library.find(By.xpath("//select[@id='my_vertical']")));
        for (int i = 0; i < select_vertical.getOptions().size(); i++) {
            if (select_vertical.getOptions().get(i).getText().equalsIgnoreCase(position)) {
                select_vertical.getOptions().get(i).click();
            }
        }
        return position;
    }

    public String selectAt_horizontal(String position) {
        Select select_fit = new Select(library.find(By.xpath("//select[@id='at_horizontal']")));
        for (int i = 0; i < select_fit.getOptions().size(); i++) {
            if (select_fit.getOptions().get(i).getText().equalsIgnoreCase(position)) {
                select_fit.getOptions().get(i).click();
            }
        }
        return position;
    }

    public String selectAt_vertical(String position) {
        Select select_atVertical = new Select(library.find(By.xpath("//select[@id='at_vertical']")));
        for (int i = 0; i < select_atVertical.getOptions().size(); i++) {
            if (select_atVertical.getOptions().get(i).getText().equalsIgnoreCase(position)) {
                select_atVertical.getOptions().get(i).click();
            }
        }
        return position;
    }

    public String selectCollision_horizontal(String position) {
        Select select_collision_horizontal = new Select(library.find(By.xpath("//select[@id='collision_horizontal']")));
        for (int i = 0; i < select_collision_horizontal.getOptions().size(); i++) {
            if (select_collision_horizontal.getOptions().get(i).getText().equalsIgnoreCase("fit")) {
                select_collision_horizontal.getOptions().get(i).click();
            }
        }
        return position;
    }

    public String selectCollision_vertical(String position) {
        Select select_collision_vertical = new Select(library.find(By.xpath("//select[@id='collision_vertical']")));
        for (int i = 0; i < select_collision_vertical.getOptions().size(); i++) {
            if (select_collision_vertical.getOptions().get(i).getText().equalsIgnoreCase("fit")) {
                select_collision_vertical.getOptions().get(i).click();
            }
        }
        return position;
    }






}

