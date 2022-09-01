package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_example1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("a077aa5e");  //string by id
		
		  //driver.switchTo().frame("a077aa5e");   //string by name
		  
		  //driver.switchTo().frame(1); //by index
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='a077aa5e']")));  //frame webElement
		
		
		//click on click me btn
		  
		driver.findElement(By.xpath("//img[@src='Jmeter720.png']")).click();
		
		
		
	}

}
