package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example_9_Timeout {
	
	@Test(timeOut=5000)
	public void TC1() throws InterruptedException
	{
		Reporter.log("--Running of testcase TC1");
		Thread.sleep(8000);
	}

}
