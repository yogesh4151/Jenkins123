package Page_Object_Module;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilepage {
	
	//POM CLASS 5
	
	@FindBy (xpath="//div[text()='Yogesh Suresh Shinde']")public WebElement profilename;
	WebDriver driver1;
	
	public PBProfilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchtochildwindow()
	{
		Set<String> ids = driver1.getWindowHandles();
		ArrayList<String> id=new ArrayList<String>(ids);
		String childwindowid = id.get(1);
		
		driver1.switchTo().window(childwindowid);

	}
	
	public void gettextPBProfilepageprofilename()
	{
		String actualtext = profilename.getText();
		String expectedtext="Yogesh Suresh Shinde";
		
		if(actualtext.equals(expectedtext))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
	}
}
