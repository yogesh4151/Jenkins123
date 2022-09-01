package testNG3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class exampe11_Parallel11 
{  
	@Test
	public void openfacebookapp() throws InterruptedException
	{
		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(5000);
	driver.close();

}
}