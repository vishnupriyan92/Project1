package org.test;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectConcept {
	public static void main(String[] args) {
		Base b = new Base();
		
		WebDriver driver = b.getDriver("https://www.facebook.com/");
		WebElement drop = driver.findElement(By.id("day"));
		WebElement drop1 = driver.findElement(By.xpath("//select[@id='month']"));
		WebElement drop2 = driver.findElement(By.id("year"));
		
		Select s = new Select(drop);
		s.selectByIndex(2);
		Boolean e =s.isMultiple();
		System.out.println(e);
		Select s1 = new Select(drop1);
		s1.selectByValue("7");
		Select s2 = new Select(drop2);
		s2.selectByVisibleText("2015");
	}

}
