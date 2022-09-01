package Row_Column_sizes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rowsize {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Yogesh/Automation/Day59-Tablerowandcolumn/table.html");
//		
//		List<WebElement> row = driver.findElements(By.xpath("//table[@id='1234']//tr"));
//		
//		int size = row.size();
		
//		System.out.println(size);
		
		int size = driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
		
		System.out.println(size);
		
		
		
		
		
		
		
		
		
	}

}
