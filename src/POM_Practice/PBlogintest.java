package POM_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBlogintest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		PBSigninPage PBsign=new PBSigninPage(driver);
		PBsign.clickPBSigninPagesignin();
		
		PBSigninMobnumpage PBMobile=new PBSigninMobnumpage(driver);
		PBMobile.setPBSigninMobnumpagemobnum();
		PBMobile.clickPBSigninMobnumpagesigninwithpasswrd();
		
		PBSigninPasswordPage PBpassword=new PBSigninPasswordPage(driver);
		PBpassword.setPBSigninPasswordPagepassowrd();
		PBpassword.clickPBSigninPasswordPageSignin();
		
		Thread.sleep(3000);
		
		PBsign.movetoPBSigninPageusericon();
		
		PBusericonpage icon=new PBusericonpage(driver);
		icon.clickPBusericonpageyourprofile();
		
		PBprofilepage profile=new PBprofilepage(driver);
		profile.childwindowhandle();
		profile.gettextPBprofilepageprofilename();
		
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		
	}

}
