package TestCases;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import Base.testBase;
import Pagess.LoginPage;
import Utility.ReadData;

public class CapturescreenshotForFaild extends testBase{

	
	
	
	LoginPage login;// = new LoginPage();
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		initionalization();
		login = new LoginPage(); 
	}
	@Test(enabled=false)
	public void verifyBotLogoTest()
	{
	boolean result1 = login.verifyBotLogo();
	Assert.assertEquals(result1, true);
	}
   @Test(enabled=false)
   public void verifyloginLogoTest()
   {
	  boolean result = login.verifyloginLogo();
	  Assert.assertEquals(result,true);
   }
   @Test(enabled=false)
	
	public void verifyCuURL()throws Exception
	{
		String expCurrentURL = "https://www.saucedemo.com/";    //https://www.saucedemo.com/
		String actualCurrentURL = login.verifyCurrentURL();
		Assert.assertEquals(expCurrentURL, actualCurrentURL);
	}
	 @Test 
	public void verifyTitleTest() throws Exception 
	{
		String expTitle = "1Swag Labs";
		String actualTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actualTitle);
		
	}
	 @Test(enabled=false)
	 public void  loginToAppTest() throws Exception
	 {
		  String expectedResult = "https://www.saucedemo.com/inventory.html";
				 String actualResult = login.loginToApp();
				Assert.assertEquals(actualResult, expectedResult);
	 }
	 @Test(enabled=false)
	public String inventaryroductLabelTest() throws Exception
	{
		//inventaryroductLabel.
		        String expResult = "PRODUCTS";
	 boolean actResult = login.verifyinventaryroductLabel();
	Assert.assertEquals(actResult, expResult);
	return expResult;
	}
	@Test(enabled=false)
	public void verifyPeekLogoTest() throws Exception
	{
		Object actresult = login.verifyPeekLogo();
		Assert.assertEquals(actresult , true);
	}
	 
	//@Test
	//public void verifyDropdownListTest() throws Exception 
	{
	     //   boolean actResult = login.verifyDropdownList();
	     //   Assert.assertEquals(actResult,true);
	}
	
	@AfterMethod(alwaysRun=true)
	public void closeBowser(ITestResult Res ) throws Exception
	
		{
		if(ITestResult.FAILURE==Res.getStatus())
			ReadData.CaptureScreenshot(Res.getName());
		driver.close();
		
		}
	
	
	
}
