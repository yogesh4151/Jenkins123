package Framework_Lect1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1_Without_DDF {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://kite.zerodha.com/");
		
		//enter UN
		driver.findElement(By.xpath("//input[@label='User ID']")).sendKeys("ZAX405");
		
		//enter PWD
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Akshay@1437");
		
		//click on login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("143707");
		
		//click on cnt btn
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//get user id
		String actual = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		String expected = "ZAX405";
		
		if(actual.equals(expected))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
