package Testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SearchPatient;



public class testSearchpatient extends driverconstructor {
	
	HomePage Homepage =new HomePage(driver);
	LoginPage loginpage;
	SearchPatient searchpatient=new SearchPatient(driver);
	@BeforeClass
	public void settingdriver() {
		Homepage=new HomePage(driver);
		Homepage.SwitchToPage("findpatient");
	}
	@Test
	public void searchpatient() {
		SearchPatient searchpatient=new SearchPatient(driver);
		searchpatient.searchpatient("john doe");
		searchpatient.clicksearched();
	}

}
