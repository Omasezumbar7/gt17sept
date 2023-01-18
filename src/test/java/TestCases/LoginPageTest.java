package TestCases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import Base.testBase;
import Pagess.LoginPage;

public  class LoginPageTest extends testBase{
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
	
	public void verifyCuURL()throws Exception
	{
		String expCurrentURL = "https://www.saucedemo.com/";    //https://www.saucedemo.com/
		String actualCurrentURL = login.verifyCurrentURL();
		Assert.assertEquals(expCurrentURL, actualCurrentURL);
	}
	 @Test 
	public void verifyTitleTest() throws Exception 
	{
		String expTitle = "Swag Labs";
		String actualTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actualTitle);
		
	}
	 @Test
	 public void  loginToAppTest() throws Exception
	 {
		  String expectedResult = "https://www.saucedemo.com/inventory.html";
				 String actualResult = login.loginToApp();
				Assert.assertEquals(actualResult, expectedResult);
	 }
	 @Test(groups="sanity")
	public String inventaryroductLabelTest() throws Exception
	{
		//inventaryroductLabel.
		        String expResult = "PRODUCTS";
	 boolean actResult = login.verifyinventaryroductLabel();
	Assert.assertEquals(actResult, expResult);
	return expResult;
	}
	@Test
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
	public void closeBowser()
		{
		driver.close();
		}
	
	
}
