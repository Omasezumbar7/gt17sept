package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import Pagess.LoginPage;
import Utility.ReadData;
import Utility.screenshotMethod;

public class captureSCForFaildTestcase1 extends testBase {
	LoginPage login;// = new LoginPage();
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		initionalization();
		login = new LoginPage(); 
	}
	@Test
	public void verifyBotLogoTest()
	{
	boolean result1 = login.verifyBotLogo();
	Assert.assertEquals(result1, true);
	}
   @Test
   public void verifyloginLogoTest()
   {
	  boolean result = login.verifyloginLogo();
	  Assert.assertEquals(result,true);
   }
   
	
	
	 @Test 
	public void verifyTitleTest() throws Exception 
	{
		String expTitle = "Swag Labs";
		String actualTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actualTitle);
		
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBowser(ITestResult z) throws Exception
		{
		if(ITestResult.FAILURE== z.getStatus())
			ReadData.CaptureScreenshot(z.getName());
		driver.close();
		}
	
	
}
