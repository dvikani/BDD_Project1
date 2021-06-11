package steps_1;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import page_1.BankAndCashPage;
import page_1.LoginPage_1;
import util_1.BrowserFactory_1;

public class StepsDef_BankCash {
 
	WebDriver driver;
	LoginPage_1 loginPage1;
	BankAndCashPage bankandcash;
	
@Before	
	public void beforeRun() {
		driver = BrowserFactory_1.startBrowser();
		  
	}
	@Given("^User is on Techfios login page$")
	public void user_is_on_the_Techfios_login_page() {
		
		loginPage1 = PageFactory.initElements(driver, LoginPage_1.class);
	}
	@When("^User enter \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
		loginPage1.enterCredentials(username, password);
		Thread.sleep(3000);
	}
	@Then("^User clicks on signin button$")
	public void user_clicks_singin_button() throws Throwable {
		loginPage1.clickSigninButton();
		Thread.sleep(2000);
	}
	@And("^User will land on Dashboard page$")
	public void user_will_land_on_the_Dashboard_page() throws Throwable {
	String expectedTitle = "Dashboard- iBilling";
	String actualTitle = loginPage1.getPageTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	}
	@When("^User clicks on bank and cash$")
	public void user_clicks_on_bank_and_cash() throws Throwable {
		bankandcash = PageFactory.initElements(driver, BankAndCashPage.class);
		bankandcash.clickBankAndCashButton();
		
	}
	@When("^User clicks on new account$")
	public void user_clicks_on_new_account() throws Throwable {
		bankandcash.clickNewAccountButton();
	}
	@When("^User fill up the form entering \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"and \"([^\"]*)\"$")
	public void user_fill_up_the_form_entering_and_and_and_and_and_and_and(String accountTitle, String description, String initialBalance, String accountNumber, String contactPerson, String phone, String internetBankingUrl) throws Throwable {
	bankandcash.enterNewAccountCredentials(accountTitle, description, initialBalance, accountNumber, contactPerson, phone, internetBankingUrl);
//	bankandcash.enterAccountTitle(accountTitle);
//	bankandcash.enterDescription(description);
//	bankandcash.enterInitialBalance(initialBalance);
//	bankandcash.enterAccountNumber(accountNumber);
//	bankandcash.enterContactPerson(contactPerson);
//	bankandcash.enterPhonNumber(phone);
//	bankandcash.enterInternetBankinkingURL(internetBankingUrl);
	}
	 
	@And("^clicks on submit$")
	public void clicks_on_submit() throws Throwable { 
		bankandcash.clickOnSubmitButton();
	}
	@Then("^User should be able to see validate$")
	public void user_should_be_able_to_see_validate() throws Throwable { 
	String expectedTitle = "Accounts- iBilling";
	String actualTitle = bankandcash.getPageTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	}
	@After
	public void tearDown() {
		driver.close();
		driver.quit();
		
	}
}
