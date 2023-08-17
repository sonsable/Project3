package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SignupPage;

public class GroupTest extends TestBase {
	
SignupPage page;
	
	@BeforeMethod (groups = {"sanity"})
	
	//WE CAN WRITE MULTIPLE GROUP NAMES HERE SEPERATED BY COMMA, AS IT IS REQUIRED IF
	//WE ARE EXECUTING MULTIPLE GROUPS FROM SAME CLASS, ALSO NEED TO WRITE SAME IN AFTER METHOD .
	//BUT WHEN WE WANT TO EXCLUDE PARTICULAR GROUP IN XML FILE, THEN WE NEED TO REMOVE THAT GROUP FROM BEFORE METHOD AND
	//AFTER METHOD AS WELL, AS IT CREATED CONFUSION AND OUR TEST GETS FAILED
	
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		
		 page=new SignupPage();
		
	}
	
	
	
	@Test (groups = {"regression"})
	public void fillDetailsTest() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		page.fillDetails();
		System.out.println("hello");
	}
	
	
	@Test       (groups = {"sanity"})      
	public void verifyLogoTest()
	{
		
		page.verifyLogo();

	}
	

	@Test (groups = {"sanity"})
	public void verifyCaptchaTest()
	{
		
		page.verifyCaptcha();
	}
	
	

	@AfterMethod (groups = {"sanity"})
	
	public void exit()
	{
		driver.quit();
	}


}



