package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice 
{
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
		
		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", facebook);
//		
//		WebElement facebook = driver.findElement(By.xpath("//a[text()='Facebook']"));
//		
//		Thread.sleep(3000);
//		
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", facebook);
	}

}
