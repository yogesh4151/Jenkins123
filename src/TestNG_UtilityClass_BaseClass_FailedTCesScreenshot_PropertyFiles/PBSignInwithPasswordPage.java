package TestNG_UtilityClass_BaseClass_FailedTCesScreenshot_PropertyFiles;

//class3

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSignInwithPasswordPage {
	
	@FindBy (xpath="//input[@type='password']") private WebElement password;
	@FindBy (xpath="//a[@id='login-in-with-password']") private WebElement Signin;
	
	public PBSignInwithPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setPBSignInwithPasswordPagepassword(String passrd)
	{
		password.sendKeys(passrd);
	}
	
	public void clickPBSignInwithPasswordPageSignin()
	{
		Signin.click();
	}
}
