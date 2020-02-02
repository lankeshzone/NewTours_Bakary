package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsEx {
	
	static WebDriver driver;
	static Actions act;
	static Action a;
	
	public ActionsEx(WebDriver driver)
	{
		this.driver = driver;
		act = new Actions(this.driver);
		
	}
	
	//use this for moving any element from current location to x/y offset
	public void movetoElement(WebElement element, int x, int y)
	{
		a = act.dragAndDropBy(element, x, y).build();
		a.perform();
	}
	
	public void complexAct(String action, WebElement e)
	{
		switch(action)
		{
		case "movetoElement":
			a = act.moveToElement(e).build();
			break;
			
		case "clickandhold":
			a=act.clickAndHold().build();
			break;
		}
		
		a.perform();
	}
	
	

}
