package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example10_DependsOnMethods 
{
	@Test
	public void Username()
	{
		Reporter.log("--Enter Username--");
	}
	
	@Test
	public void Password()
	{
		Reporter.log("--Enter Password--");
	}
	
	@Test(dependsOnMethods= {"Username","Password"})
	public void Login()
	{
		Reporter.log("--Login Page---");
	}
	
	

}
