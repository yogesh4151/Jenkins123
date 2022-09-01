package Handle_multiple_links;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multpile_hanlde_example2 {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		//List<WebElement> multi = driver.findElements(By.xpath("//a"));
		
		//int size = multi.size();
		
		//System.out.println(size);
		
		int size = driver.findElements(By.xpath("//a")).size();
		
		System.out.println(size);
		
		
		
		
		
		
		
	}

}
