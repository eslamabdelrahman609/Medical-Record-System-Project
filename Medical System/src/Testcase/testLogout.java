package Testcase;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import Pages.HomePage;



public class testLogout extends driverconstructor {
	@Test
	public void testuserLogout() {
		
		HomePage homepage = new HomePage(driver);
		homepage.logout();
		
		String Expextedtitle = "Login";
		String Actualtitle	= driver.getTitle();
		assertEquals(Actualtitle, Expextedtitle);

	}

}
