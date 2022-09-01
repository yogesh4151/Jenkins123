package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSigninMobnumpage {
	
	//POM class no 2
	
	@FindBy (xpath="(//input[@type='number'])[2]") private WebElement mobnum;
	@FindBy (xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signinwithpassword;
	
	public PBSigninMobnumpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPBSigninMobnumpagemobnum()
	{
		mobnum.sendKeys("9021739293");
	}
	
	public void clickPBSigninMobnumpagesigninwithpasswrd()
	{
		signinwithpassword.click();
	}

}
