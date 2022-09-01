package POM_DDF_TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class 
{
	WebDriver driver;
	public void initializeBrowser()
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kotka\\eclipse-workspace\\Selenium\\Browserfile\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

}
