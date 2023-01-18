package Pagess;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.testBase;

public class extraPages extends testBase {
	@FindBy(xpath="//span[@class='shopping_cart_badge']")private WebElement cartCount;
	
	public extraPages ()
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void verifycartCount()
	{
		boolean result = cartCount.isDisplayed();
	}
	
	
	
	
	
	
	
}
