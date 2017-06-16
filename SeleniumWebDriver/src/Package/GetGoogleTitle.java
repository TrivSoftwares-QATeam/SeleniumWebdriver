package Package;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetGoogleTitle {
	
	@Test
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D:\\_________SELENIUM_WEBDRIVER\\chromedriver.exe");	
	    WebDriver driver = new ChromeDriver();
	    //driver = new FirefoxDriver();
	    driver.get("http://www.google.co.in/");
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

}
