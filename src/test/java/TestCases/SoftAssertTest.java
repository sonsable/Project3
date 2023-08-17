package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	
//IN SOFT ASSERT WE NEED TO CREATE OBJECT OF ASSERT
//Soft	Assert	does	not	throw	an	exception	when	an	assert	
//fails	and	would	continue	with	the	next	step	after	the	assert	statement	
	
	
	@Test
	public void method1()
	
	{
	//	Assert.assertEquals(false, false);
		
		SoftAssert s=new SoftAssert();
		
	//	s.assertEquals(false, false);
		System.out.println("method started");
		s.assertEquals(true, false);
		System.out.println("method ended");
		s.assertAll();           //IT SHOWS FAILED METHOD
		
}
}