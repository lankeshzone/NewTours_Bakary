/*
 * Created by CITS-Team for the training purpose
 * Date 24th Nov 2019
 */

package Utility;

import org.openqa.selenium.By;

public class PageUtility 
{

	//method required to identify the By locator which user locator Type and locator Value
	public By locator(String locatortype,String locatorvalue)
	{
		By locator;
		
		switch (locatortype)
		{
			case "id":
				locator = By.id(locatorvalue);
				break;
			case "name":
				locator = By.name(locatorvalue);
				break;
			case "class":
				locator = By.className(locatorvalue);
				break;
			case "linktext":
				locator = By.linkText(locatorvalue);
				break;
			case "partial":
				locator = By.partialLinkText(locatorvalue);
				break;
			case "tag":
				locator = By.tagName(locatorvalue);
				break;
			case "xpath":
				locator = By.xpath(locatorvalue);
				break;
			case "csspath":
				locator = By.cssSelector(locatorvalue);
				break;
			default:
				locator = null;
		}
		return locator;
	}
	
}
