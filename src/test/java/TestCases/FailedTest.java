package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SignupPage;

public class FailedTest extends TestBase{
	

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
		Assert.assertEquals("1Rediff.com", value);//intentionally failing it so that it gets added testng.failedxml
		
	}
	

	@AfterMethod
	
	public void exit()
	{
		driver.quit();
	}
	
	
	

}
