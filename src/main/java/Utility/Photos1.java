package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.TestBase;

public class Photos1 extends TestBase{
	
	
	//---------------------SCREENSHOT---------------------------//
	
//-------------BELOW METHOD SAVES INDIVIDUAL SCREENSHOT WITH THEIR METHOD NAME
	
	public static void takePhoto(String name) throws IOException
		{
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("C:\\Users\\Sonali Sable\\Desktop\\new Eclipse\\Project3\\Screenshots\\"+name+".jpg");
	
	FileUtils.copyFile(source, dest);
	
		}
	
	
//---------BELOW METHOD SAVES SCREENSHOT WITH CLICK NAME, AND EVERYTIME NEW SCREENSHOT WILL OVERRIDE OLD ONE
		
	public static void takephoto1() throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dst=new File("C:\\Users\\Sonali Sable\\Desktop\\new Eclipse\\Project3\\Screenshots\\click.jpg");
		
		FileUtils.copyFile(src, dst);
		
	}
	

}
