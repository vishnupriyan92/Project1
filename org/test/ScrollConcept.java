package org.test;

import org.openqa.selenium.*;
/*import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;*/

public class ScrollConcept {
	public static void main(String[] args) throws InterruptedException {

		Base b = new Base();

		WebDriver driver = b.getDriver("http://demoqa.com/registration/");
		WebElement submit = driver.findElement(By.name("pie_submit"));
		WebElement reg = driver.findElement(By.xpath("//a[text()='Registration']"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", submit);
		submit.click();
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", reg);
		reg.click();
	}
}
