package TestNG_UtilityClass_BaseClass_FailedTCesScreenshot_PropertyFiles;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class 
{
	WebDriver driver;
	public void initializeBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\kotka\\eclipse-workspace\\Selenium\\Browserfile\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utility_class.getPFData("URL"));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	}

}
