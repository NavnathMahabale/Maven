package maven_crmTests;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import maven_crmBase.TestBase;
import maven_crmPage.HomePage;
import maven_crmPage.LoginPage;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	@BeforeMethod
	public void initialization() 
	{
		init();
		loginPage = new LoginPage();
		homePage = loginPage.login();
		
	    //loginPage.HomePagelogin(); //instance create
	    //homePage = new HomePage();//call 
	}
	
	@Test (priority = 3)
	public void validateLogoutTest()
	
	{
 		homePage.logout();
	}
	
	@Test (priority = 1)
	public void validateUserNameTest()
	{
		boolean status = homePage.userNameLable();
		Assert.assertTrue(status);
	}
	
	@Test (priority = 2)
	public void validateCreatCompany_LinkRedirection()
	{
		homePage.ClickOnCreateCompany();
	}
	
	@Test
	public void validate_Create_Contacts_link_Redirectiontest() 
	{
		
	}
	
	
	@Test
	public void validate_Create_Deal_link_Redirectiontest() 
	{
		
	}
	
	
	@Test
	public void validate_Create_Tasks_link_Redirectiontest() 
	{
		
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
		
	}
}
