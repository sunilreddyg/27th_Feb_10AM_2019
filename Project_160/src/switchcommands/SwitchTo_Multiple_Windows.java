package switchcommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SwitchTo_Multiple_Windows
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/trains");
		driver.manage().window().maximize();
		
		//Switch to main window
		String mainwindow=driver.getWindowHandle();
		
		System.out.println("main window Dynamic id => "+driver.getWindowHandle());
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Check PNR Status']")).click();
		Thread.sleep(2000);
		
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Trains availability calendar']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Cancel trains tickets']")).click();
		Thread.sleep(2000);
				
		//click External link to open New window
		driver.findElement(By.xpath("//a[@title='Rail Tour Packages']")).click();
		Thread.sleep(2000);
		
		
		
		//Get All window Dynamic ID's open by WebDriver.
		Set<String> AllwindowIDs=driver.getWindowHandles();
		//Apply foreach to iterate all windows
		for (String Eachwindow : AllwindowIDs) 
		{
			//Switch To Each window
			driver.switchTo().window(Eachwindow);
			//Capture Runtime title
			String Runtime_title=driver.getTitle();
			//Write condition to verify expected title
			if(Runtime_title.contains("Cancel Train Bookings"))
			{
				break; //Break loop iteration
			}
		}
		
		
		
		System.out.println("Current focus window title is => "+driver.getTitle());

	}

}
