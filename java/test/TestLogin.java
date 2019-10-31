package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import util.Base;
import util.Utility;

public class TestLogin extends Base {
	
//	Utility u = new Utility();
	
	@BeforeTest()
	public void openBrowser()
	{
		launchBrowser();
		navigateToURL();
	}
	
	@Test
	public void loginDemo()
	{
		Utility.loginToBenefitJunctionWithValidCredential();
	}

}
