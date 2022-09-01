package POM_Practice;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBSigninPage {
	
	//POM class no 1 
	
	@FindBy (xpath="//a[@class='sign-in']") private WebElement Signin;
	
	@FindBy (xpath="(//i[@class='arrow'])[5]") private WebElement usericon;
	
	WebDriver driver1;
	
	public PBSigninPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void clickPBSigninPagesignin()
	{
		Signin.click();
	}
	
	public void movetoPBSigninPageusericon()
	{
		Actions act=new Actions(driver1);
		act.moveToElement(usericon).perform();
		
	}
	
	

}
