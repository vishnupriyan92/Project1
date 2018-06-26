package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
public static void main(String[] args) {

	Base b=new Base();
	WebDriver driver=b.getDriver("https://www.google.com/");
	
	Actions acc=new Actions(driver);
	
	WebElement sBox = driver.findElement(By.id("lst-ib"));
	acc.contextClick(sBox).perform();
	
	
}
}
