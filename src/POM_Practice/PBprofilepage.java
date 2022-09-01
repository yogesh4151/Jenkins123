package POM_Practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBprofilepage {
	
	@FindBy (xpath="//div[text()='Yogesh Suresh Shinde']") private WebElement profilename;
	WebDriver driver1;
	
	public PBprofilepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void childwindowhandle()
	{
		Set<String> ids = driver1.getWindowHandles();
	    ArrayList<String> id=new ArrayList<String>(ids);
	    driver1.switchTo().window(id.get(1));
	               
	}
	
	
	public void gettextPBprofilepageprofilename()
	{
	String actualtext = profilename.getText();
	String expected="Yogesh Suresh Shinde";
	
	if(actualtext.equals(expected)) 
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
		
	}

}
