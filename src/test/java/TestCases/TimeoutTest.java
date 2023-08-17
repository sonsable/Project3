package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SignupPage;

//IF WE PURPOSEFULLY WANT TO FAIL A TEST Case THEN WE CAN USE TIMEOUT
//IF WE WANT TO CHECK IF PARTICULAR TEST NEEDS TO EXECUTE WITHIN A PARTICULAR TIME limit THEN WE CAN USE TIMEOUT.

public class TimeoutTest extends TestBase{
	
SignupPage page;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		
		 page=new SignupPage();
		
	}
	
	
	
	@Test (timeOut = 20) //given very less time here, so it got fail
	public void fillDetailsTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		page.fillDetails();
		System.out.println("hello");
	}
	

	
	@Test    (timeOut = 500) 
	public void verifyLogoTest()
	{
		
		page.verifyLogo();

	}
	
	
	@Test(timeOut = 2000)
	public void verifyCaptchaTest()
	{
		
		page.verifyCaptcha();
	}
	

	@AfterMethod
	
	public void exit()
	{
		driver.quit();
	}



}


