package maven_crmTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import maven_crmBase.TestBase;
import maven_crmPage.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginPage;//for access login page property
	
	@BeforeMethod
	public void iniinitalization() 

	{ 
		init();
		loginPage = new LoginPage();
	}
//**************************************************************	

	
	@Test
	public void validateLogoTest()
	{
		boolean Stetus = loginPage.isLogoDisplay();
		Assert.assertTrue(Stetus);//it aspect always true value 
	}
	
	@Test
	public void validateforgotPassword()
	{
		  loginPage.forgotPassword();
		  String forgotPasswordAttributeValue = driver.findElement(By.xpath("(//*[@type=\"submit\"])[2]")).getAttribute("value");
		  Assert.assertEquals(forgotPasswordAttributeValue, "Get Password");
	}
	@Test
	public void validateHomePageTest()
	{
		loginPage.login();
	}
	
	@Ignore
	@Test
	public void validateLoginPageLinks()
	{
		
	}
//************************************************************	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
//****************************************************************
}
