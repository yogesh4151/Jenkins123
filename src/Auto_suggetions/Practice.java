package Auto_suggetions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
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
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Redmi");
		
		Thread.sleep(2000);
		String exp="redmi not 10 pro";
		
		List<WebElement> mobile = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1])/li"));
		
		for(WebElement s1:mobile)
		{
			String act = s1.getText();
			if(act.equals(exp))
			{
				s1.click();
			}
		}
		
		
//		String expected="redmi note 10 pro";
//		
//		List<WebElement> mobs = driver.findElements(By.xpath("(//ul[@class='erkvQe'])//li"));
//		for(WebElement s1:mobs)
//		{
//			String act = s1.getText();
//			
//			if(act.equals(expected))
//			{
//				s1.click();
//			}
//		}
	
	}

}
