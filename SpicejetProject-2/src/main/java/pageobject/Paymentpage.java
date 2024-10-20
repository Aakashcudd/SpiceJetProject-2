package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.Utility;

public class Paymentpage extends Utility{

	//create a webdriver variable
	public WebDriver driver;

	//Initialize the pageFactory to init method
	public Paymentpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//locate an Webelements
	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-18u37iz'])[9]")
	WebElement creditcard;

	@FindBy(id = "card_number")
	WebElement cardno;

	@FindBy(id = "name_on_card")
	WebElement cardname;

	@FindBy(id = "card_exp_month")
	WebElement expmonth;

	@FindBy(id = "card_exp_year")
	WebElement expyear;

	@FindBy(id = "security_code")
	WebElement cvv;

	@FindBy(xpath="(//div[@class=\"css-1dbjc4n r-4qswn0 r-1phboty r-13yce4e r-rs99b7 r-1pcd2l5 r-13qz1uu\"])[2]")
	WebElement UPIoption;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-mcxt9x r-d045u9 r-1loqt21 r-14g73ha r-1mi0q7o r-1otgn73 r-eafdt9 r-1i6wzkk r-lrvibr r-1b94p3d'])[2]")
	WebElement selectUPI;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-ry2h4h r-z2wwpe r-rs99b7 r-1enofrn r-17sp8yy r-1vglu5a r-1g94qm0 r-utggzx r-1w50u8q r-zmihyx r-1wyyakw'])[1]")
	WebElement UPIID;

	@FindBy(xpath="//div[text()=\"@ybl\"]")
	WebElement selectybl;

	@FindBy(xpath="(//div[@class='css-1dbjc4n r-1awozwy r-un1frt r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73'])[1]")
	WebElement paybtn;		

	@FindBy(xpath = "//iframe[@class='card_number_iframe']")
	WebElement frameswitch;

	@FindBy(xpath="//div[text()='Pay']")
	WebElement proceedtopaybtn;


	// Method for frame
	public void swithframe() {
		waitExplicit(frameswitch);
		driver.switchTo().frame(frameswitch);
	}

	//Method for entering card Details
	public void carddetails() {
		waitExplicit(cardno);

		cardno.sendKeys("5425-2334-3010-9903");
		cardname.sendKeys("Mastercard");
		expmonth.sendKeys("04");
		expyear.sendKeys("2026");
		cvv.sendKeys("786");
	}

	//Method for proceed to pay button
	public void paybtn() {		
		waitforElementTobeClickable(proceedtopaybtn, 10000);
		mouseclick(proceedtopaybtn);
	}

	}