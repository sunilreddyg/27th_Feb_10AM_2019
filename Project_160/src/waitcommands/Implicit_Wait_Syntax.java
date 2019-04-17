package waitcommands;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit_Wait_Syntax 
{

	public static void main(String[] args) 
	{
		
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		System.out.println("Maximized");
		
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("Automated");

		System.out.println("timeout released");
	}

}
