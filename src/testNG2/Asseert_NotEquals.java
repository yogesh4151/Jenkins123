package testNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asseert_NotEquals 
{

	@Test
	public void assertEquals() 
	{
		String actResult="Hello";
		String expResult="Hello";
		
		Assert.assertNotEquals(actResult,expResult, "Failed- both Results are same: ");				
	
	}
}
