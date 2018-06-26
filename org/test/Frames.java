package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-15\\Hemanth\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://paytm.com/");
	/*driver.manage().window().maximize();*/
	/*WebElement ref =driver.findElement(By.xpath("//frame[@src='RSLogin.html?v=7']"));*/
	/*driver.switchTo().frame(ref);*/
		Thread.sleep(3000);
		WebElement username=driver.findElement(By.xpath("//div[text()='Log In/Sign Up']"));
		
		username.click();
		WebElement ref = driver.findElement(By.xpath("//iframe[@src='/v1/api/login?isIframe=true&theme=mp-web']"));
		driver.switchTo().frame(ref);
		
		/pages/themesv2/images/mp-web/lock.svg
		
	    
	      /*driver.quit();*/
	}
}
