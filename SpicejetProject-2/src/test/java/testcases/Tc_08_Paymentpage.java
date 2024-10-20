package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Add_onpage;
import pageobject.Bookingformpage;
import pageobject.Paymentpage;
import pageobject.Search_Flightpage;
import pageobject.Select_Flightpage;

public class Tc_08_Paymentpage extends Baseclass{

	@Test(priority=9)
	public void Paymentpage() throws Exception {
		//create an object of Search_Flightpage class
		Search_Flightpage fb=new Search_Flightpage(driver);
		fb.onewaytrip();
		Select_Flightpage selfp=new Select_Flightpage(driver);
		selfp.selectprice();
		selfp.contbtn();
		Thread.sleep(5000);
		Bookingformpage bp=new Bookingformpage(driver);
		bp.contactdetails();
		bp.Adult1();
		bp.Adult2();
		bp.Adult3();
		bp.infant();
		Add_onpage ap=new Add_onpage(driver);
		ap.contnbtn();
		
		//create an object of Paymentpage class
		Paymentpage pp=new Paymentpage(driver);
		Thread.sleep(2000);
		pp.carddetails();
		pp.paybtn();
	}	
}