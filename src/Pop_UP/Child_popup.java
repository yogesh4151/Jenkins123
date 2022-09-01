package Pop_UP;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_popup {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		//click on newtab link from main page
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
		
		//get childWindow ID
		Set<String> idofwindow = driver.getWindowHandles(); //{mainPageID, childWindowID}
		
		ArrayList<String> al=new ArrayList<String>(idofwindow); //{mainPageID(0), childWindowID(1)}
		
		String main = al.get(0);
		System.out.println(main);
		
		//get childWindow ID
		String child = al.get(1);
		System.out.println(child);
		
		//switch to childWindow
		driver.switchTo().window(child);  //String windowID
		
		//click on training link from child Window
		driver.findElement(By.xpath("(//span[@class='menu-text'])[22]")).click();
		
		
		
	}

}
