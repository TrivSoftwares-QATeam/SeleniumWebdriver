package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollDown 
{
	
	@Test
	
	public void ScrollPageDown()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\_________SELENIUM_WEBDRIVER\\chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    
	    driver.get("http://www.jqueryui.com/");
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	    ((JavascriptExecutor)driver).executeScript("scroll(0,600)");
		
	}

}
