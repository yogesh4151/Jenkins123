package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBMyprofilepage {
	
	//POM CLASS 4
	
	
	@FindBy (xpath="//span[text()=' My profile ']") private WebElement Myprofile;
	
	
	
	public PBMyprofilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this );
	}

	public void clickPBMyprofilepageYourprofile()
	{
		Myprofile.click();
	}
}
