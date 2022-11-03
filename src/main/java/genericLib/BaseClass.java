package genericLib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.bouncycastle.util.test.SimpleTestResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
 public WebDriver driver;
 public PropertyFile Pdata=new PropertyFile();
 public WebDriverUtilies driverutilies=new WebDriverUtilies();
 
    @BeforeMethod
   public void openApp() throws IOException{
     WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get(Pdata.getdata("url"));
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 }
     @AfterMethod
   public void closeApp(ITestResult res) throws IOException {
    	 int status =res.getStatus();
    	 String name = res.getName();
    	 
    	 if(status==2) {
    		 Photo p=new Photo();
    		 p.getphoto(driver, name);
    	 }
	 driver.quit();
	 
 }
}
