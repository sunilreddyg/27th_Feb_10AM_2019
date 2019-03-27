package variables.Global_Variables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Helper 
{
	WebDriver driver;
	String url;
	String email;
	String pwd;
	
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void User_Signin()
	{
		driver.findElement(Locators.Signin_email).clear();
		driver.findElement(Locators.Signin_email).sendKeys(email);
		
		driver.findElement(Locators.Signin_pwd).clear();
		driver.findElement(Locators.Signin_pwd).sendKeys(pwd);
		
		driver.findElement(Locators.Signin_login_btn).click();
	}
	
	
	

}
