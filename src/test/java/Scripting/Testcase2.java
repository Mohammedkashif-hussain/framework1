package Scripting;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.SkillraryDemoLogin;
import pomPages.Skillraryloginpage;
import pomPages.TestingPage;

public class Testcase2 extends BaseClass{
	@Test
	public void tc2()
	Skillraryloginpage s=new Skillraryloginpage(driver);
	s.gearsbutton();
	s.skillrarydemoapp();
	
	driverutilies.switchtabs(driver);
	
	SkillraryDemoLogin sd=new SkillraryDemoLogin(driver);
	driverutilies.dropdown(sd.getCoursedd(),Pdata.getdata("dropdown")
	
	TestingPage tp=new TestingPage(driver);
	driverutilies.draganddrop(driver,tp.getSeleniumtraining(),tp.getTwitter())
	
	Point loc =tp.getTwitter().getLocation();
	int x = loc.getX();
	int y = loc.getY();
	driverutilies.ScrollBar(driver,x,y);
	
	tp.twitterlogo();
}
}
