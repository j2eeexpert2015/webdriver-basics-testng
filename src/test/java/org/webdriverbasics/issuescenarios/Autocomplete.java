package org.webdriverbasics.issuescenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.webdriverbasics.basics.AbstractChromeWebDriverTest;

import java.util.List;
import java.util.concurrent.TimeUnit;


public class Autocomplete extends AbstractChromeWebDriverTest {



    @Test
    public void testAutocomplete() throws Exception {

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        String baseUrl = "http://www.southwest.com/";
        driver.get(baseUrl);
        String searchingText = "New York/Newark, NJ - EWR";
        String partialText = "New York";

        WebElement text = driver.findElement(By.id("air-city-departure"));
        text.sendKeys(partialText);

        WebElement element = driver.findElement(By.id("air-city-departure-menu"));
        List<WebElement> results = element.findElements(By.tagName("li"));
        int size = results.size();

        System.out.println("The size of the list is: " + size);

        for (int i = 0; i < size; i++) {
            System.out.println(results.get(i).getText());
        }

        Thread.sleep(3000);
        for (WebElement result : results) {
            if (result.getText().equals(searchingText)) {
                System.out.println("Selected: " + result.getText());
                result.click();
                break;
            }
        }
    }


}
