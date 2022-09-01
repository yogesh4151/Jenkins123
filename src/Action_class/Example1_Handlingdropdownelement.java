package Action_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Example1_Handlingdropdownelement {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		

		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		//step 1
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		
		//step 2
		Actions act=new Actions(driver);
		
		//step 3
		act.moveToElement(login).perform();
		
		Thread.sleep(2000);
		
	    driver.findElement(By.xpath("//div[text()='Gift Cards']")).click();
		
		
		
		
	
		
	}

}
