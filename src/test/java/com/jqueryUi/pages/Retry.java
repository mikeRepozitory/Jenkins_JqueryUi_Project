package com.jqueryUi.pages;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer {

    @Override
    public boolean retry(ITestResult result) {
        return false;
    }

}
