package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example5_Invocation {
	
	@Test(invocationCount=5)
	public void TC3()
	{
		Reporter.log("--running test case--",true);
	}

}
