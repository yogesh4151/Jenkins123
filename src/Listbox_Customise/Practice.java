package Listbox_Customise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");		

	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
	Thread.sleep(3000);
	
	WebElement ele = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	
	Actions act=new Actions(driver);
	
	act.click(ele).perform();
	
	act.sendKeys(Keys.HOME);
	
	for(int i=1;i<4;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}
	act.sendKeys(Keys.ENTER).perform();
	
	
	
	
//	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
//	
//	Thread.sleep(2000);
//	
//     WebElement month = driver.findElement(By.id("month"));
//	 
//	
//	Actions act=new Actions(driver);
//	
//	act.click(month).perform();
//	
//	Thread.sleep(2000);
//	
//	act.sendKeys(Keys.HOME).perform();
//	
//	Thread.sleep(2000);
//	
//	for(int i=1;i<4;i++)
//	{
//		act.sendKeys(Keys.ARROW_DOWN).perform();
//	}
//	Thread.sleep(2000);
//	
//	act.sendKeys(Keys.ENTER).perform();
	}
}
