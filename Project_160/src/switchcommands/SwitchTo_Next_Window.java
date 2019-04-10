package switchcommands;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Next_Window 
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();

		//Capture current window Dynamic ID
		String mainwindow=driver.getWindowHandle();
		
		System.out.println("before switch current window title is => "+driver.getTitle());
		
		//Click external link to open webpage at private window.
		WebElement Instagram_link=driver.findElement(By.linkText("Instagram"));
		Instagram_link.click();
		
		//Get All window Dynamic ID's
		Set<String> AllwindowIDS=driver.getWindowHandles();
		
		//Apply foreach to iterate number of private windows
		for (String EachwindowID : AllwindowIDS) 
		{
			if(!EachwindowID.equals(mainwindow))
			{
				driver.switchTo().window(EachwindowID);
				break;
			}
			
		}
		
		System.out.println("Current window title After switch is => "+driver.getTitle());
		
		
		//Handle instagram page elements
		Thread.sleep(5000);
		WebElement Mobile_num=driver.findElement(By.xpath("//input[@name='emailOrPhone']"));
		Mobile_num.clear();
		Mobile_num.sendKeys("9030248855");
		
		
		//Get control back to mainapge
		driver.switchTo().window(mainwindow);
		
		
		//Handle elements at minwindow
		WebElement Firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		Firstname.clear();
		Firstname.sendKeys("Suresh");
		
	}

}
