package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Example_Sendkeys 
{

	public static void main(String[] args) throws Exception 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		//Identify Location
		WebElement FromCity=driver.findElement(By.id("fromCity"));
		FromCity.click();
		Thread.sleep(5000);
		
		//Enable mouse and keyboard action on automation browser
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).perform();
		
		
		
		action.keyDown(Keys.SHIFT)
		.keyDown(Keys.ALT)
		.keyDown(Keys.CONTROL)
		.sendKeys(Keys.chord("s"))
		.perform();
		
		

	}

}
