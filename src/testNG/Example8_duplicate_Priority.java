package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example8_duplicate_Priority 
{
	@Test                      //bydefault priority=0
	public void TC4()
	{
		Reporter.log("--running TC4--", true);
	}
	
	@Test(priority=-1)        //priority -ve value
	public void TC3()
	{
		Reporter.log("--running TC3--", true);
	}
	
	
	@Test(priority=2)        //duplicate priority=2
	public void TC2()
	{
		Reporter.log("--running TC2--", true);
	}
	
		
	@Test(priority=2)         //duplicate priority=2
	public void TC1()
	{
		Reporter.log("--running TC1--", true);
	}

}
