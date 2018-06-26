package org.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {
	public static void main(String[] args) {
		/*System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Greens-15\\Hemanth\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	
		
	
		WebElement txtFirstname = driver.findElement(By.id("u_0_j"));
		txtFirstname.sendKeys("hemanth");
		
		WebElement txtSurname = driver.findElement(By.id("u_0_l"));
		txtSurname.sendKeys("Raj");
		
		WebElement txtMobileno = driver.findElement(By.id("u_0_o"));
		txtMobileno.sendKeys("9789407611");
		
		WebElement txtPassword = driver.findElement(By.id("u_0_v"));
		txtPassword.sendKeys("fdsafdsa");
		
		WebElement btnsignup = driver.findElement(By.name("websubmit"));
		btnsignup.click();*/
		
		List<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		num.add(50);
		num.add(60);num.add(70);
		
		System.out.println(num);
		for (int i = num.size()-5; i < num.size(); i++) {
			System.out.println(num.get(i));
			
			
			
		}
		
		

	}
}
