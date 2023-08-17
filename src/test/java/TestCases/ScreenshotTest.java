package TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SignupPage;
import Utility.Photos1;



public class ScreenshotTest extends TestBase{
	
	//----------screenshot of failed test case---------------//
	
	//ONCE THE TEST CASE GETS FAILED, THEN AFTER METHOD GETS EXECUTE SO WE WILL LET AFTER METHOD DECIDE 
	//WHEATHER TO CAPTURE OR NOT A SCREENSHOT BASED ON METHOD FAILURE
	//BECAUSE WE WANT IT TO TAKE SCREENSHOT AUTOMATICALLY
	
	SignupPage page;
		
	@BeforeMethod
	
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		
		 page=new SignupPage();
		
	}
	
	
	
	@Test
	public void verifyTitleTest()
	
	{
		String value = page.verifyTitle();
		Assert.assertEquals("1Rediff.com", value); //failing test case delibaratly to take screenshot
		
	}
	

	@AfterMethod
	
	public void exit(ITestResult obj) throws IOException
	
	{
			
		if(ITestResult.FAILURE==obj.getStatus()) //THIS WILL CHECK METHOD FAIL OR PASS
			
		{
			Photos1.takePhoto(obj.getName()); //CALLING SCREENSHOT CODE FROM UTILITY PKG, PHOTOS CLASS
			
			//here the getname method will get the name of method and store the screenshot with this name
			//bcz every time we can't give name to screenshots manually

		}
		
		driver.quit();
	}


}

	
	


