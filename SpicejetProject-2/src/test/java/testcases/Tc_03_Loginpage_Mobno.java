package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Homepage;
import pageobject.Loginpage;

public class Tc_03_Loginpage_Mobno extends Baseclass{
	@BeforeTest
	public void setup() {
		sheetname="MobLogin";
	}

	@Test(dataProvider="Testdata",priority=3)
		public void Login_using_mobile(String mob,String pass) throws Exception {
		//create an object of Homepage class
		Homepage Home=new Homepage(driver);
		Home.login();
		Thread.sleep(5000);
		Loginpage lp=new Loginpage(driver);
		lp.mobilelogin(mob, pass);
	}
	
	
}