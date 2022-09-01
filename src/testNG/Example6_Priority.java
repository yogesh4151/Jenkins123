package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example6_Priority {
	
	@Test(priority=3)
	public void TC1() 
	{
		Reporter.log("--Running Test Case1--");
	}
	
	@Test(priority=2)
	public void TC2()
	{
		Reporter.log("--Running Test Case2--");
	}
	
	@Test(priority=1)
	public void TC3()
	{
		Reporter.log("--Running Test Case3--");
	}

}
