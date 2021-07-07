package com.jqueryUi.common;

import static com.jqueryUi.common.Hook.*;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Random;
import java.util.Set;


public class Library {

    public CustomWait customWait = new CustomWait();
    private String config_filePath = "E:\\QAMainFolder\\All Projects Main folder\\Cyram_LocalRepo\\FINAL\\Final_Jenkins_JqueryUi_Project\\src\\main\\resources\\config.properties";

    /*
    private final String CHROME_DRIVER = "webdriver.chrome.driver";
    private final String CHROME_DRIVER_PATH = "C:\\Users\\Owner\\IdeaProjects\\homeDepotRecapSerenityReportParallelExecution\\src\\main\\resources\\drivers\\chromedriver.exe";
    private final String FIREFOX_DRIVER = "webdriver.gecko.driver";
    private final String FIREFOX_DRIVER_PATH = "C:\\Users\\Owner\\IdeaProjects\\homeDepotRecapSerenityReportParallelExecution\\src\\main\\resources\\drivers\\geckodriver.exe";
    private String config_filePath = "C:\\Users\\Owner\\IdeaProjects\\homeDepotRecapSerenityReportParallelExecution\\src\\main\\resources\\config.properties";

    public WebDriver opeBrowser() {
        if (readProperties(config_filePath, "browser").equalsIgnoreCase("chrome")) {
            System.setProperty(CHROME_DRIVER, CHROME_DRIVER_PATH);
            //initializing this driver with chrome Driver
            driver = new ChromeDriver();
        } else if (readProperties(config_filePath, "browser").equalsIgnoreCase("firefox")) {
            System.setProperty(FIREFOX_DRIVER, FIREFOX_DRIVER_PATH);
            driver = new FirefoxDriver();
        }
        driver.get(readProperties(config_filePath, "url"));
        if (readProperties(config_filePath, "maximized").equalsIgnoreCase("true")) {
            // driver.manage().window().setSize(new Dimension(1600,1300));
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(7, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }

        return driver;
    }
*/

    public void switchToIFrame(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
        System.out.println("Switched to iFrame");
        // wait.until(ExpectedConditions.stalenessOf(find("iframe", by)));
        //   waitUntilVisible(by);
    }


    public void switchToIFrame(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
        System.out.println("Switched to iFrame");
        // wait.until(ExpectedConditions.stalenessOf(find("iframe", by)));
        //   waitUntilVisible(by);
    }

    public void switchToIFrame(String elementName, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
        System.out.println("Switched to iFrame");
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
        waitFor(1);
    }

    public void switchToIFrame(WebDriver driver, WebElement element, By by) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
        driver.switchTo().frame(element);
        System.out.println("Switched to iFrame");
        waitFor(1);
    }

    public WebElement findByAndClick(WebDriver driver, String locatorType, String locator) {
        // example:  new Library().findByXpathAndClick("xpath","//a[@class='dadada']");
        WebElement element = null;
        if (locatorType.equalsIgnoreCase("xpath")) {
            element = driver.findElement(By.xpath(locator));
            element.click();
        }
        if (locatorType.equalsIgnoreCase("className")) {
            element = driver.findElement(By.className(locator));
            element.click();
        }
        if (locatorType.equalsIgnoreCase("id")) {
            element = driver.findElement(By.id(locator));
            element.click();
        }
        if (locatorType.equalsIgnoreCase("cssSelector")) {
            element = driver.findElement(By.cssSelector(locator));
            element.click();
        }
        if (locatorType.equalsIgnoreCase("linkText")) {
            element = driver.findElement(By.linkText(locator));
            element.click();
        }
        return element;
    }


    public Actions actions() {
        return new Actions(driver);
    }

    public void switchTab() { // get window ID
        String current_tab = driver.getWindowHandle();
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            if (!tab.equals(current_tab)) {
                driver.switchTo().window(tab);
            }
            waitFor(1);
        }
    }

    public void switchBackHandle() { // get window ID
        String current_tab = driver.getWindowHandle();
        Set<String> tabs = driver.getWindowHandles();
        for (String tab : tabs) {
            if (!tab.equals(current_tab)) {
                driver.switchTo().window(tab);
            }
        }
    }

    public boolean isPresent(String cssLocator) {
        try {
            driver.findElement(By.cssSelector(cssLocator));
        } catch (NoSuchElementException e) {
            return false;
        }
        return true;
    }

    public void clickMethod(String elementName, By by) {
        if (by instanceof By.ByXPath || by instanceof By.ByCssSelector || by instanceof By.ById || by instanceof By.ByClassName || by instanceof By.ByName
                || by instanceof By.ByTagName || by instanceof By.ByLinkText || by instanceof By.ByPartialLinkText) {
            customWait.waitUntilClickable(by).click();
        } else {
            System.out.println("Locator not implemented");
        }
    }

    public void clickMethod(By by) {
        if (by instanceof By.ByXPath || by instanceof By.ByCssSelector || by instanceof By.ById || by instanceof By.ByClassName || by instanceof By.ByName
                || by instanceof By.ByTagName || by instanceof By.ByLinkText || by instanceof By.ByPartialLinkText) {
            customWait.waitUntilClickable(by).click();
        } else {
            System.out.println("Locator not implemented");
        }
    }

    public void clickMethod(WebElement element) {
        {
            customWait.waitUntilClickable(element).click();
        }
    }


    public void sendKeys(String elementName, String valueSent, By by) {
        if (by instanceof By.ByXPath || by instanceof By.ByCssSelector || by instanceof By.ById || by instanceof By.ByClassName || by instanceof By.ByName
                || by instanceof By.ByTagName || by instanceof By.ByLinkText || by instanceof By.ByPartialLinkText) {
            WebElement element = customWait.waitUntilVisible(by);
            element.clear();
            element.sendKeys(valueSent);
        } else {
            System.out.println("Locator not implemented");
        }
    }

    public void sendKeys(String valueSent, By by) {
        if (by instanceof By.ByXPath || by instanceof By.ByCssSelector || by instanceof By.ById || by instanceof By.ByClassName || by instanceof By.ByName
                || by instanceof By.ByTagName || by instanceof By.ByLinkText || by instanceof By.ByPartialLinkText) {
            WebElement element = customWait.waitUntilVisible(by);
            element.clear();
            element.sendKeys(valueSent);
        } else {
            System.out.println("sendKeys: Locator not implemented");
        }
    }


    public void sendKeys(String valueSent, WebElement element) {
        try {
            WebElement element1 = customWait.waitUntilVisible(element);
            element1.clear();
            element1.sendKeys(valueSent);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("sendKeys: Locator not implemented");

        }
    }


    public WebElement find(String elementName, By by) {
        return customWait.waitUntilPresent(by);
    }

    public WebElement find(By by) {
        return customWait.waitUntilPresent(by);
    }

    public WebElement find(WebElement element) {
        return customWait.waitUntilPresent(element);
    }


    public List<WebElement> findAll(By by) {
        return customWait.waitUntilAllPresent(by);
    }

    public List<WebElement> findAll(WebElement element) {
        return customWait.waitUntilAllPresent(element);
    }


    public void selectDropDownByValue(String value, By by) {
        if (by instanceof By.ByXPath || by instanceof By.ByCssSelector || by instanceof By.ById || by instanceof By.ByClassName || by instanceof By.ByName
                || by instanceof By.ByTagName || by instanceof By.ByLinkText || by instanceof By.ByPartialLinkText) {
            WebElement dropDown = customWait.waitUntilPresent(by);
            Select select = new Select(dropDown);
            select.selectByValue(value);
        } else {
            System.err.println("Element not found");
        }
    }

    public void selectDropDownByIndex(int index, By by) {
        if (by instanceof By.ByXPath || by instanceof By.ByCssSelector || by instanceof By.ById || by instanceof By.ByClassName || by instanceof By.ByName
                || by instanceof By.ByTagName || by instanceof By.ByLinkText || by instanceof By.ByPartialLinkText) {
            WebElement dropDown = driver.findElement(by);
            Select select = new Select(dropDown);
            select.selectByIndex(index);
        } else {
            System.err.println("Element not found");
        }
    }


    public void selectDropDownByVisibleText(String visibleText, By by) {
        if (by instanceof By.ByXPath || by instanceof By.ByCssSelector || by instanceof By.ById || by instanceof By.ByClassName || by instanceof By.ByName
                || by instanceof By.ByTagName || by instanceof By.ByLinkText || by instanceof By.ByPartialLinkText) {
            WebElement dropDown = driver.findElement(by);
            Select select = new Select(dropDown);
            select.selectByVisibleText(visibleText);
        } else {
            System.err.println("Element not found");
        }
    }

    public WebElement selectDropDownByVisibleText(WebElement elements, String visibleText) {
        Select select = new Select(elements);
        select.selectByVisibleText(visibleText);
        return elements;

    }


    public void waitExplicitly() {
        WebDriverWait wat = new WebDriverWait(driver, 10);
    }

    public void waitFor(int second) {
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String readProperties(String filePath, String key) {
        Properties properties = new Properties();
        File file = new File(filePath);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public String readProperties(String key) {
        Properties properties = new Properties();
        File file = new File(config_filePath);
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            properties.load(fileInputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty(key);
    }

    public void passOrFail(boolean isPassed) {
        if (isPassed) {
            System.out.println("TEST PASSED");
        } else {
            System.err.println("TEST FAILED");
        }
    }

    public void scrollDown(int x, int y) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll:  (" + x + "," + y + ")");
    }

    public void scrollToElement(WebElement element) {
        customWait.waitUntilVisible(element);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void scrollToElement(By by) {
        customWait.waitUntilVisible(by);
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView(true);", by);
    }

    public void hoverOver(By by) {
        WebElement element1 = customWait.waitUntilVisible(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).build().perform();
    }

    public void hoverOver(WebElement element) {
        WebElement element1 = customWait.waitUntilVisible(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).build().perform();
        waitFor(1);
    }

    public void hoverOver(String elementName, By by) {
        WebElement element1 = customWait.waitUntilVisible(by);
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).build().perform();
    }

    public void hoverOver(String elementName, WebElement element) {
        WebElement element1 = customWait.waitUntilVisible(element);
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).build().perform();
    }

    public String getRandomCharacters() {
        String random = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * random.length());
            salt.append(random.charAt(index));
        }
        return salt.toString();
    }

    public String getRandomNumbers() {
        String random = "1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * random.length());
            salt.append(random.charAt(index));
        }
        return salt.toString();
    }


}



