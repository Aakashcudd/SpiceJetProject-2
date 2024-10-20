package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Bookingformpage extends Utility{

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Bookingformpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate an elements

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[1]")
	WebElement selectoption;

	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-poiln3 r-ubezar'][normalize-space()='Mr'])[1]")
	WebElement TitleMr;

	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement firstname;

	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement lastname;

	@FindBy(xpath="(//input[@type='text'])[3]")
	WebElement mobno;

	@FindBy(xpath="(//input[@type='text'])[4]")
	WebElement email;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[3]")
	WebElement selectcountry;

	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement searchcountry;

	@FindBy(xpath="(//div[@class='css-76zvg2 r-qsz3a2 r-poiln3 r-n6v787 r-1e081e0 r-oyd9sg'][normalize-space()='India'])[1]")
	WebElement countryindia;

	@FindBy(xpath="(//input[@type='text'])[5]")
	WebElement cityname;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-zso239'])[5]")
	WebElement passenger1;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-19m6qjp r-z2wwpe r-1loqt21 r-156q2ks r-1sp51qo r-d9fdf6 r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr'])[1]")
	WebElement p1nextbtn;

	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement p2firstname;

	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement p2lastname;

	@FindBy(xpath="(//input[@type='text'])[8]")
	WebElement p2mobno;

	@FindBy(xpath="//div[text()=\"Next\"]")
	WebElement p2nextbtn;

	@FindBy(xpath="(//div[contains(text(),'Select')])[1]")
	WebElement p3selectoption;

	@FindBy(xpath="//div[contains(text(),'Master')]")
	WebElement Masteroption;

	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement p3firstname;

	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement p3lastname;

	@FindBy(xpath="//div[text()=\"Next\"]")
	WebElement p3nextbtn;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[4]")
	WebElement infantselect;

	@FindBy(xpath="//div[text()=\"Master\"]")
	WebElement infantmasoption;

	@FindBy(xpath="(//input[@type='text'])[6]")
	WebElement inftfirstname;

	@FindBy(xpath="(//input[@type='text'])[7]")
	WebElement inftlastname;

	@FindBy(xpath="//div[@class=\"css-1dbjc4n r-1awozwy r-11u4nky r-116j6us r-rs99b7 r-13awgt0 r-18u37iz\"]")
	WebElement inftdob;

	@FindBy(xpath="//div[text()=\"2023\"]")
	WebElement selectyear;

	@FindBy(xpath="//div[text()=\"Mar\"]")
	WebElement selectmonth;

	@FindBy(xpath="(//div[text()=\"3\"])[2]")
	WebElement selectdate;

	@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep\"])[5]")
	WebElement travelwith;

	@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-1habvwh r-1loqt21 r-1777fci r-1mi0q7o r-1yt7n81 r-m611by r-1otgn73\"])[2]")
	WebElement traveloption;

	@FindBy(xpath="//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")
	WebElement paycontinuebtn;

	public void contactdetails() {
		selectoption.click();	
		TitleMr.click();
		firstname.sendKeys("Aakash");
		lastname.sendKeys("S");
		mobno.sendKeys("8940271319");
		email.sendKeys("sundarselvamuthu1@gmail.com");
		selectcountry.click();
		searchcountry.click();
		searchcountry.sendKeys("India");
		countryindia.click();
		cityname.sendKeys("Banglore");

	}

	public void Adult1() {
		passenger1.click();
		waitExplicit(p1nextbtn);
		p1nextbtn.click();
	}
	public void Adult2() {	
		p2firstname.sendKeys("sundar");
		p2lastname.sendKeys("A");
		p2mobno.sendKeys("9875640123");
		waitExplicit(p2nextbtn);
		p2nextbtn.click();
	}
	public void Adult3() {
		p3selectoption.click();
		Masteroption.click();
		p3firstname.sendKeys("Sathish");
		p3lastname.sendKeys("B");
		waitExplicit(p3nextbtn);
		p3nextbtn.click();
	}
	public void infant() {
		infantselect.click();
		infantmasoption.click();
		inftfirstname.sendKeys("Chinnu");
		inftlastname.sendKeys("C");
		inftdob.click();
		selectyear.click();
		selectmonth.click();
		selectdate.click();
		travelwith.click();
		traveloption.click();
		paycontinuebtn.click();
	}

}