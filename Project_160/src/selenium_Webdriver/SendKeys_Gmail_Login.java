package selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_Gmail_Login {

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//Identify Email locaiton
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com",Keys.ENTER);
		
		Thread.sleep(4000);
		
		/*
		 * Sendkeys command allow "characters sequences" and "keyboard
		 * 		shortcuts"
		 */
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("hello123456",Keys.ENTER);
		
		
		
		
	}

}
