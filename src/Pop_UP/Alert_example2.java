package Pop_UP;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_example2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Alert acc = driver.switchTo().alert();
		String text = acc.getText();
		
		System.out.println(text);
		
		//driver.switchTo().alert().accept();
		
		acc.accept();
		
		//driver.switchTo().alert().accept();
		
		acc.accept();
		
		
		}
	}
