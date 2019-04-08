package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Alert_handling {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * FAQ:-->
		 * 		In web application we have popup window which display
		 * 		optionally at webpage. I want't to handle when it was
		 * 		presented at webpage and don't handle when it was not presented.
		 * 
		 * 		Write conditional statemenet to verify alert presented
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000); //timegap to prompt popup at webpage.
		
		if(ExpectedConditions.alertIsPresent().apply(driver) != null)
		{
			//Switch to alert window
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert window
			String alert_text=alert.getText();
			System.out.println(alert_text);
			
			//accept alert popup
			alert.accept();
		}
		else
		{
			System.err.println("alert was not presented");
		}
		
		
	}

}
