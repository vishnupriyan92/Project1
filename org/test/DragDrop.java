package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {
	public static void main(String[] args) {
		Base b = new Base();

		WebDriver driver = b.getDriver("http://demo.guru99.com/test/drag_drop.html");

		WebElement from = driver.findElement(By.id("credit2"));
		WebElement to = driver.findElement(By.id("bank"));

		WebElement from1 = driver.findElement(By.id("fourth"));
		WebElement to1 = driver.findElement(By.id("amt7"));

		WebElement from2 = driver.findElement(By.id("credit1"));
		WebElement to2 = driver.findElement(By.id("loan"));

		WebElement from3 = driver.findElement(By.id("fourth"));
		WebElement to3 = driver.findElement(By.id("amt8"));

		Actions acc = new Actions(driver);
		acc.dragAndDrop(from, to).perform();
		acc.dragAndDrop(from1, to1).perform();
		acc.dragAndDrop(from2, to2).perform();
		acc.dragAndDrop(from3, to3).perform();

		//b.quit(driver);
	}

}
