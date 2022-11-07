package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {
	
	FirefoxDriver driver;
	By LogoutBtn=By.linkText("Logout");

	By findpatient=By.className("icon-search");
	By activevisits=By.className("icon-calendar");
	By registerpatient=By.partialLinkText("Register a patient");
	By capturevitals=By.className("icon-vitals");
	By appointmentshedule=By.linkText("Appointment Scheduling");

	public HomePage(FirefoxDriver driver) {
		this.driver=driver;
	}

	public void SwitchToPage(String pageName) {

		selectwebelement(pageName);
	}

	private void selectwebelement(String pageName) {
		switch(pageName) {

		case"findpatient":
			driver.findElement(findpatient).click();
			break;
		case"activevisits"	:
			driver.findElement(activevisits).click();
			break;
		case"registerpatient":
			driver.findElement(registerpatient).click();	
			break;
		case"capturevitals":
			driver.findElement(capturevitals).click();
			break;
		case"appointmentshedule":
			driver.findElement(appointmentshedule).click();
			break;
		}	
	}

	public void logout() {

		driver.findElement(LogoutBtn).click();	
	}

}
