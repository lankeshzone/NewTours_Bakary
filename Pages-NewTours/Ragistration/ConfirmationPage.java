
/* Created by CITS-Team for the training purpose
 * 
 * Date 24th Nov 2019
 */


package Ragistration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.PageUtility;

public class ConfirmationPage
{

	static WebDriver driver;
	
	static PageUtility pageUtility = new PageUtility();
	
	static WebElement verifyText;
	
	public ConfirmationPage(WebDriver d)
	{
		driver = d;
	}
	
	public void verifyText_Message()
	{
		verifyText = driver.findElement(pageUtility.locator("xpath", "//b[contains(text(),'Note: Your user name is .')]"));
	}
}
