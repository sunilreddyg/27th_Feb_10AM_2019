package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Element_Text 
{

	public static void main(String[] args) 
	{
		/*
		 * Example:--> Capture text visible at location..
		 */
		
		/*
		 * Testcase:-->
		 * 			Verify error message displayed on Invalid Flight Search
		 * Steps:-->
		 * 			Enter site url http://cleartrip.com
		 * 			Without enter proper details click on search button
		 * Expected:-->
		 * 			System should display appropriate error message ""
		 * 
		 */
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://cleartrip.com");
		driver.manage().window().maximize();

		String exp_error_msg="Sorry, but we can't continue until you fix everything that's marked in RED";
		
		//Target Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@title='Search flights']"));
		//Search_btn.click();
		
		
		//Identify Error location
		WebElement Error_location=driver.findElement(By.xpath("//div[@id='homeErrorMessage']"));
		//Get Element visible text on location
		String Act_error_msg=Error_location.getText();
		
		//Verify Actual and expected text
		if(Act_error_msg.equalsIgnoreCase(exp_error_msg))
		{
			System.out.println("As expected error msg displayed on invalid flight search");
		}
		else
		{
			System.out.println("TestFail:--> Expected Error message not displayed on invalid flight search");
		}
		
		

	}

}
