package POM_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBusericonpage {
	
	//POM class no 4
	
	@FindBy (xpath="//span[text()=' My profile ']") private WebElement yourprofile;
	
	public PBusericonpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBusericonpageyourprofile()
	{
		yourprofile.click();
	}

}
