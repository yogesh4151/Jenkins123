package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBloginMobileNumber {
	
	//POM CLASS 2
	
	@FindBy(xpath="(//input[@type='number'])[2]") private WebElement mobnum;
	@FindBy (xpath="(//span[text()='Sign in with Password'])[2]")  private WebElement signinwithpassrd;
	
	public PBloginMobileNumber(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void setPBloginMobileNumbermobile()
	{
	mobnum.sendKeys("9021739293");	
	}
	public void clickPBloginMobileNumberPagesigninwithPwd()
	{
		signinwithpassrd.click();
	}
}
