package pageobject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

//Creates a Signup page thats inherits the Utility Class
public class Signuppage extends Utility{

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Signuppage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate an Web elements

	@FindBy(xpath="(//select[contains(@class,'form-control form-select')])[1]")
	WebElement Selectoption;

	@FindBy(id="first_name")
	WebElement firstname;

	@FindBy(xpath="//input[@id='last_name']")
	WebElement lastname;

	@FindBy(xpath="//select[@class='form-control form-select']")
	WebElement selectcountry;

	@FindBy(xpath="//input[@id='dobDate']")
	WebElement selectdob;

	@FindBy(xpath="//input[@placeholder='+91 01234 56789']")
	WebElement mobno;

	@FindBy(xpath="//input[@id='email_id']")
	WebElement emailid;

	@FindBy(xpath="//input[@id='new-password']")
	WebElement password;

	@FindBy(xpath="//input[@id='c-password']")
	WebElement cpassword;

	@FindBy(xpath="//input[@class='form-check-input mt-02']")
	WebElement agreebox;

	@FindBy(xpath="//button[normalize-space()='Submit']")
	WebElement submitbtn;

	@FindBy(xpath="/html[1]/body[1]/div[2]/div[1]/div[1]/div[4]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]")
	WebElement aftersignin;

	//Method for Signup Title
	public String SingnupPageTitle(String actTitle) throws Exception {
		actTitle=driver.getTitle();
		return actTitle;
	}
	//Method for selecting from dropdown
	public void selectoption(String visibletext) {
		selectFromDropDown(Selectoption, visibletext);
	}
	//Method for entering firstname for signup
	public void getfirstname(String fname) {
		firstname.sendKeys(fname);
	}
	//Method for entering last name for signup
	public void getlastname(String lname) {
		lastname.sendKeys(lname);
	}
	//Method for selecting the country from drop down
	public void getcountry(String visibletext) {
		selectcountry.click();
		selectFromDropDown(selectcountry, visibletext);
	}
	//Method for entering the date of birth
	public void getDOB(String dob) {
		selectdob.sendKeys(dob);
		selectdob.sendKeys(Keys.ENTER);
	}
	//Method for entering mobile number
	public void getmob(String mob) {
		mobno.sendKeys(mob);
	}
	//Method for entering mail id
	public void getemail(String email) {
		emailid.sendKeys(email);
		waitExplicit(emailid);
	}
	//Method for entering the password
	public void getpass(String pass) {
		password.sendKeys(pass);
		waitExplicit(password);
	}

	//Method for enteirng confirm password
	public void getcpass(String repass) {
		cpassword.sendKeys(repass);
		waitExplicit(cpassword);
	}
	//Method for clicking the sumbmit button
	public void submtbtn() {
		mouseclick(agreebox);
		submitbtn.click();
	}

}