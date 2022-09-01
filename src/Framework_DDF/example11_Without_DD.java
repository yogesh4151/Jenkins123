package Framework_DDF;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example11_Without_DD {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		Thread.sleep(2000);
		
		//click on SignIN btn Login Page
		
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		Thread.sleep(2000);
		
		//enter mob number on Window1
		
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9021739293");
		
		//click on SignIn With pwd link
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
        Thread.sleep(2000);
		
		//enter pwd on window2
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("mh12ft1391");
		
		//enter SignIn btn
		
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
        Thread.sleep(2000);
		
		//display options from UserIcon dropdown from home page
		
		WebElement profile = driver.findElement(By.xpath("(//a[@class='signed'])[1]"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		
		act.moveToElement(profile).perform();
		
		//click on Your Profile link from dropdown element
		
		driver.findElement(By.xpath("//span[text()=' Your profile ']")).click();
		
		//switch to child window
		
		Set<String> IDS = driver.getWindowHandles();
		
		ArrayList<String> ID=new ArrayList<String>(IDS);
 		
		driver.switchTo().window(ID.get(1));
		
		//get profileName child window
		String actualprofilename = driver.findElement(By.xpath("//div[text()='Yogesh Suresh Shinde']")).getText();
		
		String expectprofilename="Yogesh Suresh Shinde";
		
		if(actualprofilename.equals(expectprofilename))
		{
			System.out.println("Pass: login to correct profile");
		}
		else
		{
			System.out.println("Fail: login to wrong profile ");
		}
		
	}

}
