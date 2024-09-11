package practice.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
	WebDriver driver;
	@BeforeSuite(groups= {"smokeTest","regressionTest"})
	public void configBS() {
		System.out.println("=======Connect to DB,Report Config=======");
	}
	
	@BeforeClass(groups= {"smokeTest","regressionTest"})
	public void configBC() {
		System.out.println("=======Launch Browser=======");
		driver=new ChromeDriver();	
	}
	
	@BeforeMethod(groups= {"smokeTest","regressionTest"})
	public void configBM() {
		System.out.println("=======Navigate to APP And Login=======");
		driver.manage().window().maximize();
		driver.get("http://localhost:8888");
	}
	
	@AfterMethod(groups= {"smokeTest","regressionTest"})
	public void configAM() {
		System.out.println("=======Logout=======");
	}
	
	@AfterClass(groups= {"smokeTest","regressionTest"})
	public void configAC() {
		System.out.println("=======Close Browser=======");
		driver.close();
	}
	
	@AfterSuite(groups= {"smokeTest","regressionTest"})
	public void configAS() {
		System.out.println("=======Disconnect DB=======");
	}
	

}
