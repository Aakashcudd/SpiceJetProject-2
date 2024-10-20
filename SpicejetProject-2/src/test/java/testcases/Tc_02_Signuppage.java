package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Baseclass;
import pageobject.Homepage;
import pageobject.Signuppage;

public class Tc_02_Signuppage extends Baseclass{
	@BeforeTest
	public void setup() {
		sheetname="SignupData";
	}

	@Test(dataProvider="Testdata",priority=2)
	
	public void Signup(String visibletext,String fname,String lname,String visibletext1,String dob,String mob,String email,String pass,String repass) throws Exception {
		//create an object of Homepage class
		Homepage Home=new Homepage(driver);
		Home.signup();
		Thread.sleep(5000);
		Signuppage sp=new Signuppage(driver);
		SwitchWindow();
		sp.selectoption(visibletext);
		sp.getfirstname(fname);
		sp.getlastname(lname);
		sp.getcountry(visibletext1);
		sp.getDOB(dob);
		sp.getmob(mob);
		Thread.sleep(3000);
		sp.getemail(email);
		Thread.sleep(2000);
		sp.getpass(pass);
		sp.getcpass(repass);
		Thread.sleep(3000);
		sp.submtbtn();
		Thread.sleep(3000);
		
	}

}