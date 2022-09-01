package Listblock;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class yatra_website {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.yatra.com/");
		
		WebElement origin = driver.findElement(By.xpath("//span[@class='more-arr']"));
		
		origin.click();
		
		driver.findElement(By.xpath("//a[@id='booking_engine_adventures']")).click();
		
		//driver.findElement(By.xpath("(//input[@placeholder='Search for Activities or Destinations'])[6]");
		
		
		
		
		
		
		
		
		
	}

}
