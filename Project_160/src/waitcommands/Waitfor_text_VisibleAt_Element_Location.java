package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waitfor_text_VisibleAt_Element_Location 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//Enter email and press enter key at keyboard
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		//Identify location and store into referral
		By text_location=By.xpath("//content[contains(.,'Welcome')]");
		//wait until text presented at element location
		new WebDriverWait(driver, 30).until(
				ExpectedConditions.textToBePresentInElementLocated(text_location, "Welcome"));
		
		System.out.println("Welcome text visible at webpage");
		
		
		//Enter password
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("hello12345",Keys.ENTER);
	
		
		
		
	}

}
