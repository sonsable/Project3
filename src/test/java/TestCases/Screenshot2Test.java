package TestCases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SignupPage;
import Utility.Photos1;

public class Screenshot2Test extends TestBase {
	
SignupPage page;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		
		 page=new SignupPage();
		
	}
	
	@Test
	public void verifySignupTest()
	{
		page.verifySignup();
	}
	
	

	@AfterMethod
	
	public void exit(ITestResult obj) throws IOException
	{
		
		if(ITestResult.FAILURE==obj.getStatus())
		{
			
			Photos1.takephoto1(); //CALLING THIS METHOD FROM UTILITY PKG, AND PHOTOS CLASS
		}
			
			
		driver.quit();
	}


}
