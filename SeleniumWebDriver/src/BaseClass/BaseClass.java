package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass 
{
	
WebDriver driver;
	
	@BeforeMethod
	public void setupApplication()
	{
		Reporter.log("======Browser Session Started======", true);	
		
		System.setProperty("webdriver.chrome.driver", "D:\\_________SELENIUM_WEBDRIVER\\chromedriver.exe");	
		
	    driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();   
	    
	    driver.get("http://trivsoft.net/account/Login.aspx/");
	    
	    Reporter.log("======Application Started======", true);	    
	    	    
	    //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApplication()
	{
		driver.quit();
		// Generate repots in HTML //true means shows in console window //
		Reporter.log("======Browser Session End======", true);
		
	}

}
