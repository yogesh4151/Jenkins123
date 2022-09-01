package testNG2;


import org.testng.Assert;
import org.testng.annotations.Test;


public class Notnull_assesrtion 
{

	@Test
	public void not_null()
	{
		String result=null;
		Assert.assertNotNull(result,"Failed: act Result is Null");
	}
}
