/* 
 * Created by CITS-Team for the training purpose
 * Date 24th Nov 2019
 * 
 */

package Commons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.PageUtility;

public class HomePage
{
	
	//driver  --> Test case
	//Locatortype
	//locatorvalue
	
	static WebDriver driver;
	
	static WebElement username, password, signon, destination, vacation, register;
	
	static PageUtility pol;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
		pol = new PageUtility();
	}
	
	public static void username()
	{
		username = driver.findElement(pol.locator("name", "userName"));
	}
	
	public void username_enter()
	{
		username();
		username.sendKeys("lankesh");
	}
	
	
	
	public static void password()
	{
		password= driver.findElement(pol.locator("name", "password"));
	}
	
	public void password_enter()
	{
		password();
		password.sendKeys("lankesh");
	}
	
	public static void signon()
	{
		signon= driver.findElement(pol.locator("name", "login"));
	}
	
	public void signon_click()
	{
		signon();
		signon.click();
	}
	
	public static void destination()
	{
		destination= driver.findElement(pol.locator("linktext", "your destination"));
	}
	public void destination_click()
	{
		destination();
		destination.click();
	}
	
	
	public static void vacation()
	{
		vacation= driver.findElement(pol.locator("linktext", "featured vacation destinations"));
	}
	
	public void vacation_click()
	{
		vacation();
		vacation.click();
	}
	
	public static void register()
	{
		register= driver.findElement(pol.locator("linktext", "Register here"));
	}
	public void register_click()
	{
		register();
		register.click();
	}
	
	
}
