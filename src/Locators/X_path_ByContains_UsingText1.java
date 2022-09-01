package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_ByContains_UsingText1 {
	
	public static void main(String[] args) {
		
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			
			//click on forgotten pwd link
			driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();
		
		
		
		
	}
}
