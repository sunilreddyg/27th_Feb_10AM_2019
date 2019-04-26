package findelements;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Dropdown_Option_Selection 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Write a program to select all dropdown options
		 *	using findelements option.
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Identify dropdown
		WebElement Month_dropdown=driver.findElement(By.id("month"));
		
		//Identify list of option tags and select tag
		List<WebElement> AllOptions=Month_dropdown.findElements(By.tagName("option"));
		
		//Apply for loop
		for (int i = 0; i < AllOptions.size(); i++) 
		{
			//Get Single element from list of element using index number
			WebElement EachOption=AllOptions.get(i);
			
			//Get Name of each option
			String Optioname=EachOption.getText();
			System.out.println(Optioname);
			
			//Click Option
			EachOption.click();
		}

	}

}
