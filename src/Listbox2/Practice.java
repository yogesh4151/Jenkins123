package Listbox2;

import java.nio.channels.Selector;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/HTML/country.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select file=new Select(country);
		
		List<WebElement> options = file.getOptions();
		
		for(WebElement s1:options)
		{
			System.out.println(s1.getText());
		}
		
		
	}

}
