package BaseTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePage.SideMenu;
import Commons.HomePage;
import Utility.Driver;
import Utility.Screenshot;

@Listeners(Utility.TestListener.class)
public class HomePageTests 
{
	static WebDriver driver;
	static HomePage hpo;
	public static Screenshot so;
	static ITestResult itr;
	static String filePath;
	static Driver dr;
	
	@BeforeClass
	public void beforeclass() 
	{
		dr = new Driver(driver);
	
		driver = dr.setupBrowser("chrome", "http://newtours.demoaut.com/mercurywelcome.php");
		
		//driver.get();
		so = new Screenshot(driver);
		hpo = new HomePage(driver);
		
		
	}
	
	@Test(groups= {"regression"})
	public static void login()
	{
		
	//	filePath = "D://Test//snapshots//test_login.png"; 
		
		hpo.username_enter();
		hpo.password_enter();
		hpo.signon_click();
	//	so.captureImage(filePath);
	}

	@Test(groups= {"sanity"})
	public static void verifylinks()
	{
		//filePath = "D://Test//snapshots//test_verifyLinks.png"; 
		
		SideMenu spo = new SideMenu(driver);
		spo.home_click();
		hpo.destination_click();
		spo.home_click();
		hpo.vacation_click();
		spo.home_click();
		hpo.register_click();
		//so.captureImage(filePath);
	}
}
