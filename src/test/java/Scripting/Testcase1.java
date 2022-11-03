package Scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtocartpage;
import pomPages.SkillraryDemoLogin;
import pomPages.Skillraryloginpage;

public class Testcase1 extends BaseClass {
	@Test 
	public void tc1() {
    Skillraryloginpage s1=new Skillraryloginpage();
    s1.gearsbutton();
    s1.skillrarydemoapp();

		
	driverutilies.switchtabs(driver);
		SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
		driverutilies.mouseHover1(driver, sd.getCoursetab());
		sd.seleniumtrainingbtn();
		
		Addtocartpage ad=new Addtocartpage(driver);
		driverutilies.doubleClick(driver,ad.getPlus());
		ad.cartbutton();
		driverutilies.alertpopup(driver);
	}
}
