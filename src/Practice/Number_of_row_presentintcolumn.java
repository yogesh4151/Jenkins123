package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Number_of_row_presentintcolumn 
{
  public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Redmi");
		
		Thread.sleep(2000);
		
		String exp="redmi note 10 pro";
		
		List<WebElement> alloptions = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1])/li"));
		
		for(WebElement s1:alloptions)
		{
			 String actual = s1.getText();
		
		if(actual.equals(exp))
		{
			s1.click();
		}
}}

}
