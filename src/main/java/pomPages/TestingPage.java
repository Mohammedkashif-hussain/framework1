package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TestingPage {
	

	@FindBy(id="cartArea")
	private WebElement cart;
	private WebElement twitter;
	private WebElement seleniumtraining;
	
	public WebElement getSeleniumtraining() {
		return seleniumtraining;
	}
	public WebElement getCart() {
		return cart;
	}
	
	public WebElement getTwitter() {
		return twitter;
	}

	@FindBy(xpath="(//i[@class='fa fa-twitter'])[2]")
	private WebElement twitter1;
}
