package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown_Multiple_Option 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Example:--> verify respective cities displayed on correspondent State
		 * 			    selection
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/branch-atm-locator");
		driver.manage().window().maximize();
		
	
		String Cities[]={"null","South Andaman","fdgfg","East Siang","Guwahati","Gaya"};
		
	
		//Identify State dropdown
		WebElement State_Dropdown=driver.findElement(By.id("customState"));
		
		//Get List of option tags under select tag
		List<WebElement> All_States=State_Dropdown.findElements(By.tagName("option"));
		
		//Iterate for number of states
		for (int i = 0; i < 6; i++)
		{
			//Get Each state using index number
			WebElement EachState=All_States.get(i);
			String StateName=EachState.getText();
			//Click Each State
			EachState.click();
			Thread.sleep(3000);
			
			//Identify Citydropdown and Capture city names 
			WebElement City_dropdown=driver.findElement(By.id("customCity"));
			String All_Cities=City_dropdown.getText();
			

			boolean flag=All_Cities.contains(Cities[i]);
			System.out.println(StateName+"   City ---"+Cities[i]+" ---Display status is => "+flag);
		
			
		}
		
		
		
	}

}
