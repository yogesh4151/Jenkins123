package Pop_UP;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child2_popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		//click on newtab link from main page
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		//get childWindow ID
		Set<String> idofwindow = driver.getWindowHandles(); //{mainPageID, childWindowID}
		
		ArrayList<String> al=new ArrayList<String>(idofwindow); //{mainPageID(0), childWindowID(1)}
		
		
		//switch to childWindow
		driver.switchTo().window(al.get(1)); //String windowID
		
		//click on training link from child Window
		driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
		
		
		Thread.sleep(4000);
		//switch to main Page
		driver.switchTo().window(al.get(0));
		
		Thread.sleep(4000);
		
		//click on newWindow from main page 
		driver.findElement(By.xpath("//input[@name='NewWindow']")).click();
			
	}

}
