package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver getDriver(String url) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-15\\Hemanth\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		return driver;
	}

	public void type(WebElement element, String name) {
		element.sendKeys(name);

	}

	public void btnclk(WebElement element) {
				element.click();

	}

	public void quit(WebDriver driver) {
		driver.quit();
	}
}
