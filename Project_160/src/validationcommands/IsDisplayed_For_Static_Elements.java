package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.InvalidElementStateException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class IsDisplayed_For_Static_Elements 
{

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		
		
		//Identify Email Editbox
		WebElement Email_eb=driver.findElement(By.id("identifierId"));
		
		if(Email_eb.isDisplayed() && Email_eb.isEnabled())
		{
			Email_eb.clear();
			Email_eb.sendKeys("qadarshan@gmail.com");
		}
		else
			System.out.println("Element hidden or not editable");
	

		/*
		 * ElementNotvisibleException   ==> When user perform action on hidden element  
		 * InvalidElementstateException ==> When user perform action on disabled element
		 */
		
		
		try {
			
			WebElement Next_btn=driver.findElement(By.id("Next_button"));
			Next_btn.click();
		
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}catch (ElementNotVisibleException e) {
			e.printStackTrace();
		}catch (InvalidElementStateException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		System.out.println("Run continued");
	
			
			
		
		
		
		
		
		
		

	}

}
