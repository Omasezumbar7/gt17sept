package keywordsFramework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import Pagess.LoginPage;

public class PriorityTestCase extends testBase{

	LoginPage login;// = new LoginPage();
	@BeforeMethod
	public void setup() throws Exception
	{
		initionalization();
		login = new LoginPage(); 
	}
	// In the priority less value priority test case will be executed first.
	//if having same value priority then the test case will be execute alphabetically, 1,3,7,-16,-0,56,-154=-154,-16,-0,1,3,7,56
	 @Test (priority=3)
		public void AverifyTitleTest1() throws Exception 
		{
			String expTitle = "Swag Labs";
			String actualTitle = login.verifyTitle();
			Assert.assertEquals(expTitle, actualTitle);
			
		}
   @Test(priority=2)
	
	public void BverifyCuURL2()throws Exception
	{
		String expCurrentURL = "https://www.saucedemo.com/";    //https://www.saucedemo.com/
		String actualCurrentURL = login.verifyCurrentURL();
		Assert.assertEquals(expCurrentURL, actualCurrentURL);
	}
	
	 @Test(priority=4)
	 public void  CloginToAppTest3() throws Exception
	 {
		  String expectedResult = "https://www.saucedemo.com/inventory.html";
				 String actualResult = login.loginToApp();
				Assert.assertEquals(actualResult, expectedResult);
	 }
	 @Test(priority=5)
	   public void DverifyloginLogoTest2()
	   {
		  boolean result = login.verifyloginLogo();
		  Assert.assertEquals(result,true);
	   }
	 @Test(priority=-1333)
		public void EverifyBotLogoTest1()
		{
		boolean result1 = login.verifyBotLogo();
		Assert.assertEquals(result1, true);
		}
	  
	 @Test(priority=-00)
	public String FinventaryroductLabelTest6() throws Exception
	{
		//inventaryroductLabel.
		        String expResult = "PRODUCTS";
	 boolean actResult = login.verifyinventaryroductLabel();
	Assert.assertEquals(actResult, expResult);
	return expResult;
	}
	 @Test(priority=1)
		public void GverifyPeekLogoTest7() throws Exception
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
	
	
	
	
	@AfterMethod
	public void closeBowser()
		{
		driver.close();
		}
	
	
}
