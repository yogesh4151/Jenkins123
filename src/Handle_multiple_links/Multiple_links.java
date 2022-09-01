package Handle_multiple_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_links {
	
	public static void main(String[] args) {
		
	
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");		
	
	 WebDriver driver = new ChromeDriver();
	 
	 driver.get("https://www.facebook.com/");
	 
	 List<WebElement> links = driver.findElements(By.xpath("//a"));
	 
	 for(WebElement s1:links)
	 {
		 
		 System.out.println(s1.getText()+" " +s1.getAttribute("href"));
	 }
	
}
}
