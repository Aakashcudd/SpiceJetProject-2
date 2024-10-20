package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Homepage;

public class Tc_01_Navigate_to_Homepage extends Baseclass{

	@Test(priority=1)

	public void Homepgae_verify() throws Exception {
		//create an object of Homepage class
		Homepage Home=new Homepage(driver);
		String actTitle = Home.SpicejetPageTitle(getPageTitle());
		String expTitle="SpiceJet - Flight Booking for Domestic and International, Cheap Air Tickets";
		//Validate the title of the page
		Assert.assertEquals(actTitle, expTitle);


	}


}