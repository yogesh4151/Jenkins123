package testNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_True_False 
{

	@Test
	public void True()
	{
		boolean Result=false;
		
		Assert.assertTrue(Result,"Failed- act Result is false: ");
	    
		
	}
	
	
	
	
}
