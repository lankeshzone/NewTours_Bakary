package Utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits 
{

	static WebDriver driver;
	static WebDriverWait wait;
	static FluentWait ft;
	
	// initializing the local variable(driver), basically to avoid sending driver variable n number of times
	public Waits(WebDriver driver)
	{
		this.driver = driver;
		wait = new WebDriverWait(this.driver, 10);
		
		//fluent wait for local driver, with max wait period of 10 second and at
		// a frequency of every 2 seconds poll.
		ft = new FluentWait(this.driver).withTimeout(10, TimeUnit.SECONDS)
				.pollingEvery(2, TimeUnit.SECONDS);
	}
	
	//sleep method...
	public void sleep(int value) throws InterruptedException
	{
		Thread.sleep(value);
	}
	
	
	//page load waits
	public void pageloadwait(int value)
	{
		try
		{
		driver.manage().timeouts().pageLoadTimeout(value, TimeUnit.SECONDS);
		}
		catch(Exception t)
		{
			//rewrite for exact exceptions
			System.out.println(t.getMessage());
		}
	}
	
	//Script load waits
	public void scriptloadwait(int value)
	{
		try
		{
			driver.manage().timeouts().setScriptTimeout(value, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	//wait for the implicit waits
	public void implicitwait(int value)
	{
		try
		{
			driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//wait for explicit alerts
	public boolean alertPresent()
	{	
		try
		{
		wait.until(ExpectedConditions.alertIsPresent());
		return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	//element is present
	public boolean elementPresent(By locator)
	{
		try
		{
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	//element clickable
	public boolean elementclickable(By locator)
	{
		try
		{
			wait.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}	
	
	
	//element selected???
	public boolean elementSelected(By locator)
	{
		try
		{
			wait.until(ExpectedConditions.elementToBeSelected(locator));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	//frame available and switch to it
	public void frameAvailableSwitch(By locator)
	{
		try
		{
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	//alert is present
	public boolean alertPresentFT()
	{
		try
		{
			ft.until(ExpectedConditions.alertIsPresent());
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	//element present
	public boolean elementPresentFT(By locator)
	{
		try
		{
			ft.until(ExpectedConditions.presenceOfElementLocated(locator));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
	
	//element clickable
	public boolean elementClickableFT(By locator)
	{
		try
		{
			ft.until(ExpectedConditions.elementToBeClickable(locator));
			return true;
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			return false;
		}
	}
}
