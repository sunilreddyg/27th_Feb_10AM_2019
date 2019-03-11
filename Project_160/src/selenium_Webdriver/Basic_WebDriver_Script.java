package selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_WebDriver_Script 
{

	public static void main(String[] args) 
	{
		//Set Runtime property before launch chrome browser
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		//Launch chrome browser 
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//identify email location and enter mobile number
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//identify password location and ente password
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("Hello12345");
		
		//click signin button
		driver.findElement(By.id("loginbutton")).click();
		
	}

}
