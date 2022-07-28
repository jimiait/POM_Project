package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.ContactsPage;
import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class ContactsPageTest {
	
	WebDriver driver;
	
	@Test
	public void userShouldBeAbleToCreateNewCustomer() {
		driver = BrowserFactory.init();
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
		loginPage.insertUserName("demo@techfios.com");
		loginPage.insertPassword("abc123");
		loginPage.clickSignInButton();
		
		DashboardPage dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
		dashboardPage.validateDashboardPage("Dashboard");
		dashboardPage.clickCustomerManuElement();
		dashboardPage.clickAddCustomerManuElement();
		
		ContactsPage contactsPage = PageFactory.initElements(driver, ContactsPage.class);
		contactsPage.validateOfContactsPageHeader("Contacts");
		contactsPage.insertFullName("Saravan Tagore");
		contactsPage.selectCompany("Amazon");
		contactsPage.insertEmail("p@pop.com");
		contactsPage.insertPhoneNo("214-000-0001");
		
	}

}
