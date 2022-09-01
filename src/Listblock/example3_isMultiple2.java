package Listblock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example3_isMultiple2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver", 
			"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");		

	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	
	//click on create new acc link
			driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
			
			Thread.sleep(3000);
			
			//step1:
			WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
			
			Select s=new Select(month);
			
			boolean result = s.isMultiple();
			
			if(result==true)
			{
				System.out.println("listbox is of multi-selectable");
			}
			else
			{
				System.out.println("listbox is of single-selectable");
			}
			

}
}