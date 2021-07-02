package com.jqueryUi.base;

import com.jqueryUi.helper.WebDriver_Factory;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hook {
    public static WebDriver driver;


    @Before
    public void beforeEachScenario() {
        driver = WebDriver_Factory.createWebdriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://www.saucedemo.com/");
    }

    @After
    public void afterEachScenario() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
