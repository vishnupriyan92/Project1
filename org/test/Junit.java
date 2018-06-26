package org.test;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.http.util.Asserts;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Junit {
	static WebDriver driver;

	@BeforeClass
	public static void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-15\\Hemanth\\Selenium\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@AfterClass
	public static void AfterClass() {
		driver.quit();
	}

	@Before
	public void A() {
		System.out.println("Start");
	}

	
	@After
	
	public void B() {
		System.out.println("End");
	}


	@Test
	public void test() {
		Assert.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
		WebElement b = driver.findElement(By.id("email"));
		b.sendKeys("vishnu");
		//Assert.fail(null);
	
		

	}
}
