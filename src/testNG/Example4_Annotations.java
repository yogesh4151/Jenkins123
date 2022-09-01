package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Example4_Annotations {
	
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("Open browser",true);
	}
	
	@BeforeMethod
	public void Loginapp()
	{
		Reporter.log("Running app",true);
	}
	
	@Test
	public void TC1()
	{
		Reporter.log("Running of testcase",true);
	}
	
	@Test
	public void TC2()
	{
		Reporter.log("Running of testcase",true);
    }
	
	@AfterMethod
	public void Logoutapp()
	{
		Reporter.log("Running App", true);
	}
	
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("Cloasebrowser");
	}
	
		
}
