package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_ElementTobe_Clickable 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000); //Hold time to request for notification
		
		
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		
		//Identify location and store into referral
		By HydCity=By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)");
		//wait until element clickable
		new WebDriverWait(driver, 30).until(
				ExpectedConditions.elementToBeClickable(HydCity)).click();
		System.out.println("Element is clickable ");
		
	}

}
