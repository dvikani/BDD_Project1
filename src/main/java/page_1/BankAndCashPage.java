package page_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage extends BasePage {

	WebDriver driver;

	public BankAndCashPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//span[text() ='Bank & Cash']")
	WebElement BANK_AND_CASH_FIELD;
	@FindBy(how = How.XPATH, using = "//a[text() = 'New Account']")
	WebElement NEW_ACCOUNT_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='account']")
	WebElement ACCOUNT_TITLE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='description']")
	WebElement DESCRIPTION_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='balance']")
	WebElement INITIAL_BALANCE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='account_number']")
	WebElement ACCOUNT_NUMBER_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_person']")
	WebElement CONTACT_PERSON_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='contact_phone']")
	WebElement PHONE_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='ib_url']")
	WebElement INTERNET_BANKING_URL_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@class = 'btn btn-primary']")
	WebElement SUBMIT_FIELD;


	public String getPageTitle() {
		return driver.getTitle();
	}

	public void clickBankAndCashButton() {
		BANK_AND_CASH_FIELD.click();
	}

	public void clickNewAccountButton() {
		NEW_ACCOUNT_FIELD.click();
	}

	public void enterAccountTitle(String accountTitle) {
		ACCOUNT_TITLE_FIELD.sendKeys(accountTitle + randomNumber(99));
	}

	public void enterDescription(String description) {
		DESCRIPTION_FIELD.sendKeys(description);
	}

	public void enterInitialBalance(String initialBalance) {
		INITIAL_BALANCE_FIELD.sendKeys(initialBalance);
	}

	public void enterAccountNumber(String accountNumber) {
		ACCOUNT_NUMBER_FIELD.sendKeys(accountNumber + randomNumber(11));
	}

	public void enterContactPerson(String contactPerson) {
		CONTACT_PERSON_FIELD.sendKeys(contactPerson);
	}

	public void enterPhonNumber(String phone) {
		PHONE_FIELD.sendKeys(phone);
	}

	public void enterInternetBankinkingURL(String internetBankingUrl) {
		INTERNET_BANKING_URL_FIELD.sendKeys(internetBankingUrl);
	}

	public void enterNewAccountCredentials(String accountTitle, String description, String initialBalance,
		String accountNumber, String contactPerson, String phone, String internetBankingUrl) {
		ACCOUNT_TITLE_FIELD.sendKeys(accountTitle);
		DESCRIPTION_FIELD.sendKeys(description);
		INITIAL_BALANCE_FIELD.sendKeys(initialBalance);
		ACCOUNT_NUMBER_FIELD.sendKeys(accountNumber);
		CONTACT_PERSON_FIELD.sendKeys(contactPerson);
		PHONE_FIELD.sendKeys(phone);
		INTERNET_BANKING_URL_FIELD.sendKeys(internetBankingUrl);
	}

	public void clickOnSubmitButton() {
		SUBMIT_FIELD.click();
	}

}
