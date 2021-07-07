package com.jqueryUi.base;

import com.jqueryUi.helper.WebDriver_Factory;
import io.cucumber.java.*;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class Hook {

    public static WebDriver driver;

    @Before
    public void beforeEachScenario() {
        System.out.println("BEFORE SCENARIO");
        driver = WebDriver_Factory.createWebDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.get("https://jqueryui.com//");
    }

    @After
    public void afterEachScenario() throws InterruptedException {
        System.out.println("After SCENARIO");
        Thread.sleep(2000);
        driver.quit();
    }
}
