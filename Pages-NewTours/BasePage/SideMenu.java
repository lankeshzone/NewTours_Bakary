/* 
 * Created by CITS-Team for the training purpose
 * SideMenu page is added to provide common Webelement methods across the application
 * Home, Flights, Car, Cruises, Destination, Vacation
 * Date 24th Nov 2019
 */

package BasePage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.PageUtility;

public class SideMenu 
{
	static WebDriver driver;
	
	static PageUtility pageUtility = new PageUtility();
	
	static WebElement home, flights, car, cruises, destination, vacation;
	
	public SideMenu(WebDriver d)
	{
		driver = d;
	}
	
	public static void home_link()
	{
		home = driver.findElement(pageUtility.locator("linktext", "Home"));
	}
	
	public void home_click()
	{
		home_link(); // identify the elemnt
		home.click(); // action on the element
	}
	
	
	public static void flights_link()
	{
		flights = driver.findElement(pageUtility.locator("linktext", "Flights"));
	}
	
	public void flights_click()
	{
		flights_link();
		flights.click();
	}
	
	
	public static void car_link()
	{
		car = driver.findElement(pageUtility.locator("linktext", "Car Rentals"));
	}
	
	public void cal_click()
	{
		car_link();
		car.click();
	}
	
	
	public static void cruises_link()
	{
		cruises = driver.findElement(pageUtility.locator("linktext", "Cruises"));
	}
	
	public void cruises_click()
	{
		cruises_link();
		cruises.click();
	}
	
	
	public static void destination_link()
	{
		destination = driver.findElement(pageUtility.locator("linktext", "Destinations"));
	}
	
	public void destination_click()
	{
		destination_link();
		destination.click();
	}
	
	public static void vacation_link()
	{
		vacation = driver.findElement(pageUtility.locator("linktext", "Vacations"));
	}
	
	public void vacation_click()
	{
		vacation_link();
		vacation.click();
	}
}
