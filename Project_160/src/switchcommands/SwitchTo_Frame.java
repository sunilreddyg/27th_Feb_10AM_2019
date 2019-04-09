package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Frame {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		//Switch to Frame using Frame id property
		driver.switchTo().frame("modal_window");
		
		//Identify Editbox
		WebElement Email=driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys("Qadarshan@gmail.com");
		
		//Identify Editbox
		WebElement Trip_id=driver.findElement(By.id("tripidSecond"));
		Trip_id.clear();
		Trip_id.sendKeys("Hello12345");
		
		//switch control back to mainpage
		driver.switchTo().defaultContent();
		
		//Click Link
		driver.findElement(By.xpath("//span[contains(.,'Flights')]")).click();
		
		
		
		

	}

}
