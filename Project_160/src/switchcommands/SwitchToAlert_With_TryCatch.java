package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToAlert_With_TryCatch 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/");
		driver.manage().window().maximize();
		
		//Identify Search button
		WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
		Search_btn.click();
		Thread.sleep(5000); //timegap to prompt popup at webpage.
		
		
		try {
			
			//Switch to alert window
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert window
			String alert_text=alert.getText();
			System.out.println(alert_text);
			
			//accept alert popup
			alert.accept();
			
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}
		
		System.out.println("Run Continued");

	}

}
