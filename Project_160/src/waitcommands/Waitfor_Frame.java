package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_Frame 
{

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.redbus.in/hotels/");
		driver.manage().window().maximize();
	
		
		//click Signin button
		WebElement SignIn_btn=driver.findElement(By.xpath("//button[contains(@class,'login-btn')]"));
		SignIn_btn.click();
		
		//Identify frame locator
		By modalFrame=By.className("modalIframe");
		
		//Wait for frame
		WebDriverWait wait=new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(modalFrame));
		System.out.println("Controls availabel at modal frame");

		//Enter Mobile number
		WebElement mobileNum=driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		mobileNum.clear();
		mobileNum.sendKeys("9030248855");
		
		
	}

}
