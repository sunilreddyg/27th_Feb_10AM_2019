package webdriver_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_UsingText
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		
		
		/*
		 * identify location using xpath-outterText.
		 * 
		 * 		//tagname[text()='Element text']
		 */
		driver.findElement(By.xpath("//button[text()='Create a Job Alert']")).click();
		
		
		/*
		 * Identify location using xpath_attribute
		 * 
		 * 	   //tagname[@Attributename='Attributevalue']
		 */
		driver.findElement(By.xpath("//input[@name='keyskills']")).clear();
		driver.findElement(By.xpath("//input[@name='keyskills']")).sendKeys("software testing");
		Thread.sleep(4000);
		
		
		//Identify element using xpath text
		driver.findElement(By.xpath("//div[text()='Software Testing']")).click();
		Thread.sleep(2000);
		
		//Identif element using xpath text
		driver.findElement(By.xpath("//div[.='Automation Testing']")).click();
		Thread.sleep(2000);
		
		//Identif element using xpath text
		driver.findElement(By.xpath("//div[.='Appium']")).click();
		Thread.sleep(2000);
		
		//Identif element using xpath text
		driver.findElement(By.xpath("//div[.='Cucumber']")).click();
		Thread.sleep(2000);
		
		
		
		
		

	}

}
