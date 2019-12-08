package BaseTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Sample
{

	//First one in the suite to be executed
	 @BeforeSuite
	  public void beforeSuite() 
	 {
		 System.out.println("before suite first one");
	  }
	 
	 //Second one
	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("before Test Second");
	  }
	 
	  //3rd one
	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("before class third");
	  }
	  
	  
	  //4th one
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("before test for each automatedtest");
	  }
	  
	  
	 //first test 
	@Test(priority=3, groups = {"sanity"})
  public void Test1() {
		 System.out.println("Test case one");
  }
	
	//second test
	@Test(priority=1, enabled=false)
	  public void Test2() {
		 System.out.println("Test case two");
	  }
	
	//third test
	@Test(priority=2, groups= {"others"})
	  public void Test3() {
		 System.out.println("Test case three");
	  }

	
	
  @AfterMethod
  public void afterMethod() {
	  System.out.println("after test for each automatedtest");
  }

  
 

  
  @AfterClass
  public void afterClass() {
	  System.out.println("after class ");
  }

  


  @AfterTest
  public void afterTest() {
	  System.out.println("after test ");
  }

  
 

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite ");
  }

}
