package org.webdriverbasics.issuescenarios;

import org.webdriverbasics.basics.AbstractChromeWebDriverTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class ElementNotClickableDemo extends AbstractChromeWebDriverTest {

    @Test
    public void test() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        // Element is loaded in DOM, but it is overlapped by another element
        // Element is not visible because of another element
        driver.get("https://www.freecrm.com/index.html");

        driver.findElement(By.name("username")).sendKeys("testing");
        WebDriverWait wait = new WebDriverWait(driver, 3);
        boolean invisible = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("preloader")));
        if (invisible) {
            WebElement loginButton = driver.findElement(By.xpath("//input[@value='Login']"));
            loginButton.click();
        }
        WebElement loginButtonJS = driver.findElement(By.xpath("//input[@value='Login']"));
        js.executeScript("arguments[0].click();", loginButtonJS);
    }
}
