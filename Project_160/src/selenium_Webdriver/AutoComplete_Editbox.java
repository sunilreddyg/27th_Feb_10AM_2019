package selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Editbox 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		//Select Roundtrip Radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		//Identify From editbox and type referral Keyword in it
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(4000);  //Timeout to load suggesstions
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
		
		//Identify TO editbox and type referral Keyword init
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("JAI");
		Thread.sleep(4000);  //Timeout to load suggesstions
		driver.findElement(By.linkText("Jaipur, IN - Sanganeer (JAI)")).click();
		
		/*
		 * Departue calendar autopopulate on To-address selection
		 */
		
		//Click Active date
		driver.findElement(By.linkText("22")).click();
		Thread.sleep(5000);
		
		
		//Type Text into Return date editbox instead of selection.
		//Only possible editbox is writable.
		driver.findElement(By.id("ReturnDate")).clear();
		driver.findElement(By.id("ReturnDate")).sendKeys("Fri, 26 Jul, 2019");
		
		//click Search button
		driver.findElement(By.id("SearchBtn")).click();
	}

}
