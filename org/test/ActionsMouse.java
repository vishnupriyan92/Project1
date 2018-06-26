package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouse {
public static void main(String[] args) {
	Base b = new Base();
	
	WebDriver driver = b.getDriver("http://www.greenstechnologys.com/");
	
	Actions act = new Actions(driver);
	WebElement courseOver = driver.findElement(By.xpath("//a[text()='COURSES']"));
	act.moveToElement(courseOver).perform();
	
	WebElement stt = driver.findElement(By.xpath("//span[text()='Software Testing Training']"));
	act.moveToElement(stt).perform();
	
	WebElement sel = driver.findElement(By.xpath("//span[text()='Selenium']"));
	b.btnclk(sel);
	
	
	
}
}
