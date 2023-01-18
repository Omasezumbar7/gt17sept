package scrowlDownProg;

import java.awt.Window;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

import Base.testBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class scrollDown1 extends testBase{

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.amazon.in/");

		
		
		//JavascriptExecutor jp = ((JavascriptExecutor)driver);
		//jp.executeScript("window.scrollBy(1,2000)");
		//js.executeScript("window.scrollBy(0,1000)"); //Scroll vertically down by 1000 pixels
		
		JavascriptExecutor z = ((JavascriptExecutor)driver);
		z.executeScript("window.scrollBy(0, 2000)");
		
		
		
		
		
		
		
		
	}

}
