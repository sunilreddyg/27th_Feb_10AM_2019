package pageobjects.With_Global_Constructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Signin 
{
	
	public Gmail_Signin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[contains(@id,'identifierId')]")
	WebElement Email_Editbox;
	
	@FindBy(xpath = "//content[contains(.,'Next')]")
	WebElement Email_next_btn;
	
	@FindBy(xpath = "//input[@name='password']")
	WebElement Password_Editbox;
	
	@FindBy(xpath = "//content[contains(.,'Next')]")
	WebElement Password_next_btn;
}
