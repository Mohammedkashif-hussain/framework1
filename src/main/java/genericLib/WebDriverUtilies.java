package genericLib;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilies {
	
	public void dropdown(WebElement ele,String text) {
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	    }
	public void mouseHover1(WebDriver driver,WebElement ele) {
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
		}
    public void rightclick(WebDriver driver,WebElement ele) {
        Actions a=new Actions(driver);
	    a.contextClick(ele).perform();}
  
    public void doubleClick(WebDriver driver,WebElement ele) {
	    Actions a=new Actions(driver);
		a.doubleClick(ele).perform();}

    public void draganddrop(WebDriver driver,WebElement src,WebElement destination) {
	   Actions a=new Actions(driver);
	   a.dragAndDrop(src,destination).perform();}
 
	public void switchFrame(WebDriver driver) {
		driver.switchTo().frame(0);
	}
	
	public void switchbackframe(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public void alertpopup(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	public void switchtabs(WebDriver driver) {
		Set<String> child = driver.getWindowHandles();
		for(String b:child) {
			driver.switchTo().window(b);}
	}
   public void ScrollBar(WebDriver driver,int X,int Y) {
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy("+X+","+Y+")");
   }}

	
