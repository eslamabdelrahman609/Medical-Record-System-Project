package Testcase;

import java.time.Duration;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class driverconstructor {
	
static FirefoxDriver driver;
	
	@BeforeTest
	public void  setUp() throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver","D:\\Tessting\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	
	
	@AfterTest
	public void teardown() {

		//driver.quit();
	}

}
