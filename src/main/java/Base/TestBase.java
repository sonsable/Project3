package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

//-------------------------------------------------------------------------------------------------------------------------------//

public class TestBase {
	
public static WebDriver driver;
	
    
	public static void initialization() throws InterruptedException, IOException
	
	{
		
	//---HERE IF ELSE IS USED FOR CROSS BROWSER TESTING------//
		
	String browsername=readPropertyFile("browser"); //we are taking browser name from property file
				
	if(browsername.equalsIgnoreCase("chrome"))	
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeOptions chrome=new ChromeOptions();
		
		chrome.addArguments("--remote-allow-origins=*"); //LIKE THIS WE CAN ADD MULTIPLE ARGUMENTS IN CHROMEOPTION OBJECT
		chrome.addArguments("--disable-notifications");
		driver=new ChromeDriver(chrome);
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
	}
	
	else if(browsername.equalsIgnoreCase("edge"))
		
	{
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Sonali Sable\\Desktop\\new Eclipse\\Project3\\msedgedriver.exe");
		
		EdgeOptions edge=new EdgeOptions();
		edge.addArguments("--remote-allow-origins=*"); //IN EDGE ALSO WE NEED TO DO THIS TO REMOVE WEBSOCKET EXCEPTION
		
		 driver=new EdgeDriver(edge);
		
	}
	
		 
//	    driver.get("https://is.rediff.com/signup//register");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies(); //it will delete all cookies
		driver.get(readPropertyFile("url"));
		 
		}


	public static String readPropertyFile(String value) throws IOException
	
	{
		
		Properties prop=new Properties();
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sonali Sable\\Desktop\\new Eclipse\\Project3\\src\\main\\java\\Configure\\config.property");
		
		prop.load(file);
		
		return prop.getProperty(value);
	}
	
	
	
	public String readExcelFile(int row, int col) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Sonali Sable\\Desktop\\new Eclipse\\Project3\\Testdata\\rediff data.xlsx");
		
	    Sheet xlSheet = WorkbookFactory.create(file).getSheet("Sheet1");
		
	  String value = xlSheet.getRow(row).getCell(col).getStringCellValue();
	    
	    return value;
		
	}
	
	
	//----------------------------------------------------------------------------------------------------------------------//
	
	
	
	
	
}
