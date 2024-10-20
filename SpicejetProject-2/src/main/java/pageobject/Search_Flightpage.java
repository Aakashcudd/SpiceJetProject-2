package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Search_Flightpage extends Utility{

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Search_Flightpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate an elements
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1pcd2l5 r-1uwte3a r-m611by r-bnwqim'])[1]")
	WebElement selectbooking;

	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[10]")
	WebElement onewaytrip;

	@FindBy(xpath="(//*[name()='svg'][@data-testid='svg-img'])[11]")
	WebElement Roundtrip;

	@FindBy(xpath="(//input[@type='text'])[1]")
	WebElement origin;

	@FindBy(xpath="(//input[@type='text'])[2]")
	WebElement destination;

	@FindBy(xpath="(//div[@class='css-1dbjc4n'])[55]")
	WebElement departuresection;

	@FindBy(xpath="(//div[text()=\"27\"])[1]")
	WebElement selectdatedepart;

	@FindBy(xpath="//div[@class='css-1dbjc4n r-1loqt21 r-u8s1d r-11xbo3g r-1v2oles r-1otgn73 r-16zfatd r-eafdt9 r-1i6wzkk r-lrvibr r-184en5c']")
	WebElement nextmonthbtn;

	@FindBy(xpath="(//div[@class='css-1dbjc4n'])[56]")
	WebElement returnsection;

	@FindBy(xpath="(//div[text()=\"29\"])[1]")
	WebElement selectdatereturn;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[5]")
	WebElement passengers;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[1]")
	WebElement addadult;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[2]")
	WebElement addchild;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1aockid'])[3]")
	WebElement addinfant;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-d9fdf6 r-1w50u8q r-ah5dr5 r-1otgn73'])[1]")
	WebElement passengerdonebtn;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz r-1wtj0ep'])[6]")
	WebElement currency;

	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='INR'])[1]")
	WebElement INR;

	@FindBy(xpath="(//div[@class='css-76zvg2 r-homxoj r-ubezar'][normalize-space()='USD'])[1]")
	WebElement USD;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-1sncvnh'])[3]")
	WebElement dropdown;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1niwhzg r-1p0dtai r-1d2f490 r-1udh08x r-u8s1d r-zchlnj r-ipm5af'])[1]")
	WebElement searchbtn;

	//Method for one way trip
	public void onewaytrip() {
		onewaytrip.click();
		origin.click();
		origin.sendKeys("BOM");
		destination.click();
		destination.sendKeys("BLR");
		waitExplicit(selectdatedepart);
		selectdatedepart.click();
		passengers.click();
		addadult.click();
		addchild.click();
		addinfant.click();
		passengerdonebtn.click();
		currency.click();
		INR.click();
		mouseclick(searchbtn);
	}
	//Method for Round Trip
	public void roundtrip() {
		Roundtrip.click();
		origin.click();
		origin.sendKeys("BOM");
		destination.click();
		destination.sendKeys("BLR");
		waitExplicit(selectdatedepart);
		selectdatedepart.click();
		waitExplicit(selectdatereturn);
		selectdatereturn.click();
		passengers.click();
		addadult.click();
		addchild.click();
		addinfant.click();
		passengerdonebtn.click();
		currency.click();
		USD.click();
		mouseclick(searchbtn);
	}

}