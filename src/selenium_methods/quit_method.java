package selenium_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class quit_method {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		    WebDriver driver=new ChromeDriver();
		    
		    driver.get("https://www.flipkart.com/");
		    Thread.sleep(3000);
		    
		    driver.quit();
	}

}
