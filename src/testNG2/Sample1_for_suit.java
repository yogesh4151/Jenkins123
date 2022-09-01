package testNG2;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample1_for_suit 
{
 
	@Test
	public void TC1()
	{
		Reporter.log("Running of test case 1",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running of test case 2",true);
	}
	
	@Test
	public void TC3()
	{
		Reporter.log("Running of test case 3",true);
	}
	
}
