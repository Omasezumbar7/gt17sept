package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.testBase;
import Pagess.LoginPage;
import Pagess.inventryPage;

public class failedTestCase extends testBase{

	
	LoginPage login;
	inventryPage invent;
	
      @BeforeMethod
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
	public void  Test1 () throws Exception
	{
		
		boolean acttResult = invent.verifyPeekLogo();
		Assert.assertEquals(acttResult, true);
		}
    

@Test
public  void Test2()
{
 boolean result = invent.verifyLinkdInLogo();
Assert.assertEquals(result, true);
	
}
@Test
public void  Test3()
{
boolean actResult =invent .verifytwitterLogo();
Assert.assertEquals(actResult,true);
}
	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	
	
	
	
	
}
