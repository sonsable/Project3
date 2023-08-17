package Pages;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.TestBase;

public class SignupPage extends TestBase {
	
	@FindBy(xpath = "//img[@class='halflogo']") private WebElement rediffLogo;
	@FindBy(xpath = "//img[@name='img_captcha']") private WebElement captcha;
	
	@FindBy(xpath = "//input[@name='fullname']") private WebElement fullname;
	@FindBy(xpath = "//input[@name='emailid']") private WebElement emailid;
	@FindBy(xpath = "//input[@name='pass']") private WebElement password;
	@FindBy(xpath = "//input[@name='repass']") private WebElement retypePass;
	@FindBy(xpath = "//input[@value='m']") private WebElement Gendermale;
	@FindBy(xpath = "//input[@name='city']") private WebElement location;
	@FindBy(xpath = "//input[@name='school']") private WebElement school;
	@FindBy(xpath = "//input[@name='college']") private WebElement college;
	@FindBy(xpath = "//input[@value='Sign up']") private WebElement signupButton;
	
	
	public SignupPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void fillDetails() throws EncryptedDocumentException, IOException, InterruptedException
	
	{
		//--PASSING DATA FROM EXCEL FILE, WE NEED TO PASS METHOD NAME IN SEND KEYS
		
		fullname.sendKeys(readExcelFile(0, 0)); 
		emailid.sendKeys(readExcelFile(1, 0));
		password.sendKeys(readExcelFile(2, 0));
		retypePass.sendKeys(readExcelFile(3, 0));
		Gendermale.click();
		location.sendKeys(readExcelFile(4, 0));
		school.sendKeys(readExcelFile(5, 0));
		college.sendKeys(readExcelFile(6, 0));
	
		
		
		
		
	}
	
	
	public void verifySignup()
	{
		
		
		signupButton.isEnabled();
		
	}
	
	
	
	public void verifyLogo()
	
	{
		rediffLogo.isDisplayed();
	}
	
	
	public void verifyCaptcha()
	{
		captcha.isDisplayed();
		
	}
	
	public String verifyTitle()
	{
		
		return driver.getTitle();
	}

}
