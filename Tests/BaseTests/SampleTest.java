package BaseTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Utility.ActionsEx;

public class SampleTest {

	public static void main(String[] args) 
	{
		
		WebDriver driver = new ChromeDriver();
		
		ActionsEx a = new ActionsEx(driver);
		
		driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
		
		WebElement slider = driver.findElement(By.className("ui-slider-handle"));
		a.movetoElement(slider, 120, 0);
		
	}

}
