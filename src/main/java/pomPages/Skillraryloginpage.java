package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLib.PropertyFile;

public class Skillraryloginpage {
	
	@FindBy(xpath="'//a[text()=' GEARS ']")
	private WebElement gearsbutton;
	
	@FindBy(xpath="(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement demoapp;
	
	@FindBy(name="q")
	private WebElement searchtb;
	
	public void SkillraryloginLogin(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	public void gearsbutton() {
		gearsbutton.click();
	}
	public void skillrarydemoapp() {
		demoapp.click();	
	
		
	}

}
