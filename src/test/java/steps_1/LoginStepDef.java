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

import page_1.LoginPage_1;
import util_1.BrowserFactory_1;

public class LoginStepDef {
	WebDriver driver;
	LoginPage_1 loginPage1;

//	@Before
//	public void beforeRun() {
//		driver = BrowserFactory_1.startBrowser();
//		loginPage1=PageFactory.initElements(driver, LoginPage_1.class);  
//	}
	@Given("^User is on the Techfios login page$")
	public void user_is_on_the_Techfios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");
	}
	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_username_and_password(String username, String password) throws Throwable {
		loginPage1.enterCredentials(username, password);
		Thread.sleep(3000);
	}
	@Then("^User clicks on the signin button$")
	public void user_clicks_singin_button() throws Throwable {
		loginPage1.clickSigninButton();
		Thread.sleep(2000);
	}
	@And("^User will land on the Dashboard page$")
	public void user_will_land_on_the_Dashboard_page() throws Throwable {
	String expectedTitle = "Dashboard- iBilling";
	String actualTitle = loginPage1.getPageTitle();
	Assert.assertEquals(expectedTitle, actualTitle);
	loginPage1.takeScreenshotAtendofTest(driver);
	}
//	@After
//	public void tearDown() {
//		driver.close();
//		driver.quit();
//		
//	}
}
