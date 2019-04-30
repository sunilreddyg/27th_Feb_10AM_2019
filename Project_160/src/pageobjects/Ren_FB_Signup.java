package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Ren_FB_Signup
{
	
	public static void main(String args[])
	{
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Create factory class to idenfify elements
		FB_Signup signup=PageFactory.initElements(driver, FB_Signup.class);
		
		signup.Firstname_EB.clear();
		signup.Firstname_EB.sendKeys(signup.IP_Firstname);
		
		signup.Surname_EB.clear();
		signup.Surname_EB.sendKeys(signup.IP_Secondname);
		
		signup.Mobile_or_Email_EB.clear();
		signup.Mobile_or_Email_EB.sendKeys(signup.IP_Mobile_or_Email);
		
		signup.Retype_email_EB.clear();
		signup.Retype_email_EB.sendKeys(signup.IP_Retype_Email);
		
		signup.password_EB.clear();
		signup.password_EB.sendKeys(signup.IP_password);
		
		
		//select Dropdown
		new Select(signup.Day_DD).selectByVisibleText(signup.IP_day);
		
		
	}

}
