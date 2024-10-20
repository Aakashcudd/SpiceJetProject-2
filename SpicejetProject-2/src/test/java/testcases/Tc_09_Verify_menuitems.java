package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Homepage;

public class Tc_09_Verify_menuitems extends Baseclass{
	
	@Test(priority=10)
	
	public void checkinmenu_verify() throws Exception {
		//create an object of Login class Homepage
		Homepage Home=new Homepage(driver);
		Assert.assertTrue(Home.checkinmenudisplay());
		
	}

	@Test(priority=10)
	
	public void Flightstatusmenu_verify() throws Exception {
		//create an object of Login class Homepage
		Homepage Home=new Homepage(driver);
		Assert.assertTrue(Home.flightstatusmenudisplay());
		
	}

	@Test(priority=10)
	
	public void ManageBookingmenu_verify() throws Exception {
		//create an object of Login class Homepage
		Homepage Home=new Homepage(driver);
		Assert.assertTrue(Home.managebookingmenudisplay());
		
	}
	
}
