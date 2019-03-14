package selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_Dropdown
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
		//select dropdown option using visible text
		new Select(driver.findElement(By.id("customState")))
		.selectByVisibleText("Telangana");
		
		Thread.sleep(4000);
		
		//select drodpown option using value property
		new Select(driver.findElement(By.id("customCity")))
		.selectByValue("hyderabad");
		
		
		//Type text into editbox
		driver.findElement(By.id("customLocality")).clear();
		driver.findElement(By.id("customLocality")).sendKeys("dilsukhnagar");
		
		
		//select dropdown option using index number
		new Select(driver.findElement(By.id("customRadius")))
		.selectByIndex(3);
		
		
		//Select checkbox
		driver.findElement(By.id("amenity_category_order_types49")).click();
		
		
		//Click Search button using xpath
		driver.findElement(By.xpath("//input[@value='SEARCH']")).click();
		
		
	}

}
