package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Loginpage extends Utility{
	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Loginpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate an elements
	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar r-1ozqkpa'][normalize-space()='Email'])[1]")
	WebElement emailbtn;

	@FindBy(xpath="//input[@type='email']")
	WebElement email;

	@FindBy(xpath="(//input[@type='number'])[1]")
	WebElement mobno;

	@FindBy(xpath="//input[@type='password']")
	WebElement password;

	@FindBy(xpath = "(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[5]")
	WebElement loginbtn;

	//Method for Email login
	public void emaillogin(String emailid,String pass) {
		emailbtn.click();
		email.sendKeys(emailid);
		password.sendKeys(pass);
		mouseclick(loginbtn);
	}
	//Method for Mobile Login
	public void mobilelogin(String mob,String pass) {
		mobno.sendKeys(mob);
		password.sendKeys(pass);
		mouseclick(loginbtn);
	}

}