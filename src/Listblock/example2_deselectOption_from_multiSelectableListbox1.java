package Listblock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class example2_deselectOption_from_multiSelectableListbox1 {

	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");		
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("file:///C:/HTML/country.html");
		
	    WebElement selectcountry = driver.findElement(By.xpath("//select[@id='1234']"));
	    
	    Select s=new Select(selectcountry);
	    
	  //select options
	  		s.selectByIndex(0);
	  		s.selectByIndex(1);
	  		s.selectByIndex(3);
	  		
	  		Thread.sleep(2000);
	  		
	  		//deselect options
	  		s.deselectByIndex(1);
	  		s.deselectByVisibleText("Ind");
	  		//s.deselectByValue("");
	    
	}
}
