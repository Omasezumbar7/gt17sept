package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;
import java.util.logging.FileHandler;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.testBase;

public class ReadData extends testBase{

	
	public static  String  readPropertyFile(String value) throws Exception
	{
	Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\ph\\eclipse-workspace\\mavamProg_17Sept\\TestData\\config.Properties");
		p.load(file);
	 return p.getProperty(value);
	}
	
	public static  String readExcelFile(int row , int coloum) throws Exception
	{
		FileInputStream file = new FileInputStream("C:\\Users\\ph\\eclipse-workspace\\mavamProg_17Sept\\TestData\\Book1.xlsx");
	Sheet excel = WorkbookFactory.create(file).getSheet("sheet1");
	
	String  values = excel.getRow(row).getCell(coloum).getStringCellValue();
	return values ;
		
	}

	public static void CaptureScreenshot (String Name) throws Exception
	
	{

	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest= new File("C:\\Users\\ph\\eclipse-workspace\\mavamProg_17Sept\\ScreenshotPhoto\\"+ Name +".jpeg");
	org.openqa.selenium.io.FileHandler.copy(source, dest);
		driver.close();
		
		
	
		
		
	

		}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

	
	
	
	
	
	
	
	
	
	

