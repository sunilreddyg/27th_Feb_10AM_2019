package pageobjects.With_Global_Constructor;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Run_Gmail_SignIn {

	public static void main(String[] args) 
	{
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Create object for class
		Gmail_Signin signin=new Gmail_Signin(driver);
		
		signin.Email_Editbox.clear();
		signin.Email_Editbox.sendKeys("qadarshan@gmail.com");
		
		signin.Email_next_btn.click();
		

	}

}
