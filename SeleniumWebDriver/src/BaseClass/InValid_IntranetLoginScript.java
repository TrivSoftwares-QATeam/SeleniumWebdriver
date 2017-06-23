package BaseClass;


import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class InValid_IntranetLoginScript extends BaseClass
{

	@Test
	public void loginToApplication()	
	{
				 
	    driver.findElement(By.id("MainContent_txtUsername")).sendKeys("Ai12061");
	    
	    driver.findElement(By.id("MainContent_txtPassword")).sendKeys("Powe12r123");
	    
	    driver.findElement(By.id("MainContent_Button1")).click();
		
	    Reporter.log("======Click on Login Button Session Ended======", true);
	   
	}
	
	
}
