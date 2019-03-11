package selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText_and_Partial_linkText 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://cleartrip.com");
		driver.manage().window().maximize();
		
		//Click link using original linkname
		driver.findElement(By.linkText("About Us")).click();

		
		//click on jobs link using original inkname
		driver.findElement(By.linkText("Jobs")).click();
		
		//click on  link using original inkname
		driver.findElement(By.linkText("Job Openings")).click();
		
		
		//Click link using partial linktext
		driver.findElement(By.partialLinkText
				("Executive – Travel Facilitator (Implant)")).click();		
		
	}

}
