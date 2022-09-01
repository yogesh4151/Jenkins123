package testNG2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert_True_False 
{
		@Test
		public void TC() 
		{
			SoftAssert soft=new SoftAssert();
			
			String actResult="Hello";
			String expResult="Hi";
			soft.assertEquals(actResult, expResult,"Failed1- both results are diff: ");
			
			boolean actResult1 = false;		
			soft.assertTrue(actResult1, "Failed2- act Result is false: ");
			
			soft.assertAll();
	}

}
