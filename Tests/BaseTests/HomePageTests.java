package BaseTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePage.SideMenu;
import Commons.HomePage;
import Utility.Screenshot;

@Listeners(Utility.TestListener.class)
public class HomePageTests 
{
	static WebDriver driver;
	static HomePage hpo;
	public static Screenshot spo;

	@BeforeClass
	public void beforeclass() 
	{
	
		driver = new ChromeDriver();
		
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		
		hpo = new HomePage(driver);
		login();
		verifylinks();
		
	}
	
	@Test(groups= {"regression"})
	public static void login()
	{
		spo = new Screenshot(driver);
		hpo.username_enter();
		hpo.password_enter();
		hpo.signon_click();
	//	spo.captureImage("D://Test//login1234.png");
	}

	@Test(groups= {"sanity"})
	public static void verifylinks()
	{
		spo = new Screenshot(driver);
		SideMenu spo = new SideMenu(driver);
		spo.home_click();
		hpo.destination_click();
		spo.home_click();
		hpo.vacation_click();
		spo.home_click();
		hpo.register_click();
	}
}
