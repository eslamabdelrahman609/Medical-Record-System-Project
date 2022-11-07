package Testcase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.RegisterPatient;



public class testRegister  extends driverconstructor{
	HomePage homepage;
	LoginPage loginpage;


	@BeforeClass
	public void settingdriver() {
		loginpage=new LoginPage(driver);
		loginpage.Login("Admin", "Admin123", "inpatient");
		homepage = new HomePage(driver);
		homepage.SwitchToPage("registerpatient");
	}

	@Test(priority=1)
	public void setDemographics() {
		RegisterPatient registerpage=new RegisterPatient(driver);
		registerpage.Registermale("john", "", "doe", "F","21", "1998", "January", "21ssa", "01066239432", "Doctor","Taha");
	}


	@AfterClass
	public void clickhomepage() {
		RegisterPatient registerpage=new RegisterPatient(driver);
		registerpage.backtohomepage();
	}

}
