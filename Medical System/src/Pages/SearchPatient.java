package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchPatient {
	By searchbox=By.id("patient-search");
	By selectpatient=By.xpath("//table//tbody//tr[1]");
	
	FirefoxDriver driver;

	public SearchPatient(FirefoxDriver driver) {
		this.driver=driver;
	}

	public void searchpatient(String patientname) {
		
		driver.findElement(searchbox).sendKeys(patientname);;
		
	}
	public void clicksearched() {
		driver.findElement(selectpatient).click();
		
	}

}
