package CaptureScreenShot;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class First_Script 
{
	WebDriver driver;
	String baseUrl;
	
	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception 
	  {
		System.setProperty("webdriver.chrome.driver", "D:\\SELENIUM_WEBDRIVER\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    baseUrl = "http://clicks.aweber.com/y/ct/?l=JdKT9&m=3_dx7v7KqxQLjy9&b=XPmpPqdXY5pBIHt5A22KNg";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	    driver.get(baseUrl + "/");
	    Thread.sleep(10000);
	  }
	
	@Test
	public void restprogram() throws Exception
	{   
		
		 
		   /* if(driver.getPageSource().contains("This is demo site for"))
		    {
		    	System.out.println("text found");
		    }
		    else
		    {
		    	System.out.println("text not found");
		    }*/
		//or
		
	    String Verifytext= driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[1]/div/div/h2")).getText().trim();
	    Assert.assertEquals(Verifytext, "THIS IS DEMO SITE FOR");
	    System.out.println(Verifytext + " is the title text in home page ");
	    
	    driver.findElement(By.xpath("html/body/div[1]/div/header/div/div[3]/nav/ol/li[1]/a")).click();
	    String expectedTitle = "Mobile";
    	String actualTitle = driver.getTitle();
    	System.out.println("Actual title is "+actualTitle);
    	Assert.assertEquals(actualTitle, expectedTitle);
    	System.out.println("Actual title matches with expected title"); 
	    
    	Select selectelement  = new Select(driver.findElement(By.xpath("html/body/div[1]/div/div[2]/div/div[2]/div[1]/div[3]/div[1]/div[1]/div/select")));
    	selectelement.selectByVisibleText("Name");
	}
	
	@AfterClass
	public void browserQuit()
	{
		driver.quit();
	}
	

}
