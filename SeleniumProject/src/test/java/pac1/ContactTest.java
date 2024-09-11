package pac1;

import org.testng.annotations.Test;

import practice.baseclass.BaseClass;

public class ContactTest extends BaseClass{
	@Test(groups = "smokeTest")
	public void createContactTest() {
		
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		
		System.out.println(BROWSER);
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println("Execute createContactTest ");
	}
	@Test(groups = "regressionTest")
	public void modifyContactTest() {
		System.out.println("Execute modifyContactTest ");
	}

}
