package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class gettext {
	
	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
			
			     WebDriver driver=new ChromeDriver();
			     
			     driver.get("https://www.facebook.com/");
			     
			    // String result = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getText();
			   //System.out.println(result);
		
		WebElement result = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		
		String S = result.getText();
		
		System.out.println(S);
		
		
		
		
		
	}

}
