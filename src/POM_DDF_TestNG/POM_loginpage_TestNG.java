package POM_DDF_TestNG;

import static org.testng.Assert.assertEquals;

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

public class POM_loginpage_TestNG extends Base_class
{
	int a;
	PBSigninPage Signin;
	PBSignInWithmobileNumPage mobile;
	PBSignInwithPasswordPage Password;
	PBMyProfilePage profile;
	PBProfilePage name;
	
	
	
	@BeforeClass
	public void opnebrowser() throws EncryptedDocumentException, IOException
	{
		
		
		initializeBrowser();
		
		Signin=new PBSigninPage(driver);
		mobile=new PBSignInWithmobileNumPage(driver);
		Password=new PBSignInwithPasswordPage(driver);
		profile=new PBMyProfilePage(driver);
		name=new PBProfilePage(driver);
		a=10;
		
	}
	
	
	@BeforeMethod
	public void loginToapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Signin.clickPBSigninPagesignIN();
		mobile.setPBSignInWithmobileNumberPagepassword(Utility_class.getTD(0, 0));
		mobile.clickPBSignInWithmobileNumPagesigninwithpasswrd();
		Thread.sleep(3000);
		Password.setPBSignInwithPasswordPagepassword(Utility_class.getTD(0, 1));
		Password.clickPBSignInwithPasswordPageSignin();
		
	}
	
    @Test
	public void verifyuserID() throws InterruptedException, EncryptedDocumentException, IOException
	{
    	Thread.sleep(3000);
    	Signin.movetoPBSigninPageMyaccount();
		profile.clickPBMyProfilePageMyProfile();
		name.switchtochildwindow();
		//name.gettextPBProfilePageprofilname(sh.getRow(0).getCell(2).getStringCellValue());
		
		String actProfile=name.getPBProfilePageprofilename();
		String expProfile=Utility_class.getTD(0, 2);
		
		Assert.assertEquals(actProfile, expProfile);
	}
    
    @AfterMethod
    public void logoutToapp()
    {
    	
    }
    
    @AfterClass
    public void closebrowser()
    {
    	driver.quit();
    }
}
