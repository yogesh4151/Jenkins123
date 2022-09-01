package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class click {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		     WebDriver driver=new ChromeDriver();
		     
		     driver.get("https://www.facebook.com/");
		     
		     
		     //driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		     //Thread.sleep(2000);
		     WebElement result = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		     result.click();
		     
		     
		
	}

}
