package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Multiple_screenshot {
public static void main(String[] args) throws IOException{
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		 
		String RS = RandomString.make(2);
		 
		 File tmp = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File scr=new File("C:\\Yogesh\\Automation\\Day48-Screen shot\\Screenshot\\xyz1 "+RS+" .jpg");
		 FileHandler.copy(tmp,scr);
		 

}
}