package org.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class laxmi {
	public static void main(String[] args) {
		Base base = new Base();
		WebDriver driver = base.getDriver("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
		WebElement stepsLogin = driver.findElement(By.xpath("//a[@href='javascript:stepsToLogin();']"));
		stepsLogin.click();
		String pW = driver.getWindowHandle();
		Set<String> allWindows = driver.getWindowHandles();
		System.out.println(pW);
		System.out.println(allWindows);
		for (String x : allWindows)
			if (!pW.equals(allWindows)) {
				driver.switchTo().window(x);
			}
		WebElement cId = driver.findElement(By.className("Instruction"));
		String text = cId.getText();
		System.out.println(text);

		String[] countId = text.split(" ");
		  
		/*Map<String,Integer> emp = new LinkedHashMap<>();
		for(String u:countId) {
			if(emp.containsKey(u)) {
				int count= emp.get(u);
				emp.put(u, count+1);
			}else {
				emp.put(u, 1);
			}
		}
		System.out.println(emp);
		*/
		
		
		int count = 0;
		for (String x : countId) {
			if (x.startsWith("id") || x.startsWith("ID"))

			{
				count = count + 1;

			}

		}
		System.out.println(count);
	}
}
