 package maven_crmPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import maven_crmBase.TestBase;

public class HomePage extends TestBase
{
	
	//
	public HomePage()
	{	
		PageFactory.initElements(driver, this);
	}
	
	//WebElements
	
	@FindBy (xpath = "//a[contains(text(),'Logout')]")
	WebElement logoutBtn ;
	
	@FindBy (xpath = "//*[contains(text(),'User:')]")
	WebElement userLable;
	
	@FindBy(xpath = "//a[@title='Companies']")
	WebElement companies;

	@FindBy(xpath = "//a[@title=\"New Company\"]")
	WebElement newcompaniesLink;
	
	
	//******************************************************	
	@FindBy(xpath = "//*[@title='Contacts']")
	WebElement contacts;
	
	@FindBy(xpath = "//*[@title=\'Deals\']")
	WebElement deals;
	
	@FindBy(xpath = "//*[@title='Tasks']")
	WebElement tasks;
	
//*******************************************************
	
	
//************************************************************************************
	
	//Action
	public void logout()
	{	
		driver.switchTo().frame("mainpanel");
		logoutBtn.click();
	}
	public boolean userNameLable()
	{
		driver.switchTo().frame("mainpanel");
		return userLable.isDisplayed();
	}
	
	public void ClickOnCreateCompany() 
	{
		driver.switchTo().frame("mainpanel");
		Actions act = new Actions(driver);
		act.moveToElement(companies).build().perform();
		newcompaniesLink.click();
	}
	
//	public void CreateContactsLink() 
//	{
//		driver.switchTo().frame("mainpanel");
//		Actions act = new Actions(driver);
//		act.moveToElement(companies).build().perform();
//		newcompaniesLink.click();
//		System.out.println("New Contact Created");
//		
//	}
//	
//	public void CreateDealLink() 
//	{
//		driver.switchTo().frame("mainpanel");
//		Actions act = new Actions(driver);
//		act.moveToElement(Deals).build().perform();
//		newDealLink.click();
//		
//	}
//	
//	public void CreateTasksLink() 
//	{
//		
//	}
//	
//	
//	
//	
//	
//	
}