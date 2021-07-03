package com.jqueryUi.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/jqueryUi"},
        dryRun = false,
        tags = ("@Widgets")
)
public class TestRunner extends AbstractTestNGCucumberTests {

    //h2[contains(text(),'A few of our most popular courses')]
//*[contains(text(), 'Sauce Labs Backpack')]
}

