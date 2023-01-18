package TestCases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import Pagess.LoginPage;
import Pagess.inventryPage;

public class inventaryPageTest extends testBase {
	LoginPage login;
	inventryPage invent;
	
      @BeforeMethod(alwaysRun=true)
	public void setUp() throws Exception
	{
    	initionalization();
    	 login = new LoginPage();
    	 invent = new inventryPage();
    	 Thread.sleep(2000);
    	login.loginToApp();
    	 Thread.sleep(2000);
    	}
      
	@Test
	public void  verifyPeekLogoTest () throws Exception
	{
		
		boolean acttResult = invent.verifyPeekLogo();
		Assert.assertEquals(acttResult, true);
		}
	
	@Test(groups="sanity")
	public  void verifyfacebookLogoTest()
	{
		boolean result = invent.verifyfacebookLogo();
		Assert.assertEquals(result, true);
	}
	@Test
	public  void  verifyLinkdInLogoTest()
	{
     boolean result = invent.verifyLinkdInLogo();
	Assert.assertEquals(result, true);
		
	}
	@Test
	public void verifytwitterLogoTest()
	{
	boolean actResult =invent .verifytwitterLogo();
	Assert.assertEquals(actResult, true);
	}

	@Test 
	public  void addProductTest () throws Exception
	{
		// String expResult = "6";
	    String actResult = invent.addProduct();
	 // Assert.assertEquals( actResult,"6");
	    
	}
	

	@AfterMethod(alwaysRun=true)
	public void closeBrowser()
	{
	driver.close();	
	
	}
 
}
