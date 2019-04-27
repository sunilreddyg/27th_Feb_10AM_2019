package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataPicker_Click_ActiveDates
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * example:--> Click All active dates at Calendar.
		 */
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//Identify calendar and click to Open
		WebElement Date_Calendar=driver.findElement(By.xpath("//img[@alt='Calendar']"));
		Date_Calendar.click();
		Thread.sleep(3000);
		
	
		//Iterate for 4 times
		for (int i = 0; i < 6; i++) 
		{
			
			//Identify Active month calendar
			WebElement Active_Month;
			Active_Month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			//Identify only active links at current month
			List<WebElement> Active_links;
			Active_links=Active_Month.findElements(By.tagName("a"));
			
			
			
			//Iterate for number of active link under current month
			for (int j = 0; j < Active_links.size(); j++) 
			{
				//Get Each Acive link using dynamic loop
				WebElement Eachlink=Active_links.get(j);
				Eachlink.click();
				//Thread.sleep(1000);
				Date_Calendar.click();
				
				//Restore all table information to avoid "StaleElementReferenceException"
				Active_Month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
				Active_links=Active_Month.findElements(By.tagName("a"));
			}
			
			
			
			//Click Next Button
			WebElement Next_Month_Btn=driver.findElement(By.xpath("//a[contains(@title,'Next month')]"));
			Next_Month_Btn.click();
			Thread.sleep(2000);
			
			
			//Condition to target NextMonth
			if(i==4)
			{
				WebElement last_Month;
				last_Month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[2]"));
				
				//Select last month active link..
				last_Month.findElements(By.tagName("a")).get(0).click();
				Thread.sleep(1000);
				Date_Calendar.click();
			
			}
			
		}
		
		
		
		

	}

}
