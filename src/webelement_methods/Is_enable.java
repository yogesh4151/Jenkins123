package webelement_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Is_enable {
	public static void main(String[] args) 
	{
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		boolean result = driver.findElement(By.xpath("//button[@name='login']")).isEnabled();
		       System.out.println(result);
		       
		      if(result==true)
		      {
		    	  System.out.println("Login button is enable");
		      }
		      else
		      {
		    	  System.out.println("Login button is disable");
		      }
		
	}
	

}
