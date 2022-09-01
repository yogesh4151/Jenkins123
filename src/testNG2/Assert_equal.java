package testNG2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_equal 
{
	@Test
	public void equal()
	{
		String act="Hello";
		String exp="Hi";
		
		
		Assert.assertEquals(act, exp,"Failed1 Both results anre diff:");
	}

}
