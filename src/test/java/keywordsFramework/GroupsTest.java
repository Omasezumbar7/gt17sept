package keywordsFramework;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import Pagess.LoginPage;

public class GroupsTest extends testBase {
	LoginPage login;// = new LoginPage();
	@BeforeMethod(alwaysRun=true)
	public void setup() throws Exception
	{
		initionalization();
		login = new LoginPage(); 
	}
	@Test(groups="sanity")
	public void Test1()
	{
	boolean result1 = login.verifyBotLogo();
	Assert.assertEquals(result1, true);
	}
   @Test(groups="smoke")
   public void Test2()
   {
	  boolean result = login.verifyloginLogo();
	  Assert.assertEquals(result,true);
   }
   @Test(groups="sanity")
	public void Test3()throws Exception
	{
		String expCurrentURL = "https://www.saucedemo.com/";    //https://www.saucedemo.com/
		String actualCurrentURL = login.verifyCurrentURL();
		Assert.assertEquals(expCurrentURL, actualCurrentURL);
	}
	 @Test (groups="smoke")
	public void Test4() throws Exception
	{
		String expTitle = "Swag Labs";
		String actualTitle = login.verifyTitle();
		Assert.assertEquals(expTitle, actualTitle);
		
	}

		@AfterMethod(alwaysRun=true)
		public void closeBowser()
			{
			driver.close();
			}
		
}
