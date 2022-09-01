package Page_Object_Module;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPasswordpage {
	
	//POM CLASS 3
	
	
	@FindBy (xpath="//input[@type='password']")private WebElement password;
	@FindBy (xpath="//a[@id='login-in-with-password']")private WebElement signin;
	
	public PBLoginPasswordpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setPBLoginPasswordpagePasswrd()
	{
		password.sendKeys("mh12ft1391");
		
	}
	
	public void clickPBLoginPasswordpagesignin()
	{
		signin.click();
	}
	
	
	

}
