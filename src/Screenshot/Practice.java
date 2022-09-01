package Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Practice {
	
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
			
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apps.google.com/meet/?pli=1");
		
		String rs = RandomString.make(2);
		
		File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Yogesh\\Automation\\Day48-Screen shot\\Screenshot\\meet"+rs+".jpg");
		
		FileHandler.copy(scr, dest);
		
		
	
	}	
}