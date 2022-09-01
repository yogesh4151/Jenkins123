package Listbox2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class example4_getSelectedOption_FromSingleSelectable_Listbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		//step1
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select s=new Select(month);
		
		//WebElement selectoption = s.getFirstSelectedOption();
		//String text = selectoption.getText();
		//System.out.println(text);
		
		//String text = s.getFirstSelectedOption().getText();
		//System.out.println(text);
		System.out.println(s.getFirstSelectedOption().getText());
		
	}

}
