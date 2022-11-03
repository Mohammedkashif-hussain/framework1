package Scripting;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.Addtocartpage;
import pomPages.CorejavaPage;
import pomPages.SkillraryDemoLogin;
import pomPages.Skillraryloginpage;

public class Testcase3  extends BaseClass{
	
	@Test
	public void tc3() {
	    Skillraryloginpage s1=new Skillraryloginpage();
	    s1.searchtextbox(Pdata.getdata("coursename"));
	    s1.searchbutton();
			
	    CorejavaPage cp=new CorejavaPage(driver);
	    cp.java
	    
	    WishlistPage wp=new WishlisiPage(driver);
	    driverutilies.switchFrame(driver);
	    wp.playbutton();
	    Thread.sleep(10000);
	    wp.pausebutton();
	    driverutilies.switchbackframe(driver);
	    wp.addtowishlistbtn();
	    
	    
	}

}
