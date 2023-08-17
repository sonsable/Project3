package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SignupPage;

public class SignupPageTest extends TestBase {
	
	SignupPage page;
	
	@BeforeMethod
	
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
	
	
	
	@Test     
	public void verifyLogoTest()
	{
		
		page.verifyLogo();

	}
	
	
	@Test
	public void verifyCaptchaTest()
	{
		
		page.verifyCaptcha();
	}
	
	@Test
	public void verifyTitleTest()
	
	{
		String value = page.verifyTitle();
		Assert.assertEquals("Rediff.com", value);
		
	}
	
	public void verifySignupTest()
	{
		page.verifySignup();
	}
	

	@AfterMethod
	
	public void exit()
	{
		driver.quit();
	}


}
