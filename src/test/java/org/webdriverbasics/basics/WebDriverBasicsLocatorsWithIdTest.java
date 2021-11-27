package org.webdriverbasics.basics;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebDriverBasicsLocatorsWithIdTest extends AbstractChromeWebDriverTest{
	
	@Test
	public void testTitle() {
	
		//get the http://localhost:8080/login
		driver.get("http://localhost:8080/login");
		
		//assert the title
		assertEquals("First Web Application",
				driver.getTitle());//First Web Application
		
	}
	
	@Test
	public void testGetInformationAboutName() {
		driver.get("http://localhost:8080/login");
		WebElement nameElement = driver.findElement(By.id("name"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));//text
		System.out.println(nameElement.getAttribute("value"));//EMPTY
	}

	@Test
	public void testGetInformationAboutPassword() {
		driver.get("http://localhost:8080/login");
		WebElement nameElement = driver.findElement(By.id("password"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));//password
		System.out.println(nameElement.getAttribute("value"));//EMPTY
	}
	
	@Test
	public void testGetInformationAboutSubmitButton() {
		driver.get("http://localhost:8080/login");
		WebElement nameElement = driver.findElement(By.id("submit"));
		System.out.println(nameElement.getTagName());//input
		System.out.println(nameElement.getAttribute("type"));//submit
		System.out.println(nameElement.getAttribute("value"));//EMPTY
	}

}
