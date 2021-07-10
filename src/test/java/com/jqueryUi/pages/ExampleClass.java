package com.jqueryUi.pages;

import com.jqueryUi.common.Library;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.awt.*;
import java.io.File;
import java.util.List;

public class ExampleClass {

    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("Path to CRX File"));
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        WebDriver driver = new ChromeDriver(capabilities);


        WebDriverWait wait = new WebDriverWait(driver, 10);
        FluentWait fluentWait = new FluentWait(driver);
        fluentWait.wait(6);

        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        WebElement element = driver.findElement(By.cssSelector(".gLFyf.gsfi"));
        element.sendKeys("selenium grid was developed");
        element.sendKeys(Keys.ENTER);
        String elementName = driver.findElement(By.cssSelector(".Z0LcW.XcVN5d.AZCkJd.d2J77b")).getText();
        List<WebElement> elementsName = driver.findElements(By.xpath("//a"));
        int numbeOfLinks = elementsName.size();
        Actions actions = new Actions(driver);

        System.out.println("numbeOfLinks:  " + numbeOfLinks);
        System.out.println(elementName);


        Robot robot = new Robot();

        TakesScreenshot takesScreenshot = new TakesScreenshot() {

            @Override
            public <X> X getScreenshotAs(OutputType<X> target) throws WebDriverException {
                return null;
            }
        };
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.schrollBy()0.250", "");

        Library library = new Library();
        library.waitFor(4);
        driver.quit();
    }


    @DataProvider (name="data-provider")
    @Test( enabled = false , groups = "smoketest", dependsOnMethods = {"main", "hello"}, priority = 2 )
    public Object[][] exemples() {

        WebDriver driver1 = new HtmlUnitDriver();
        driver1.get("https://www.facebook.com/");
        ITestListener iTestListener = new ITestListener() {
            @Override
            public void onTestStart(ITestResult result) {
                System.out.println(result.getStatus());
            }

            @Override
            public void onTestSuccess(ITestResult result) {

            }

            @Override
            public void onTestFailure(ITestResult result) {

            }

            @Override
            public void onTestSkipped(ITestResult result) {

            }

            @Override
            public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

            }

            @Override
            public void onTestFailedWithTimeout(ITestResult result) {

            }

            @Override
            public void onStart(ITestContext context) {

            }

            @Override
            public void onFinish(ITestContext context) {

            }
        };

        return new Object[0][];

    }
}
