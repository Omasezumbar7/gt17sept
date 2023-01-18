package Pagess;



import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;
import Utility.ReadData;

public class LoginPage extends testBase{

	//@FindBy(xpath="//div[@class='login_logo']")private WebElement loginLogo;
	
	@FindBy(xpath="//div[@class='login_logo']")private WebElement loginLogo;
	@FindBy(xpath="//div[@class='bot_column']") private WebElement botLogo;
	@FindBy(xpath="//input[@id='user-name']")private WebElement userNameTxtBox;
	@FindBy(xpath="//input[@id='password']")private WebElement passTxtBox;
	@FindBy(xpath="//input[@id='login-button']")private WebElement loginBtn;
	@FindBy(xpath="//span[@class='title']")private WebElement inventaryroductLabel;
	@FindBy(xpath="//div[@class='peek']")private static WebElement peekLogo;
	//@FindBy(xpath="//select[@class='product_sort_container']")private WebElement dropDownList;
	//@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement addToCart;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyloginLogo()
	{
		return loginLogo.isDisplayed();
	}
    public boolean verifyBotLogo()
    {
    	return botLogo.isDisplayed();
    }
	public String  verifyTitle() throws Exception
	
	{
		Thread.sleep(2000);
		return driver.getTitle();
	}
     public String  verifyCurrentURL()
	
	{
		
		return driver.getCurrentUrl();
	}
	
     public   String loginToApp() throws Exception
     {
    	//userNameTxtBox.sendKeys("standard_use");
    // passTxtBox.sendKeys("secret_sauce");
    //userNameTxtBox.sendKeys(ReadData.readExcelFile(0,0));
    	 userNameTxtBox.sendKeys(ReadData.readPropertyFile("userNameTxtBox"));
    	 passTxtBox.sendKeys(ReadData.readPropertyFile("passNameTxtBox"));
    	 loginBtn.click();
    	return  driver.getCurrentUrl();
     }
     
    public boolean  verifyinventaryroductLabel() throws Exception
     
    {
    	loginToApp();
   return  inventaryroductLabel.isDisplayed();
    	
    } 
    public  boolean  verifyPeekLogo() throws Exception
    {
    	loginToApp();
    	return peekLogo.isDisplayed();
    }}
 
    	
    
    	

	
	
     
     
     
     
     
     
     
	
	

	
	

