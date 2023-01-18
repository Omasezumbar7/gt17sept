package Pagess;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.google.common.annotations.VisibleForTesting;

import Base.testBase;

public class inventryPage extends testBase {

	
	@FindBy(xpath="//div[@class='peek']")private  WebElement peekLogo;
	@FindBy(xpath="//li[@class='social_facebook']")private static  WebElement facebookLogo;
	@FindBy(xpath="//li[@class='social_linkedin']")private  WebElement linkdInLogo;
	@FindBy(xpath="//a[@href='https://twitter.com/saucelabs']")private WebElement twitterLogo;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-bike-light']")private WebElement bikeLight;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")private WebElement backPack;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")private WebElement boltTshirt;
	@FindBy(xpath="//button[@name='add-to-cart-sauce-labs-onesie']")private WebElement labOneSie;
	@FindBy(xpath="//select[@class='product_sort_container']")private WebElement addallProduct;
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")private WebElement fleeseJacket;
	@FindBy(xpath="//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']") private WebElement redTshirt;
 public inventryPage()
 
 {
	 PageFactory.initElements(driver, this);
 }
	public    boolean verifyPeekLogo()
	{
		return peekLogo.isDisplayed();
		}
	
	

	
	public boolean verifyfacebookLogo()
	{
		return facebookLogo.isDisplayed();
	}	
	public  boolean   verifyLinkdInLogo()
	{
		return linkdInLogo.isDisplayed();
	}
       public boolean verifytwitterLogo()
       {
    	return twitterLogo.isDisplayed();  
       }
	public boolean verifyBikeLight()
	{
		return bikeLight.isDisplayed();
	}
	
	public    String addProduct ()throws Exception
	
	
	{
		Select s = new Select(addallProduct);
		Thread.sleep(1000);
		s.selectByVisibleText("Name (Z to A)");
		bikeLight.click();
		Thread.sleep(1000);
		backPack.click();
		Thread.sleep(1000);
		boltTshirt.click();
		Thread.sleep(2000);
		labOneSie.click();
		fleeseJacket.click();
		redTshirt.click();
		Thread.sleep(5000);
		addallProduct.getText();
		
		return null;
		
		
	}
	
	}
	
	

