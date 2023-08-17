package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ParallelTest {
	
	
	//IN PARALLEL EXECUTION, AT A TIME TEST WILL EXECUTE BROWSERS WILL GET OPEN, ALSO WE CAN CHANGE HOW MANY TEST
	//WE WANT TO OPEN AT A TIME BY THREAD COUNT
	
	
	@Test
	public void fbTest() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions chrome=new ChromeOptions();
		
		chrome.addArguments("--remote-allow-origins=*"); 
		
		WebDriver	driver=new ChromeDriver(chrome);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	
	@Test
	public void flipkartTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions chrome=new ChromeOptions();
		
		chrome.addArguments("--remote-allow-origins=*"); 
		
		WebDriver	driver=new ChromeDriver(chrome);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.close();
	}
	
	
	@Test
	public void amazonTest() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions chrome=new ChromeOptions();
		
		chrome.addArguments("--remote-allow-origins=*"); 
		
		WebDriver	driver=new ChromeDriver(chrome);
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.close();
	}
}
