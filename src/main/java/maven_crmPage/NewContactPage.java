package maven_crmPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import maven_crmBase.TestBase;

public class NewContactPage extends TestBase {

	
// web Element
	@FindBy(xpath = "//*[text()='Contacts']")
	WebElement contact;
	
//page factory
	public NewContactPage() {
		PageFactory.initElements(driver, this);
	}
	
// action	
	public void clickContactLink() {
		driver.switchTo().frame("mainpanel");
		contact.click();
	}
	
	
	
	
	
}
