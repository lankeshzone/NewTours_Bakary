package BaseTests;

import org.testng.annotations.Test;

public class TestOne {
	
	@Test(priority = 0, enabled = true, groups = {"Regression"})
	public void TC_001()
	{
		System.out.println("TestOne in TestOne NG class");
	}

	
	@Test(priority=2, enabled = true, groups = {"Regression"})
	public void TC_002()
	{
		System.out.println("TestTwo in TestOne NG class");
	}
	
	
	@Test(priority=1, enabled = true,groups = {"Smoke"})
	public void TC_003()
	{
		System.out.println("TestThree in TestOne NG class");
	}
}
