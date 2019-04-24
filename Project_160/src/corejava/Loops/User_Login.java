package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class User_Login {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * example:--> Perform user-login with multiple set of table driven data.
		 */
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String userdata[][]=
			{
					{"Newuser1","Newpwd1"},
					{"Newuser2","Newpwd2"},
					{"Newuser3","Newpwd3"},
			};
		
		
		//Iterate for array length
		for (int i = 0; i < userdata.length; i++) 
		{
			
			WebElement Email=driver.findElement(By.id("email"));
			Email.clear();
			Email.sendKeys(userdata[i][0]);
			
			WebElement Password=driver.findElement(By.id("pass"));
			Password.clear();
			Password.sendKeys(userdata[i][1]);
			
			Thread.sleep(2000);
			
			
		}
		

	}

}
