package testcases;

import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Search_Flightpage;
import pageobject.Select_Flightpage;

public class Tc_06_Select_Flightpage extends Baseclass{
	
	@Test(priority=7)
	public void SelectFlight() throws Exception {
	//create an object of Search_Flightpage class
		Search_Flightpage fb=new Search_Flightpage(driver);
		fb.onewaytrip();
		Select_Flightpage selfp=new Select_Flightpage(driver);
		selfp.selectprice();
		selfp.contbtn();
		Thread.sleep(5000);
	}
}
