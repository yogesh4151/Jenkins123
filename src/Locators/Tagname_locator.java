package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_locator {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Yogesh/Automation/Day39-Locator%20Types%20All%20Programs/practice.html");
		
		driver.findElement(By.tagName("input")).sendKeys("abc");   
		
		//driver.findElement(By.id("email")).sendKeys("abc");
		
		
		
		
		
		
		
		
		
	}

}
