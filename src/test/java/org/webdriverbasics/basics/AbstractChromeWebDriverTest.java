package org.webdriverbasics.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public abstract class AbstractChromeWebDriverTest {

	protected WebDriver driver;

	public AbstractChromeWebDriverTest() {
		super();
	}

	@BeforeTest
	public void beforeTest() {
		//Download the web driver executable
		//WebDriverManager.chromedriver().setup();
		String chromeJarPath = "C://All_Webdriver_Projects//driver_lib//chromedriver.exe";
    	System.setProperty("webdriver.chrome.driver", chromeJarPath);
		
		//Create a instance of your web driver - chrome
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
	
	public void sleep(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}