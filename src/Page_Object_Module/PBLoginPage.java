package Page_Object_Module;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBLoginPage 
{
	//POM CLASS 1
	
	//step no 1
	@FindBy(xpath="//a[@class='sign-in']") private WebElement Signin;
	//private WebElement Signin=driver.findelement(By.xpath("//a[@class='sign-in']"));
	
	@FindBy (xpath="(//i[@class='arrow'])[5]")private WebElement MyACC;
	
	WebDriver driver1;
	
	//step 2: Initialisation
	
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	//step3:
	public void clickonPBLoginPageSignIn()
	{
		Signin.click();
	}
	
	public void moveoverPBLoginPageMyACC()
	{
		Actions act=new Actions(driver1);
		
		act.moveToElement(MyACC).perform();
		
		
	}

}
