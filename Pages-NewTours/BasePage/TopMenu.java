/* 
 * Created by CITS-Team for the training purpose
 * TopMenu page is added to provide common Webelement methods across the application
 * sign-In	Register-Button	Support	Contact
 *  Date 24th Nov 2019
 */
package BasePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.PageUtility;

public class TopMenu
{
	
	// static variable for capturing the web browser provided by calling attribute
	static WebDriver driver;
	
	static WebElement signIN, register, support, contact;
	
	static PageUtility pageUtility = new PageUtility();
	
	public static void signIN_Link()
	{
		signIN = driver.findElement(pageUtility.locator("linktext","SIGN-ON"));
	}
	public void signIN_click()
	{
		signIN_Link();
		signIN.click();
	}
	
	
	public static void register_Link()
	{
		register = driver.findElement(pageUtility.locator("linktext","REGISTER"));
	}
	public void registr_click()
	{
		register_Link();
		register.click();
	}
	
	public static void support_Link()
	{
		support = driver.findElement(pageUtility.locator("linktext","SUPPORT"));
	}
	public void support_click()
	{
		support_Link();
		support.click();
		
	}
	
	
	public static void contact_Link()
	{
		contact = driver.findElement(pageUtility.locator("linktext","CONTACT"));
	}
	public void contact_click()
	{
		contact_Link();
		contact.click();
	}
	
	
	// constructor to initialize the WebBrowser which is required to identify elements
	public TopMenu(WebDriver d)
	{
		driver = d;
	}

	

}
