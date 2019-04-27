package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker_Select_Required_Date 
{

	public static void main(String[] args) throws Exception {
		
		/*
		 * example:--> Select Required data from calendar
		 */
		
		String Exp_month="Aug";
		String Exp_date="20";
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		
		//Identify calendar and click to Open
		WebElement Date_Calendar=driver.findElement(By.xpath("//img[@alt='Calendar']"));
		Date_Calendar.click();
		Thread.sleep(3000);
		
		boolean flag=false;
		//Iterate for 4 times
		for (int i = 0; i < 6; i++) 
		{
			
			//Identify Active month calendar
			WebElement Active_Month;
			Active_Month=driver.findElement(By.xpath("//div[@id='datePickerWrapper']/table[1]"));
			
			
			WebElement Avtive_Month_Header=Active_Month.findElement(By.xpath("(//th[contains(@class,'month')])[1]"));
			String MonthName=Avtive_Month_Header.getText();
			
			//Accept condition where expected active month header
			if(MonthName.contains(Exp_month))
			{
				
				//Identify only active links at current month
				List<WebElement> Active_links;
				Active_links=Active_Month.findElements(By.tagName("a"));
				
				//Iterate for number of active link under current month
				for (int j = 0; j < Active_links.size(); j++) 
				{
					//Get Each Acive link using dynamic loop
					WebElement Eachlink=Active_links.get(j);
					//get linkname
					String Dynamic_Date=Eachlink.getText();
					if(Dynamic_Date.equals(Exp_date))
					{
						flag=true;
						Eachlink.click();
						break;
					}
					
				}//for
				
				
			}//condition
			
			
			if(flag==true)
			{
				break;
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
