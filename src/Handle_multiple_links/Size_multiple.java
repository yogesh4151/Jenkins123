package Handle_multiple_links;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Size_multiple {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Yogesh/Automation/Day55-Multiple_links/checkbox.html");
		int multi = driver.findElements(By.xpath("//input[@type='checkbox']")).size();
		System.out.println(multi);
		
		
	}

}
