package maven_crmPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven_crmBase.TestBase;

public class LoginPage extends TestBase{

	public LoginPage()
	{
		PageFactory.initElements(driver,this);
		
	}
	//WebElement Option
	@FindBy (name = "username")
	WebElement username;
	
	@FindBy (name = "password") 
	WebElement password;	
		
	@FindBy (xpath = "//input[@value=\"Login\"]")
	WebElement loginbtn;
//*********************************************************************************
	
	@FindBy(xpath ="//*[text()='Contact']")
	WebElement contactLink;
	
	@FindBy (xpath = "//*[text()='Forgot Password?']")
	WebElement forgotPasswodLink;
	
	@FindBy(xpath = "(//*[@class=\"img-responsive\"])[1]")
	WebElement logoImage;
	//*****************************************************************************	
	//Action
	
	public HomePage login()
	{
		
		username.sendKeys("speedway2016");
		password.sendKeys("Speedway@2016");
		loginbtn.click();
		return new HomePage(); 
		
		
	//	return new HomePage();
	//	HomePage homePage = new HomePage();
	}
	
	public void forgotPassword()
	{
		forgotPasswodLink.click();
		
	}
	
	public boolean isLogoDisplay()
	{
		boolean value = logoImage.isDisplayed();
		return value;
		
	}

}
