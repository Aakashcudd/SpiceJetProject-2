package pageobject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Homepage extends Utility{
	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Homepage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate elements in webpage
	@FindBy(xpath="//div[contains(text(),'Signup')]")
	WebElement Signupbtnhome;

	@FindBy(xpath="(//div[@class='css-76zvg2 r-jwli3a r-ubezar'])[1]")
	WebElement Loginbtn;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-184aecr r-kicko2 r-1loqt21 r-18u37iz r-779j7e r-1f1sjgu r-1otgn73'])[1]")
	WebElement Flightmenu;

	@FindBy(xpath="(//div[@class='css-76zvg2 r-cqee49 r-ubezar r-1ozqkpa'][normalize-space()='check-in'])[1]")
	WebElement checkinmenu;

	@FindBy(xpath="//div[contains(text(),'flight status')]")
	WebElement flightstatusmenu;

	@FindBy(xpath="//div[contains(text(),'manage booking')]")
	WebElement managemenu;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1d09ksm r-qklmqi r-1lz4bg0 r-1phboty r-18u37iz'])[1]")
	List<WebElement> MenuItems;

	//Method for login
	public void login() {
		Loginbtn.click();
	}

	//Method for signup
	public void signup() {
		Signupbtnhome.click();
	}

	//Method for Pagetitle
	public String SpicejetPageTitle(String actTitle) throws Exception {
		actTitle=driver.getTitle();
		return actTitle;
	}
	//Method for menudisplay check
	public boolean checkinmenudisplay() {
		return checkinmenu.isDisplayed();

	}

	//Method for flight status display
	public boolean flightstatusmenudisplay() {
		return checkinmenu.isDisplayed();
	}

	//Method for display manage booking
	public boolean managebookingmenudisplay() {
		return managemenu.isDisplayed();
	}
}
