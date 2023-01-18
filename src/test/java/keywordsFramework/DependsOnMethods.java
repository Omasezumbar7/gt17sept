package keywordsFramework;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Base.testBase;
import Pagess.LoginPage;

public  class DependsOnMethods extends testBase{
	LoginPage login;// = new LoginPage();
	@BeforeMethod
	public void setup() throws Exception
	{
		initionalization();
		login = new LoginPage(); 
	}
	
	 @Test 
		public void verifyTitleTest1() throws Exception 
		{
			String expTitle = "Swag Labs";
			String actualTitle = login.verifyTitle();
			Assert.assertEquals(expTitle, actualTitle);
			
		}
   @Test(dependsOnMethods="verifyTitleTest1")
	
	public void verifyCuURL2()throws Exception
	{
		String expCurrentURL = "https://www.saucedemo.com/";    //https://www.saucedemo.com/
		String actualCurrentURL = login.verifyCurrentURL();
		Assert.assertEquals(expCurrentURL, actualCurrentURL);
	}
	
	 @Test(dependsOnMethods= {"verifyTitleTest1","verifyCuURL2","verifyPeekLogoTest7"})
	 public void  loginToAppTest3() throws Exception
	 {
		  String expectedResult = "https://www.saucedemo.com/inventory.html";
				 String actualResult = login.loginToApp();
				Assert.assertEquals(actualResult, expectedResult);
	 }
	 @Test(enabled=false)
	   public void verifyloginLogoTest2()
	   {
		  boolean result = login.verifyloginLogo();
		  Assert.assertEquals(result,true);
	   }
	 @Test(enabled=false)
		public void verifyBotLogoTest1()
		{
		boolean result1 = login.verifyBotLogo();
		Assert.assertEquals(result1, true);
		}
	  
	 @Test(enabled=false)
	public String inventaryroductLabelTest6() throws Exception
	{
		//inventaryroductLabel.
		        String expResult = "PRODUCTS";
	 boolean actResult = login.verifyinventaryroductLabel();
	Assert.assertEquals(actResult, expResult);
	return expResult;
	}
	 @Test
		public void verifyPeekLogoTest7() throws Exception
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
