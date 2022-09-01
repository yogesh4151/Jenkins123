package Listblock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example1_selectOption_from_multiSelectableListbox {
	
public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");		
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/HTML/country.html");
		
		//step1:
				WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
				
				//step2: 
				Select s=new Select(selectCountry);
						
				//step3: 
				s.selectByVisibleText("Ind");
				s.selectByVisibleText("Sri");
				s.selectByIndex(3);
				//s.selectByValue("");   
				  		
		
}		

}
