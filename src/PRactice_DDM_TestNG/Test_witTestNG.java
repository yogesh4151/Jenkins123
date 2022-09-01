package PRactice_DDM_TestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_witTestNG {
	
	
	PBSigninPage Signin;
	PBSignInWithmobileNumPage mobile;
	PBSignInwithPasswordPage Password;
	PBMyProfilePage profile;
	PBProfilePage name;
	Sheet sh;
	WebDriver driver;
	
	@BeforeClass 
	public void openbrowser() throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Yogesh\\Automation\\Day63-POM with DDF\\New Microsoft Excel Worksheet.xlsx");
		sh = WorkbookFactory.create(file).getSheet("DDF");
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Signin=new PBSigninPage(driver);
		mobile=new PBSignInWithmobileNumPage(driver);
		Password=new PBSignInwithPasswordPage(driver);
		profile=new PBMyProfilePage(driver);
		name=new PBProfilePage(driver);
		
	}

	@BeforeMethod
	public void loginToapp()
	{
		Signin.clickPBSigninPagesignIN();
		mobile.setPBSignInWithmobileNumberPagepassword(sh.getRow(0).getCell(0).getStringCellValue());
		mobile.clickPBSignInWithmobileNumPagesigninwithpasswrd();
		Password.setPBSignInwithPasswordPagepassword(sh.getRow(0).getCell(1).getStringCellValue());
		Password.clickPBSignInwithPasswordPageSignin();
		
		
	}
	
	@Test
	public void verifyPN()
	{
		Signin.movetoPBSigninPageMyaccount();
		profile.clickPBMyProfilePageMyProfile();
		name.switchtochildwindow();
		//name.gettextPBProfilePageprofilname(sh.getRow(0).getCell(2).getStringCellValue());
		
	     String actPN = name.getPBprofilepageActPN();
	     String expPN=sh.getRow(0).getCell(2).getStringCellValue();
		
		Assert.assertEquals(actPN, expPN,"Failed: both results are not equal");
	}
	
	@AfterMethod
	public void logoutFromApp() 
	{
		
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	

}
