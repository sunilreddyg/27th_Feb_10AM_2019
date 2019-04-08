package switchcommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Unexpected_popups 
{
	static WebDriver driver; //global variable
	
	public static void main(String[] args) throws InterruptedException 
	{
	
		
		try {
			
			driver=new ChromeDriver();
			driver.get("https://www.firstnaukri.com/");
			driver.manage().window().maximize();
			
			//Identify Search button
			WebElement Search_btn=driver.findElement(By.xpath("//input[@value='Search']"));
			Search_btn.click();
			
		} catch (UnhandledAlertException e) {
			//Switch to alert window
			Alert alert=driver.switchTo().alert();
			
			//Capture text on alert window
			String alert_text=alert.getText();
			System.out.println(alert_text);
			
			//accept alert popup
			alert.accept();
		}
		
		

	}

}
