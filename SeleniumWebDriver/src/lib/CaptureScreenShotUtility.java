package lib;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;


public class CaptureScreenShotUtility 
{
	
	public static void  CaptureScreen(WebDriver driver, String Screenshot)
	{
		
        try {
        	
        	//Cannot create object , forcefully Type casting TakesScreenshot to Driver //
        	
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			File src = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(src, new File("./ScreenShots/" + Screenshot + ".png"));
			
			System.out.println("ScreenShot Taken");
		    }
        
        catch (Exception e) 
        {
			System.out.println("Exception while taking screenshot" + e.getMessage());
		} 
	}
	
	
	

}
