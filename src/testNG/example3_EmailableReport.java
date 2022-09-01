package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class example3_EmailableReport 
{
  @Test
  public void TC1()
  {
	  Reporter.log("Running of TC1");
  }
  
  @Test
  public void TC2()
  {
	  System.out.println("Running of text class 2");
  }
  
  @Test
  public void TC3()
  {
	  System.out.println("Running of text class 3");
  }
}
