package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPatient {
	By patientname = By.name("givenName");
	By middlename=By.name("middleName");
	By familyname=By.name("familyName");
	By nextbtn=By.id("next-button");
	By selectgender=By.id("gender-field");
	By patientbirthday=By.id("birthdateDay-field");
	By patientbirthmonth=By.id("birthdateMonth-field");
	By patientbirthyear=By.id("birthdateYear-field");
	By address1	=By.id("address1");
	By contactnum=By.name("phoneNumber");
	By relationrelated=By.id("relationship_type");
	By personname=By.className("person-typeahead");
	By submit=By.id("submit");
	By homepageicon=By.xpath("/html/body/ul/li[1]/a");

	FirefoxDriver driver;
	Select se;

	public RegisterPatient (FirefoxDriver driver) {
		this.driver=driver;
	}

	public void backtohomepage() {
		driver.findElement(homepageicon).click();
	}

	public void Registermale(String pname,String midname ,String fname,String Gender,String DAY,String Year,String Month,String Address,String Phonenumber,String relatedperson,String relationname) {
		driver.findElement(patientname).sendKeys(pname);
		driver.findElement(middlename).sendKeys(midname);
		driver.findElement(familyname).sendKeys(fname);
		driver.findElement(nextbtn).click();
		Select gender= new Select (driver.findElement(selectgender));
		gender.selectByValue(Gender);
		driver.findElement(nextbtn).click();
		driver.findElement(patientbirthday).sendKeys(DAY);
		driver.findElement(patientbirthyear).sendKeys(Year);
		Select month= new Select (driver.findElement(patientbirthmonth));
		month.selectByVisibleText(Month);
		driver.findElement(nextbtn).click();
		driver.findElement(address1).sendKeys(Address);
		driver.findElement(nextbtn).click();
		driver.findElement(contactnum).sendKeys(Phonenumber);
		driver.findElement(nextbtn).click();
		Select relatedtopatient= new Select (driver.findElement(relationrelated));
		relatedtopatient.selectByVisibleText(relatedperson);
		driver.findElement(personname).sendKeys(relationname);
		driver.findElement(nextbtn).click();
		driver.findElement(submit).click();
	}

}
