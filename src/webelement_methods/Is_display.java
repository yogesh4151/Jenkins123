package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_display {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", 
					"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
			
			     WebDriver driver=new ChromeDriver();
			     
			     driver.get("https://www.facebook.com/");
			     
			     boolean fb = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
			     System.out.println(fb);
			     
			     if(fb==true)
			     {
			    	 System.out.println("Element is display");
			     }
			     else
			     {
			    	 System.out.println("Element not display");
			     }
}
}