package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSigninPasswordPage {
	
	//POM class no 3
	
	@FindBy (xpath="//input[@type='password']") private WebElement password;
	@FindBy (xpath="//span[text()='Sign in']") private WebElement signin;
	
	public PBSigninPasswordPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPBSigninPasswordPagepassowrd()
	{
		password.sendKeys("mh12ft1391");
	}
	
	public void clickPBSigninPasswordPageSignin()
	{
		signin.click();
	}

}
