package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Example2 {
	
	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", 
				"C:\\\\\\\\Yogesh\\\\\\\\Automation\\\\\\\\Day34-Selenium Install\\\\\\\\Selenium\\\\\\\\chromedriver_103\\\\\\\\chromedriver_win32\\\\\\\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		driver.switchTo().frame(driver.findElement(By.xpath("/")));
		String text = driver.findElement(By.xpath("//h1[text()='Not Found']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();


		
	}

}
