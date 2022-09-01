package Listbox2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOption_from_multiSelectableListbox {
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/HTML/country.html");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='1234']"));
		
		Select s=new Select(country);
		
		s.selectByVisibleText("Ind");
		s.selectByVisibleText("Sri");
		s.selectByIndex(3);
		
		
		
		
	}

}
