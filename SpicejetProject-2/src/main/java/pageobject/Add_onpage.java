package pageobject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Add_onpage extends Utility{

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Add_onpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate an elements

	@FindBy(xpath="//div[text()=\"Continue\"]")
	WebElement Continuebtn;

	//Method for continue button
	public void contnbtn() {		
		waitforElementTobeClickable(Continuebtn, 10000);
		mouseclick(Continuebtn);
	}

}