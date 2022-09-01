package Row_Column_sizes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Columnsize {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Yogesh/Automation/Day59-Tablerowandcolumn/table.html");
		
//		//columnsize header
		//int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr[1]/th")).size();
		
		//System.out.println(colsize);
		
		int colsize = driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		
		System.out.println(colsize);
	}

}
