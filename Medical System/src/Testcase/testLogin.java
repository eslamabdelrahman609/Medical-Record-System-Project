package Testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;


public class testLogin extends driverconstructor {
	String baseUrl ="https://demo.openmrs.org/";
	String Expextedtitle = "Home";
	LoginPage Loginpage;
	HomePage Homepage;
	
	@BeforeClass
	public void openLoginPage() {

		driver.get(baseUrl);
		Loginpage	= new LoginPage(driver);	
	}
	
	@Test(priority=1)
	public void testInpatientUserLogin() {
		
		Loginpage.Login("Admin", "Admin123","inpatient");
		
		String Actualtitle	= driver.getTitle();
		assertEquals(Actualtitle, Expextedtitle);
	}


	@Test(priority=2)
	public void testIsolationUserLogin() {

		Loginpage.Login("Admin", "Admin123","isolation");

		String Actualtitle	= driver.getTitle();
		assertEquals(Actualtitle, Expextedtitle);
	}
	@Test(priority=3)
	public void testlaboratoryUserLogin() {

		Loginpage.Login("Admin", "Admin123","laboratory");

		String Actualtitle	= driver.getTitle();
		assertEquals(Actualtitle, Expextedtitle);
		
	}
	@Test(priority=4)
	public void testoutpatientclinicUserLogin() {

		Loginpage.Login("Admin", "Admin123","outpatientclinic");

		String Actualtitle	= driver.getTitle();
		assertEquals(Actualtitle, Expextedtitle);
	}
	@Test(priority=5)
	public void pharmacyUserLogin() {

		Loginpage.Login("Admin", "Admin123","pharmacy");

		String Actualtitle	= driver.getTitle();
		assertEquals(Actualtitle, Expextedtitle);
	}
	@Test(priority=6)
	public void registerdiskUserLogin() {

		Loginpage.Login("Admin", "Admin123","registerdisk");

		String Actualtitle	= driver.getTitle();
		assertEquals(Actualtitle, Expextedtitle);	
	}
	
	  @Test (dataProvider = "LoginDataprovider", priority=7)
	public void registerWithDataProvider(String username, String password) {

		Loginpage.Login(username, password,"registerdisk");

		String Actualtitle	= driver.getTitle();
		assertEquals(Actualtitle, Expextedtitle);	
	}
	  
	  @DataProvider (name = "LoginDataprovider")
		public String[][] dataProviderMethod(){
			return new String [][] {{"Admin", "Admin123"}, {"Admin", "Admin123"}};
		}  
	  
	@AfterMethod
	public void backToLoginPage() {
		HomePage homepage = new HomePage(driver);
		homepage.logout();
	}
	
}
