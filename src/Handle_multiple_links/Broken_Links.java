package Handle_multiple_links;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Broken_Links 
{
	public static void main(String[]args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\Yogesh\\\\Automation\\\\Day34-Selenium Install\\\\Selenium\\\\chromedriver_103\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		Thread.sleep(3000);
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for(int i=0;i<links.size();i++)
		{
			//by using href we get URL of required link
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			
			URL link=new URL(url);
			
			//create connection using URL object
			HttpURLConnection httpcon=(HttpURLConnection)link.openConnection();
			Thread.sleep(2000);
			
			//establishing connection
			httpcon.connect();
			
			int responsecode = httpcon.getResponseCode();
			
			if(responsecode>=400)
			{
				System.out.println(url+" - "+ "is broken link");
			}
			else
			{
				System.out.println(url+" - "+ "is valid link");
			}
			
			}
		
	}

}
