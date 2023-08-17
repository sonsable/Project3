package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SignupPage;


public class PriorityTest extends TestBase {

SignupPage page;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		
		 page=new SignupPage();
		
	}
	
	
	
	@Test (invocationCount = 2 ,priority = 2)    //it will 2 times executue
	public void fillDetailsTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		page.fillDetails();
		System.out.println("hello");
	}
	
	
	
	@Test              //NOT GIVEN PRIORITY HERE SO ITS DEFAULT PRIORITY IS 0, SO IT GETS INVOKE FIRST
	public void verifyLogoTest()
	{
		
		page.verifyLogo();

	}
	
	
	@Test (priority = 1)
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
