package Listblock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirFox {
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver",
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\MozillaFirefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.facebook.com/login/");

		System.out.println("Title:" + driver.getTitle());
		System.out.println("Window Handle : " + driver.getWindowHandle());

	}
}