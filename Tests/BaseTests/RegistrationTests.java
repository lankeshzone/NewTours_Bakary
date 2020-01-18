package BaseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePage.TopMenu;
import Registration.RegistrationPage;
import Utility.Screenshot;

@Listeners(Utility.TestListener.class)
public class RegistrationTests 
{
	
	static Screenshot spo;

	@Test(groups = {"regression","sanity"})
	public void Register_User()
	{
		WebDriver driver = new ChromeDriver(); // created the browser instance
		spo= new Screenshot(driver);
		//opening the base url
		driver.get("http://newtours.demoaut.com");
		
		//click on Registration step-1
		//create an object of TopMenu class and execute the constructor with WebDriver parameter
		TopMenu tpo = new TopMenu(driver);
		
		//click on register link will identify the element and perform the action
		tpo.registr_click();  
		
		String expectedTitle = "Register: Mercury Tours";
		
		String actualTitle = driver.getTitle(); //current title of the page
		
		//comparing actual and expected page titles
		Assert.assertEquals(actualTitle, expectedTitle);
		
		//adding contact information on the registration page
		RegistrationPage rpo = new RegistrationPage(driver);
		
		//entering contact information on the registration page
		rpo.firstname_enterText("Usha");
		rpo.lastname_enterText("Bhat");
		rpo.phone_enterText("9999999999");
		rpo.email_enterText("ushapbhat@gmail.com");
		
		//entering mailing information
		rpo.address1_enterText("Block-3");
		rpo.address2_entertext("Malleswaram");
		rpo.city_entertext("Bangalore");
		rpo.state("Karnataka");
		rpo.postal_entertext("560054");
		rpo.coutry_select("INDIA");
		
		//user information
		rpo.uname_enterText("ushapbhat@gmail.com");
		rpo.password_enterText("usha123");
		rpo.confirm_enterText("usha123");
		
		//submitting the form
		rpo.submit_click();
		
		//asserting the success or failure
		
		String expectedMessage = "Dear Usha Bhat,";
		
		String actualMessage = driver.findElement(By.xpath("//b")).getText();
		
		Assert.assertEquals(actualMessage, expectedMessage);
		System.out.print("Test Passed");
		
	}
	
}
