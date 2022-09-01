package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class clear {
	 public static void main(String[] args) throws InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
			
			     WebDriver driver=new ChromeDriver();
			     
			     driver.get("https://www.facebook.com/");
			     
			    // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
			    // Thread.sleep(2000);
			    // driver.findElement(By.xpath("//input[@type='text']")).clear();
			    // Thread.sleep(2000);
			    // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc");
			     
			     WebElement UN = driver.findElement(By.xpath("//input[@type='text']"));
			     
			     UN.sendKeys("xyz");
			     Thread.sleep(2000);
			     UN.clear();
			     Thread.sleep(2000);
			     UN.sendKeys("abc");
			    
		 
		 
		 
		 
		 
	}

}
