package CaptureScreenShot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import lib.CaptureScreenShotUtility;

public class FaceBookScreenShot 
{
	WebDriver driver;
	@Test
	public void CaptureScreenShot() throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "D:\\_________SELENIUM_WEBDRIVER\\chromedriver.exe");
		
	    driver = new ChromeDriver();	    
	       
	    driver.manage().window().maximize();
	    
	    driver.get("http://trivsoft.net");
	    	    
    	driver.findElement(By.id("MainContent_txtUfgfgsername")).sendKeys("Test");   
	}
	
	@AfterMethod
	// ITestResult is a part of TestNG, this will keep the result of test case executed
	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			CaptureScreenShotUtility.CaptureScreen(driver, result.getName());
		}
		driver.quit();
	}

}
