package org.test.pomConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {
	static WebDriver driver;
	public static WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-15\\Hemanth\\Selenium\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public static void type(WebElement element, String name) {
		element.sendKeys(name);

	}

	public static void btnclk(WebElement element) {
				element.click();

	}

	public static void select1(WebElement element, int index) {
		Select sel = new Select(element);
		sel.selectByIndex(index);
	}
	
	public static void quit(WebDriver driver) {
		driver.quit();
	}
}
