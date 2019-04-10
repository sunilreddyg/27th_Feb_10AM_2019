package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_FrameURL 
{

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/account/trips?src=manageTrips");
		driver.manage().window().maximize();
		
		//Navigate to frame page
		String frame_url="https://www.cleartrip.com/signinstatic/tripidlogin.shtml?popup=no&guest=true";
		driver.navigate().to(frame_url);
		
		//Identify Editbox
		WebElement Email=driver.findElement(By.id("email"));
		Email.clear();
		Email.sendKeys("Qadarshan@gmail.com");
		
		//Identify Editbox
		WebElement Trip_id=driver.findElement(By.id("tripidSecond"));
		Trip_id.clear();
		Trip_id.sendKeys("Hello12345");
		
		//navigate back to mainpage from frame..
		driver.navigate().back();
		
		//Click Link
		driver.findElement(By.xpath("//span[contains(.,'Flights')]")).click();
		
		

	}

}
