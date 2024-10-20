package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Flightpage {

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Select_Flightpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate an Web elements	
	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[10]")
	WebElement selectspicesaver;

	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[11]")
	WebElement selectspiceflex;

	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[12]")
	WebElement selectspicemax;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement continuebtn;

	//Method for selecting the price
	public void selectprice() {
		selectspicesaver.click();
	}

	//Method for button continue
	public void contbtn() {
		continuebtn.click();
	}

}
