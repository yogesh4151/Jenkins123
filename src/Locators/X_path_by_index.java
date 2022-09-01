package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_by_index {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(3000);
		
		
		
		
		//enter FN
	     driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("abc");
				
		//enter surname
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("xyz");
				
		//enter mob no
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9999999999");
		
	}

}
