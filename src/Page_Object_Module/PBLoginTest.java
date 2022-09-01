package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Yogesh\\Automation\\Day34-Selenium Install\\Selenium\\chromedriver_103\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.policybazaar.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		//Login Page
		PBLoginPage login=new PBLoginPage(driver);
		login.clickonPBLoginPageSignIn();
		
		//Set mobile nos and click on sign in with pwd
		PBloginMobileNumber mobilenumpage=new PBloginMobileNumber(driver);
		mobilenumpage.setPBloginMobileNumbermobile();
		mobilenumpage.clickPBloginMobileNumberPagesigninwithPwd();
		
		// set password and sign in
		PBLoginPasswordpage passwrdpage=new PBLoginPasswordpage(driver);
		passwrdpage.setPBLoginPasswordpagePasswrd();
		passwrdpage.clickPBLoginPasswordpagesignin();
		
		
		Thread.sleep(2000);

		// move to user icon
		login.moveoverPBLoginPageMyACC();
		
		// click on user icon
		PBMyprofilepage UserIcon=new PBMyprofilepage(driver);
		UserIcon.clickPBMyprofilepageYourprofile();
		
		// move to child window and check profile name
		PBProfilepage profile=new PBProfilepage(driver);
		profile.switchtochildwindow();
		profile.gettextPBProfilepageprofilename();
		
		Thread.sleep(4000);
		driver.quit();
		
		
	}

}
