package maven_crmTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import maven_crmBase.TestBase;
import maven_crmPage.LoginPage;
import maven_crmPage.NewContactPage;

public class NewContactPageTest extends TestBase{
	
	LoginPage loginPage;
	NewContactPage contactPage;
	@BeforeMethod
	public void initialization() {
		init();
		loginPage = new LoginPage();
		loginPage.login();
		contactPage = new NewContactPage();
	}
	
	
	@Test
	public void validateClickContactLink() {
		contactPage.clickContactLink();
	}
	
	
	@AfterMethod
	public void teardown() {
		driver.close();
	}
	
}
