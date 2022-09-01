package Handle_multiple_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Practice {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("file:///C:/Yogesh/Automation/Day55-Multiple_links/checkbox.html");
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement s1:checkboxes)
		{
			s1.click();
			Thread.sleep(1000);
		}
		
		for(int i=checkboxes.size()-1;i>=0;i--)
		{
			checkboxes.get(i).click();
		}
		
	}
}
