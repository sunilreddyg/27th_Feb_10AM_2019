package verification_Commands;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeparuteDate_and_SystemDate
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Testcase:-->
		 * 		Verify deparute date match with system date.
		 * Expected:-->
		 * 		Everday departure match with system date.
		 */
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		
		
		
		//Identify departure date editbox
		WebElement Departure_Date=driver.findElement(By.id("ctl00_mainContent_view_date1"));
		//Capture input value from editbox
		String Ddate=Departure_Date.getAttribute("value");
		

		//Capture system date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat df=new SimpleDateFormat("dd/MM");
		//using simple date formatter convert system date
		String Sdate=df.format(d);
		
		
		//Verify Comparision between departure date and system date
		if(Ddate.equals(Sdate))
			System.out.println("date match found");
		else
			System.out.println("date mismatch");
		

	}

}
