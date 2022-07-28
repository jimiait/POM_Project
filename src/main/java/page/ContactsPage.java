package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactsPage extends BasePage{
	
	WebDriver driver;
	
	public ContactsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//h2[contains(text(), ' Contacts')]") WebElement CONTACTS_PAGE_HEADER;
	@FindBy(how = How.XPATH, using = "//input[@id='account']") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//select[@id='cid']") WebElement COMPANY_DROPDOWN_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='email']") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='phone']") WebElement PHONE_NUMBER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='address']") WebElement ADDRESS_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"city\"]") WebElement CITY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"state\"]") WebElement STATE_REGION_ELEMENT;
	
	
	public void validateOfContactsPageHeader(String contactsPageHeader) {
		Assert.assertEquals(CONTACTS_PAGE_HEADER.getText(), contactsPageHeader, "Contacts Page Header is not available");
	}
	
	public void insertFullName(String fullName) {
		int generateNumber = generateRandomNo(999);
		FULL_NAME_ELEMENT.sendKeys(fullName + generateNumber);
	}
	
	public void selectCompany(String company) {
		selectFromDropdown(COMPANY_DROPDOWN_ELEMENT,company);
	}

	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generateRandomNo(999)+email);
	}
	
	public void insertPhoneNo(String phoneNo) {
		PHONE_NUMBER_ELEMENT.sendKeys(phoneNo);
	}
	
	
	
	

}
