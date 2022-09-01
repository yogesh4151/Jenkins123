package Auto_suggetions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_element {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		
		//click on close btn
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		//search mob
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("redmi note 10 pro");
		
		//click on search icon
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		
		//get Reviews
		String ratings = driver.findElement(By.xpath("(((//div[@class='_2kHMtA'])[3])//span)[6]")).getText();
		
		//String review = driver.findElement(By.xpath("")).getText();
		
		System.out.println(ratings);
		
		//System.out.println(review);
		
		
	}

}