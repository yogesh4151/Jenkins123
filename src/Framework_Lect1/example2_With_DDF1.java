package Framework_Lect1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_With_DDF1 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day60-Framework Basic\\26 March Eve.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
		
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
		
		String actual = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		
		String expe=sh.getRow(0).getCell(3).getStringCellValue();
		
		if(actual.equals(expe))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		driver.quit();
		
		
	
	}

}
