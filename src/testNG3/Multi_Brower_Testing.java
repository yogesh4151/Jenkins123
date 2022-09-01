package testNG3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import POM_DDM.PBMyProfilePage;
import POM_DDM.PBProfilePage;
import POM_DDM.PBSignInWithmobileNumPage;
import POM_DDM.PBSignInwithPasswordPage;
import POM_DDM.PBSigninPage;

public class Multi_Brower_Testing 
{
	
	@Parameters("browsername")
	@Test
	public void TC1(String browsername) throws InterruptedException, EncryptedDocumentException, IOException
	{
		WebDriver driver=null;
		
		if(browsername.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(browsername.equals("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", 
					"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\MozillaFirefox\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		}
		
		
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
		
		Thread.sleep(2000);
		
		PBMyProfilePage profile=new PBMyProfilePage(driver);
		profile.clickPBMyProfilePageMyProfile();
		
		PBProfilePage name=new PBProfilePage(driver);
		name.switchtochildwindow();
		
		
		name.gettextPBProfilePageprofilname(sh.getRow(0).getCell(2).getStringCellValue());
		
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
	}

}
