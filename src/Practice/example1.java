package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example1 {
	
	public static void main(String[]args) throws InterruptedException
	{

	  System.setProperty("webdriver.chrome.driver",
	            "C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");

	WebDriver driver=new ChromeDriver();
    
	driver.get("https://www.facebook.com/");
	
	driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	
	Thread.sleep(3000);
	
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	
	Actions act=new Actions(driver);
	
	act.click(month).perform();
	
	Thread.sleep(3000);
	
	act.sendKeys(Keys.HOME).perform();
	
	for(int i=1;i<=7;i++)
	{
		act.sendKeys(Keys.ARROW_DOWN).perform();
	}
	Thread.sleep(3000);
	
	act.sendKeys(Keys.ENTER).perform();
	
		
	

}


		
}
