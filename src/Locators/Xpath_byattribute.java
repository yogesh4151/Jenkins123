package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_byattribute {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	//for username
	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9021739293");
	//for passward
	driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("AMsuresh1391$");
	//for log in
	driver.findElement(By.xpath("//button[@name='login']")).click();
	
	
		
		
	}

}
