package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.SignupPage;

public class HardAssertTest extends TestBase {
	
//HARD ASSERT IS MOSTLY USED TO COMPARE LOGIN BY USER ID AND PASSWORD, BECAUSE IT SHOULD THROW EXCEPTION IF DATA WRONG
	
//ASSEERTION IS USE TO VERIFY TEST RESULT, IT COMPARES ACTUAL RESULT WITH EXPECTED RESULT
	
	SignupPage page;
	
	@BeforeMethod
	
	public void setup() throws InterruptedException, IOException
	{
		initialization();
		
		 page=new SignupPage();
		
	}
	
//WHEN WE USE HARD ASSERT THEN IF THE TEST FAILS THEN  IT WILL SKIP LATER STATEMENTS OR LATER PART OF THAT TEST CASE 
//AND JUMP ON NEXT TEST CASE BUT IN SOFT ASSERT EVEN IF THE TEST FAILS IT WILL EXECUTE LATER PART OF THAT TEST CASE
	
	
	@Test
	public void verifyTitleTest()
	
	{
		String value = page.verifyTitle();
//		Assert.assertEquals("1Rediff.com", value);//here deliberatly i hv given wrong title of rediff to check assertion
		System.out.println("this is hard assertion"); //as this fails so it skips next part in a test case
	
		
//		Assert.assertTrue(false); //another way to fail a test case
//		Assert.assertFalse(false);//this way test case will be pass
//		Assert.assertFalse(true); //this way test case will be fail
//		
		Assert.assertEquals(true,value, "verify title test hardassert");//passing msg in assert
		
	}
	
	
	@AfterMethod
	
	public void exit()
	{
		driver.quit();
	}



}
