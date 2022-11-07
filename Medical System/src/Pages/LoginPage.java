package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage extends BasicPage{

	By username = By.id("username");
	By Password = By.id("password");
	By Inpatienlocation = By.id("Inpatient Ward");
	By loginBtn = By.id("loginButton");
	By Isolationlocation = By.id("Isolation Ward");
	By Laboratory=By.id("Laboratory");
	By Outpatientclinc= By.id("Outpatient Clinic");
	By Pharmacy= By.id("Pharmacy");
	By Registrationdisk=By.id("Registration Desk");
	
	public LoginPage(FirefoxDriver driver) {

		super(driver);	
	}
	public void setUserName(String UserName) {

	WebElement usernametxtbox	= driver.findElement(username);
	
	this.settext(UserName, usernametxtbox);
		
		
	}

	public void setPassword(String userPassword) {

		WebElement passwordtxtbox	= driver.findElement(Password);
		
		this.settext(userPassword, passwordtxtbox);
		
		

	}

	public void selectInpatientLocation() {

		driver.findElement(Inpatienlocation).click();
	}

	public void clickLogin() {

		driver.findElement(loginBtn).click();
	} 

	public void Login(String username, String password,String location) {
		setUserName(username);
		setPassword(password);
		selectLocation(location);
		clickLogin();
	}
	

	private void selectLocation(String location) {

		switch(location) {
		case "inpatient" :
			driver.findElement(Inpatienlocation).click();
			break;
		case "isolation":
			driver.findElement(Isolationlocation).click();
			break;
		case "laboratory":
			driver.findElement(Laboratory).click();
			break;
		case "outpatientclinic":
			driver.findElement(Outpatientclinc).click();
			break;
		case "pharmacy":
			driver.findElement(Pharmacy).click();
			break;	
		case "registerdisk":
			driver.findElement(Registrationdisk).click();
			break;
		}

	}
}
