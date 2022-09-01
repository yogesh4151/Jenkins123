package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBtestclass {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day63-POM with DDF\\New Microsoft Excel Worksheet.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
		
		PBSigninPage Signin=new PBSigninPage(driver);
		Signin.clickPBSigninPagesignIN();
		
		
		PBSignInWithmobileNumPage mobile=new PBSignInWithmobileNumPage(driver);
		
		mobile.setPBSignInWithmobileNumberPagepassword(sh.getRow(0).getCell(0).getStringCellValue());
		mobile.clickPBSignInWithmobileNumPagesigninwithpasswrd();
		
		PBSignInwithPasswordPage Password=new PBSignInwithPasswordPage(driver);
		
		Password.setPBSignInwithPasswordPagepassword(sh.getRow(0).getCell(1).getStringCellValue());
		Password.clickPBSignInwithPasswordPageSignin();
		
		Thread.sleep(3000);
		
		Signin.movetoPBSigninPageMyaccount();
		
		
		
		PBMyProfilePage profile=new PBMyProfilePage(driver);
		profile.clickPBMyProfilePageMyProfile();
		
		PBProfilePage name=new PBProfilePage(driver);
		name.switchtochildwindow();
		
		
		//name.gettextPBProfilePageprofilname(sh.getRow(0).getCell(2).getStringCellValue());
		
		
	}

	
}
