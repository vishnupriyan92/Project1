package org.test.pomConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingDemoQa extends Base {
	public static void main(String[] args) throws InterruptedException {
WebDriver driv=getDriver("http://demoqa.com/registration/");

DemoQa demo=new DemoQa();
type(demo.getFirst_name(),"karthi");
type(demo.getLast_name(),"murali");

btnclk(demo.getMaritalStatus());
select1(demo.getCountry(),3);







}
}
