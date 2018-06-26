package org.test;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Greens-15\\Hemanth\\Selenium\\driver\\chromedriver.exe");
	ChromeDriver driver =new ChromeDriver();
	driver.get("http://toolsqa.com/automation-practice-table/");
	List<WebElement> tRows=driver.findElements(By.tagName("tr"));
	
	for(int i =0; i<tRows.size(); i++) {
		List<WebElement> tdata=tRows.get(i).findElements(By.tagName("td"));
		for(int j=0;j<tdata.size();j++){
			String text = tdata.get(j).getText();
			System.out.println(text);
		}
	
	}
	
}
}
