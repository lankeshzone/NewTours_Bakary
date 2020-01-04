package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import BaseTests.HomePageTests;

public class TestListener extends TestListenerAdapter
{
	static WebDriver driver;

	//Whenever a Particular TestNG class file finishes the execution
	public void onFinish(ITestContext testContext)
	{
		//log the information in log file
		//take a snapshot
		//capture test information(methodname, classname, starttime execution etc.,
		System.out.println("This was invoked after all Tests are finished in class file " + testContext.getAllTestMethods());
	}
	
	//Whenever a Particular TestNG class starts the execution
	public void onStart(ITestContext testContext)
	{
		System.out.println("This was invoked Before all Tests are executed in class file " + testContext.getAllTestMethods());
	}

	//Whenever a Particular TestNG Method fails the execution
	public void onTestFailure(ITestResult tr)
	{
		
		String filePath = "D://Test//" + tr.getTestName()+tr.getEndMillis() +".png";
		HomePageTests.spo.captureImage(filePath);
		
	}
	
	//Whenever a Particular TestNG Method skipped the execution
	public void onTestSkipped(ITestResult tr)
	{
		System.out.println("This test was skipped " + tr.getSkipCausedBy());
	}

	//Whenever a Particular TestNG Method start the execution
	public void onTestStart(ITestResult result)
	{
		System.out.println("The method that is started " + result.getTestName()+ ""+result.getMethod());
	}
	
	//Whenever a Particular TestNG Method Passed the execution
	public void onTestSuccess(ITestResult tr)
	{
		String filePath = "D://Test//" + tr.getTestName()+tr.getEndMillis() +".png"; 
		HomePageTests.spo.captureImage(filePath);
	}
	
}
