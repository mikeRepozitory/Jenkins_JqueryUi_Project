package com.jqueryUi.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.jqueryUi.common.Hook.*;


import java.util.Collections;
import java.util.List;

public class CustomWait {

    public WebElement waitUntilClickable(Object object) {
        if (object instanceof By) {
            WebDriverWait wait = new WebDriverWait(driver, 7);
            return wait.until(ExpectedConditions.elementToBeClickable((By) object));
        }
        if (object instanceof WebElement) {
            WebDriverWait wait = new WebDriverWait(driver, 7);
            return wait.until(ExpectedConditions.elementToBeClickable((WebElement) object));
        }
        return null;
    }

/*  public WebElement waitUntilClickable(By by) {
    try {
      WebDriverWait wait = new WebDriverWait(Library.driver, 7);
      return wait.until(ExpectedConditions.elementToBeClickable(by));
    } catch (Exception e) {
      return waitUntilPresent(by);
    }
  }*/

    public boolean isClickable(Object object) {
        boolean isClickable;
        if (object instanceof By) {
            WebDriverWait wait = new WebDriverWait(driver, 7);
            wait.until(ExpectedConditions.elementToBeClickable((By) object));
            isClickable = true;
        } else if (object instanceof WebElement) {
            WebDriverWait wait = new WebDriverWait(driver, 7);
            wait.until(ExpectedConditions.elementToBeClickable((WebElement) object));
            isClickable = true;
        } else {
            isClickable = false;
        }
        return isClickable;
    }

    public List<WebElement> waitUntilAllPresent(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        return wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(by));
    }

    public List<WebElement> waitUntilAllPresent(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        // bellow is a problem that it would not accept elements directly
        return wait.until(ExpectedConditions.visibilityOfAllElements(Collections.singletonList(element)));
    }

    public WebElement waitUntilPresent(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        return wait.until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitUntilPresent(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public WebElement waitUntilDisappears(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        return wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitUntilVisible(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public WebElement waitUntilVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitExplicitly() {
        WebDriverWait wat = new WebDriverWait(driver, 10);
    }

    public WebElement waitUntilSendKey(By by) {
        WebDriverWait wait = new WebDriverWait(driver, 7);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }

}
