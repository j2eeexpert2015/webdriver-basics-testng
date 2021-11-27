package org.webdriverbasics.issuescenarios;

import org.testng.annotations.Test;
import org.webdriverbasics.basics.AbstractChromeWebDriverTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
public class StaleElementDemo extends AbstractChromeWebDriverTest {

    @Test
    public void testMethod() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("https://learn.letskodeit.com/p/practice");

        driver.get(driver.getCurrentUrl());
        WebElement checkboxElement = driver.findElement(By.id("bmwcheck"));
        checkboxElement.click();
    }
}
