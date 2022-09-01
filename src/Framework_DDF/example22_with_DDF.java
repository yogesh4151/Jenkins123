package Framework_DDF;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example22_with_DDF 
{
	
public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
{
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day61-Framework Policy Bazar\\New Microsoft Excel Worksheet.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.policybazaar.com/");

		Thread.sleep(2000);
		
		//click on SignIN btn Login Page
		
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		Thread.sleep(2000);
		
		//enter mob number on Window1
		
		String mobile = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(mobile);
		
		//click on SignIn With pwd link
		
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
        Thread.sleep(2000);
		
		//enter pwd on window2
		
        String password = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		
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
		
		String expected = sh.getRow(0).getCell(2).getStringCellValue();
		
		String expectprofilename=expected;
		
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
