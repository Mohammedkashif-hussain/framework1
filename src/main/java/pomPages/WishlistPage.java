package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishlistPage {
	
	@FindBy(xpath="//button[@aria-label='Play']")
	private WebElement Playbtn;
	
	@FindBy(xpath="//button[@aria-label='pause']")
	private WebElement pausebtn;
	
	@FindBy(xpath="//span[text()='Add To Wishlist']")
	private WebElement addtowishlist;
	
	public WishlistPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void playbutton() {
		Playbtn.click();}
	
	public void pausebutton() {
		pausebtn.click();}
	
	public void addtowishlistbtn() {
	addtowishlist.click();
	}
			

}

