package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot
{

	static WebDriver driver;
	
	public Screenshot(WebDriver driver)
	{
		driver = this.driver;
	}
	
	public void captureImage(String filePath)
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		System.out.println("test url" + driver.getCurrentUrl());
		File fs = ts.getScreenshotAs(OutputType.FILE);
		
		try 
		{
			FileUtils.copyFile(fs, new File(filePath));
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
}
