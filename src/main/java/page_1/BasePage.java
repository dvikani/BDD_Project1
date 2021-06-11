package page_1;

import java.util.Random;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
	
	public void selectElement(WebElement element, String text ) {
		Select sel = new Select(element);
		sel.selectByVisibleText(text);
	}
	
	public int randomNumber(int numbers) {
		Random random = new Random();
		int number = random.nextInt(numbers);
		return number;
		
	}
}
