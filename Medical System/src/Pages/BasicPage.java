package Pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicPage {
	FirefoxDriver driver;
	WebDriverWait wait;
	
	public BasicPage (FirefoxDriver driver) {
		
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
	}
	public void settext(String Text, WebElement E ) {
		
		wait.until(ExpectedConditions.elementToBeClickable(E)).sendKeys(Text);
		
}

}
