package testNG2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_false 
{
	@Test
	public void Assertequals()
	{
		boolean actResult=true;
		Assert.assertFalse(actResult,"Failed : expected result false actual true: ");
	}
}