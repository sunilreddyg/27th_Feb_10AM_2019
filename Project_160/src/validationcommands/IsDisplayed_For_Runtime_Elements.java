package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed_For_Runtime_Elements 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://cleartrip.com/");
		driver.manage().window().maximize();
		
		
		//target more options link
		WebElement More_options=driver.findElement(By.xpath("//a[@id='MoreOptionsLink']"));
		
		/*
		 * Click More options. Expected "Class of travel" and "Preffered
		 * airlines" element should visible at webpage..
		 */
		More_options.click();
		Thread.sleep(5000);
		
		WebElement Travel_Class=driver.findElement(By.xpath(".//*[@id='Class']"));
		WebElement Airlines=driver.findElement(By.xpath("//input[@name='airline']"));
		
		
		if(Travel_Class.isDisplayed() &&  Airlines.isDisplayed())
			System.out.println("Testpass:--> As expected travelclass and Airlines element visible at webpage");
		else
			System.out.println("TestFail;--> travelclass and Airlines expected it tobe visible");
		
		
		/*
		 *  => Click More options.when travel class and airlines elements are visible
		 *  => Expected "Class of travel" and "Preffered
		 * airlines" elements hide from webpage
		 */
		More_options.click();
		Thread.sleep(5000);
		
		
	     if(!Travel_Class.isDisplayed() &&  !Airlines.isDisplayed())
	    	 System.out.println("Testpass:--> Both elements are hidden as expected");
	     else
	    	 System.out.println("TestFail;--> Both elements are visible at webpage");

	}

}
