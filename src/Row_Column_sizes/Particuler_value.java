package Row_Column_sizes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Particuler_value {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/Yogesh/Automation/Day59-Tablerowandcolumn/table.html");
		
		//String text = driver.findElement(By.xpath("//table[@id='1234']//tr[1]/th[2]")).getText();
		//System.out.println(text);
		
		
		WebElement text = driver.findElement(By.xpath("(//table[@id='1234'])//tr[3]/td[2]"));
		
		System.out.println(text.getText());
//		String text = driver.findElement(By.xpath("//table[@id='1234']//tr[3]/td[2]")).getText();
//		System.out.println(text);
		
		
		
		
		
	}

}
