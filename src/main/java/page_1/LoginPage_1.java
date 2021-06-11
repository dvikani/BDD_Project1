package page_1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage_1 {
	WebDriver driver;

	public LoginPage_1(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_FIELD;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement SIGNIN_FIELD;

	public void enterCredentials(String userName, String password) {
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(password);
	}

	public void clickSigninButton() {
		SIGNIN_FIELD.click();
	}

	public String getPageTitle() {
		return driver.getTitle();
	}

	public void takeScreenshotAtendofTest(WebDriver driver) throws IOException {
		TakesScreenshot ts = ((TakesScreenshot) driver);
		SimpleDateFormat formatter = new SimpleDateFormat("MMddyy_HHmmss");
		Date date = new Date();
		String lable = formatter.format(date);
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		String currentDirectory = System.getProperty("user.dir");
		FileUtils.copyFile(sourcefile, new File(currentDirectory + "/screenshot/" + lable +".png"));

	}
}
