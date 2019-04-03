package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Runtime_Attributes {

	public static void main(String[] args) 
	{
	
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		
		//Identify roundtrip 
		WebElement Roundtrip=driver.findElement(By.xpath("//li[text()='Round Trip']"));
		Roundtrip.click();
		
		//Verify Roundtrip is selected..
		String Runtime_Class=Roundtrip.getAttribute("class");
		

		if(Runtime_Class.equals("selected"))
		{
			System.out.println("Roundtrip is selected");
			
			//Verify Return date visible on roundtrip selection.
			
			//Identify Return date
			WebElement Returndate_text=driver.findElement(By.xpath("//span[text()='RETURN']/following-sibling::p"));
			//Get Runtime Class property
			String Returndate_Class=Returndate_text.getAttribute("class");
			
			//Verify expected attribute value at returndate
			if(Returndate_Class.contains("blackText"))
			{
				System.out.println("Return Date is visible");
			}
			else if(Returndate_Class.contains("greyText"))
			{
				System.out.println("return date is hidden");
			}
			else
			{
				System.out.println("Failed to seleced");
			}
		}
		else
		{
			System.out.println("Roundtrip selection failed");
		}
		

	}

}
