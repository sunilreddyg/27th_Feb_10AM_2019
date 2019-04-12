package mouse_and_keyboard_interactions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Hover_On_Element 
{

	public static void main(String[] args) throws Exception 
	{
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	
		/*
		 * Note:-->
		 * 		Enable mouse and keybord interaction on automation
		 * 		browser by creation of object for Actions Class.
		 */
		Actions action=new Actions(driver);
	
		//Identify Element
		WebElement Category=driver.findElement(By.xpath("//span[contains(.,'Category')]"));
		action.moveToElement(Category).perform();
		Thread.sleep(4000);
		
		//Identify Elemnet
		WebElement Sub_Mobile_And_Computer=driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"));
		action.moveToElement(Sub_Mobile_And_Computer).build().perform();
		Thread.sleep(4000);
		
		//Identify Laptops
		WebElement sub_laptops=driver.findElement(By.xpath("//span[text()='Laptops']"));
		action.click(sub_laptops).perform();
		

	}

}
