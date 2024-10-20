package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Homepage;
import pageobject.Loginpage;

public class Tc_04_Loginpage_email extends Baseclass{
	
	@BeforeTest
	public void setup() {
		sheetname="EmailLogin";
	}
	@Test(dataProvider="Testdata",priority=4)
	public void Login_using_email(String email,String pass) throws Exception {
	//create an object of Homepage class
	Homepage Home=new Homepage(driver);
	Home.login();
	Thread.sleep(5000);
	Loginpage lp=new Loginpage(driver);
	lp.emaillogin(email,pass);	
	
}

}
