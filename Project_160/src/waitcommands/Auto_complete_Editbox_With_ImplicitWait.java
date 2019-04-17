package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_complete_Editbox_With_ImplicitWait
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(5000); //Hold time to request for notification
		
		
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("JAI");
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();

		
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("VIZ");
		driver.findElement(By.linkText("New Delhi, IN - Indira Gandhi Airport (DEL)")).click();
		
		
		//Select date from datepicker
		driver.findElement(By.linkText("24")).click();
		
		//Identify departure date editbox
		driver.findElement(By.id("DepartDate")).clear();
		driver.findElement(By.id("DepartDate")).sendKeys("Sat, 22 Jun, 2019");
		
		/*
		 * type date in departuredate editbox when it is writable.
		 */
		
		//click search button
		driver.findElement(By.id("SearchBtn")).click();
		
	}

}
