package testNG3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class example11_Parallel12 
{
	@Test
	public void openchromebrowser() throws InterruptedException 
	{
		
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.google.com/");
			Thread.sleep(3000);
			driver.close();

	}

}
