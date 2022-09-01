package testNG2;


import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_Null 
{
	@Test
	public void assertnull()
	{
		String act="abc";
		Assert.assertNull(act,"Fail act result not null ");
	}

}
