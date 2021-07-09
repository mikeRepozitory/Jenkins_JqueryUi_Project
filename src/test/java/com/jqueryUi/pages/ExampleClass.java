package com.jqueryUi.pages;

import com.aventstack.extentreports.reporter.FileUtil;
import com.google.common.util.concurrent.FluentFuture;
import com.jqueryUi.common.Library;
import com.thoughtworks.selenium.Wait;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.java2d.cmm.Profile;

import java.io.File;
import java.util.List;

public class ExampleClass {


    public static void main(String[] args) throws InterruptedException {
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


        System.out.println("numbeOfLinks:  " + numbeOfLinks);
        System.out.println(elementName);

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
}
