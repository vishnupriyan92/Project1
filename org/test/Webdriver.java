package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Webdriver {
	public static void main(String[] args) {
		Base b = new Base();
		WebDriver driver = b.getDriver("http://demo.automationtesting.in/Register.html");

		WebElement firstName = driver.findElement(By.xpath("//input[@ng-model='FirstName']"));
		b.type(firstName, "karthi");

		WebElement lastName = driver.findElement(By.xpath("//input[@ng-model='LastName']"));
		b.type(lastName, "Arjun");

		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		b.type(address, "Tambaram");

		WebElement email = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		b.type(email, "karthi1@gmail.com");

		WebElement phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		b.type(phone, "9789407611");

		WebElement gender = driver.findElement(By.xpath("//input[@value='Male']"));
		b.btnclk(gender);

		WebElement hobbies = driver.findElement(By.xpath("//input[@value='Cricket']"));
		b.btnclk(hobbies);

		WebElement firstpassword = driver.findElement(By.id("firstpassword"));
		b.type(firstpassword, "karthi");

		WebElement secondpassword = driver.findElement(By.id("secondpassword"));
		b.type(secondpassword, "karthi");

		WebElement submit = driver.findElement(By.id("submitbtn"));
		b.btnclk(submit);

		// b.quit(driver);
	}
}
