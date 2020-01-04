package BaseTests;

import org.testng.annotations.Test;

public class TestTwo {

	
	@Test(enabled = true, groups = {"Smoke"})
	public void TC_004()
	{
		System.out.println("TestFour in TestOne NG class");
	}

	
	@Test(enabled = true, groups = {"Regression","Smoke"})
	public void TC_005()
	{
		System.out.println("TestFive in TestOne NG class");
	}
	
	
	@Test(enabled = true, groups = {"Smoke"})
	public void TC_006()
	{
		System.out.println("TestSix in TestOne NG class");
	}

}
