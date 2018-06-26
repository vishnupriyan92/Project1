package org.test.pomConcept;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoQa extends Base{
DemoQa()
{
	PageFactory.initElements(driver, this);
}
@FindBy(id="name_3_firstname")
private WebElement first_name;

@FindBy(id="name_3_lastname")
private WebElement last_name;

@FindBy(xpath=("//input[@value='married']"))
private WebElement maritalStatus;

@FindBy(id="dropdown_7")
private WebElement country;

public WebElement getFirst_name() {
	return first_name;
}
public WebElement getLast_name() {
	return last_name;
}
public WebElement getMaritalStatus() {
	return maritalStatus;
}

public WebElement getCountry() {
	return country;
}



}
