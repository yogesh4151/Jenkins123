package testNG3;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example10_groupling1 
{
    @Test(groups = "Profile")
	public void TC1()
	{
		Reporter.log("--Running of TC1--",true);
	}
	
    @Test(groups = "Profile")
	public void TC2()
	{
		Reporter.log("--Running of TC2--",true);
	}
	
    @Test(groups = "login")
	public void TC3()
	{
		Reporter.log("--Running of TC3--",true);
	}
    
    @Test(groups = "login")
    public void TC4()
    {
    	Reporter.log("--Running of TC4 --",true);
    }
	
    
    @Test(groups = "Payment")
    public void TC5()
    {
    	Reporter.log("--Running of TC5 --",true);
    }
    
}
