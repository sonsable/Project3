package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SignupPage;

public class GroupTest1 extends TestBase{
	
SignupPage page;
	
	@BeforeMethod (groups = {"retest"})
	
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		
		 page=new SignupPage();
		
	}
	
	
	
	@Test 
	public void fillDetailsTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		page.fillDetails();
		System.out.println("hello");
	}
	
	
	@Test       (groups = {"retest"})      
	public void verifyLogoTest()
	{
		
		page.verifyLogo();

	}
	

	@Test 
	public void verifyCaptchaTest()
	{
		
		page.verifyCaptcha();
	}
	
	

	@AfterMethod (groups = {"retest"})
	
	public void exit()
	{
		driver.quit();
	}


}
