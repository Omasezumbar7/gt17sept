package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import Base.testBase;

public class screenshotMethod extends testBase {

	public void captureScreenshot() throws Exception
	{
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\ph\\eclipse-workspace\\mavamProg_17Sept\\ScreenshotPhoto\\scz.jpeg");
		FileHandler.copy(source, destination);
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}
