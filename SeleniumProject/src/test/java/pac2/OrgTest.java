package pac2;

import org.testng.annotations.Test;

import practice.baseclass.BaseClass;

public class OrgTest extends BaseClass{
	@Test(groups = "smokeTest")
	public void createOrgTest() {
		System.out.println("Execute createOrgTest ");
	}
	@Test(groups = "regressionTest")
	public void modifyContactTest() {
		System.out.println("Execute modifyOrgTest ");
	}

}
