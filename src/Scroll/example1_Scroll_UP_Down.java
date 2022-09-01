package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Scroll_UP_Down {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
		
		
		// down --> 2nd parameter +ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,2000)");
		
		Thread.sleep(3000);		
		
		
		// up --> 2nd parameter -ve value
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-1000)");

			
		
		//		Thread.sleep(3000);
//		//right  --> 1st parameter +ve value
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(300,0)");
//		

		
//		Thread.sleep(3000);
//		//left  --> 1st parameter -ve value
//		((JavascriptExecutor)driver).executeScript("window.scrollBy(-300,0)");
//		
		
		
		
	}

}
