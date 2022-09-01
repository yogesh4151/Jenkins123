package testNG3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example10_grouping2 
{
	 @Test(groups = "Profile")
		public void TC6()
		{
			Reporter.log("--Running of TC6--",true);
		}
		
	    @Test(groups = "login")
		public void TC7()
		{
			Reporter.log("--Running of TC7--",true);
		}
		
	    @Test(groups = "login")
		public void TC8()
		{
			Reporter.log("--Running of TC8--",true);
		}
	    
	    @Test(groups = "payment")
	    public void TC9()
	    {
	    	Reporter.log("--Running of TC9 --",true);
	    }
		

}
