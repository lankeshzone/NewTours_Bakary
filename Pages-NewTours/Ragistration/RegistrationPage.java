/*
 * Created by CITS-Team for the training purpose
 * Date 24th Nov 2019
 */

package Ragistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Utility.PageUtility;

public class RegistrationPage 
{

	static WebDriver driver;
	
	static PageUtility pageUtility = new PageUtility();
	
	static WebElement firstname, lastname, phone, email;
	static WebElement address1, address2, city, state, postal, country;
	static WebElement userName, password, confirmPassword, submit;
	
	public RegistrationPage(WebDriver d)
	{
		driver = d;
	}
	
	public void firstname_text()
	{
		firstname = driver.findElement(pageUtility.locator("name", "firstName"));
	}
	
	public void firstname_enterText(String text)
	{
		firstname_text();
		firstname.sendKeys(text);
	}

	public void lastname_text()
	{
		lastname = driver.findElement(pageUtility.locator("name", "lastName"));
	}
	public void lastname_enterText(String text)
	{
		lastname_text();
		lastname.sendKeys(text);
	}

	
	
	public void phone_text()
	{
		phone = driver.findElement(pageUtility.locator("name", "phone"));
	}
	
	public void phone_enterText(String text)
	{
		phone_text();
		phone.sendKeys(text);
	}

	
	public void email_text()
	{
		email = driver.findElement(pageUtility.locator("id", "userName"));
	}
	public void email_enterText(String text)
	{
		email_text();
		email.sendKeys(text);
	}
	
	
	public void address1_text()
	{
		address1 = driver.findElement(pageUtility.locator("name", "address1"));
	}
	
	public void address1_enterText(String text)
	{
		address1_text();
		address1.sendKeys(text);
	}
	
	public void address2_text()
	{
		address2 = driver.findElement(pageUtility.locator("name", "address2"));
	}
	
	public void address2_entertext(String text)
	{
		address2_text();
		address2.sendKeys(text);
	}
	
	public void city_text()
	{
		city = driver.findElement(pageUtility.locator("name", "city"));
	}
	public void city_entertext(String text)
	{
		city_text();
		city.sendKeys(text);
	}
	
	public void state_text()
	{
		state = driver.findElement(pageUtility.locator("name", "state"));
	}
	public void state(String text)
	{
		state_text();
		state.sendKeys(text);
	}
	
	public void postal_text()
	{
		postal = driver.findElement(pageUtility.locator("name", "postalCode"));
	}
	public void postal_entertext(String text)
	{
		postal_text();
		postal.sendKeys(text);
	}
	
	
	
	public void country_text()
	{
		country = driver.findElement(pageUtility.locator("name", "country"));
	}
	public void coutry_select(String text)
	{
		country_text();
		Select s = new Select(country); // since country is a drop down menu, we are using select class
		
		s.selectByVisibleText(text); // we are passing visible text as parameter
	}
	
	public void userName_text()
	{
		userName = driver.findElement(pageUtility.locator("id", "email"));
	}
	public void uname_enterText(String text)
	{
		userName_text();
		userName.sendKeys(text);
	}
	
	
	public void password_text()
	{
		password = driver.findElement(pageUtility.locator("name", "password"));
	}
	public void password_enterText(String text)
	{
		password_text();
		password.sendKeys(text);
	}
	
	
	public void confirmPassword_text()
	{
		confirmPassword = driver.findElement(pageUtility.locator("name", "confirmPassword"));
	}
	public void confirm_enterText(String text)
	{
		confirmPassword_text();
		confirmPassword.sendKeys(text);
	}
	
	
	public void submit_button()
	{
		submit = driver.findElement(pageUtility.locator("name", "register"));
	}
	
	public void submit_click()
	{
		submit_button();
		submit.click();
	}
	
}
