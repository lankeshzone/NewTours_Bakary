package Utility;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver
{
	static WebDriver driver;
	
	public Driver(WebDriver driver)
	{
		this.driver = driver;
	}

	public WebDriver setupBrowser(String browser, String url)
	{
		//Chrome/firefox/IE etc.,
		
		
		switch(browser)
		{
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;
		default:
			driver = new FirefoxDriver();
			break;
		}
		
		driver.get(url);
		return driver;
		
	}
	
	public String getinfo(String info)
	{
		String value = null;
		
		switch (info)
		{
		case "url":
			value = driver.getCurrentUrl();
			break;
		
		case "title":
			value = driver.getTitle();
			break;
			
		case "source":
			value = driver.getPageSource();
			break;
		case "handle":
			value = driver.getWindowHandle();
			break;
		}
		return null;
	}
	
	
	//getting current window position
	public Point getWindowPosition()
	{
		Point p;
		p = driver.manage().window().getPosition();
		return p;
	}
	
	//set the current window position
	public void setWindowPosition(Point p)
	{
		driver.manage().window().setPosition(p);
	}
	
	
	//getting current window size
	public Dimension getWindowSize()
	{
		Dimension d;
		d = driver.manage().window().getSize();
		return d;
	}
	
	//set the size of the window
	public void setWindowSize(Dimension d)
	{
		driver.manage().window().setSize(d);
	}
	
}

/*
Driver...
1) depending on execution scenario.. 
chrom/firefox/IE

2) know several browser information like.. wats the current url/ page source, title etc.,

3) size of window/rsize/reposition window..

4) create methods.. reusable

5) Run the scripts on remote servers (UAT/Dev/Test/ some other environment)

1) Create a class
2) Add methods for each the items
(start browser / stopbrowser) / current url , current pagesource, current title etc., / windowmanagement / resize and repositioning / remote server execution
*/