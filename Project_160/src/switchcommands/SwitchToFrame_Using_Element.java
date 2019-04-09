package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame_Using_Element 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
		
		
		//Click Signin button
		WebElement Signin_btn=driver.findElement(By.xpath("//button[contains(.,'Sign in')]"));
		Signin_btn.click();
		
		
		//Identify Frame
		WebElement ModalFrame=driver.findElement(By.className("modalIframe"));
		//Apply switch to frame using Webelement referral
		driver.switchTo().frame(ModalFrame);
		
		
		
		//Enter mobile number under modalframe
		WebElement Mobile_Editbox=driver.findElement(By.id("mobileNoInp"));
		Mobile_Editbox.clear();
		Mobile_Editbox.sendKeys("9030248855");
		
		
		//Switch back controls to page
		driver.switchTo().defaultContent();
		
		//Close Signin Window.
		WebElement Close_btn=driver.findElement(By.xpath("(//div[@title='close'])[3]"));
		Close_btn.click();
		

	}

}
