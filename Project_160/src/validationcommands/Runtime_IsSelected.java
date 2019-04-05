package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_IsSelected 
{

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Testcase:-->
		 * 		verify triptype functionality for roundtrip
		 * 	Steps:-->
		 * 		launch browser and load cleartrip webpage
		 * 		click roundtrip radio button.
		 * 		make sure roundtrip radio button selected.
		 * 	Expected:-->
		 * 		system should display return date container
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/flights");
		driver.manage().window().maximize();
		
		//click roundtrip radio button
		WebElement Roundtrip=driver.findElement(By.xpath("//input[@value='RoundTrip']"));
		Roundtrip.click();
		
		WebElement returndate=null;
		//Condition to accep on roundtrip selection
		if(Roundtrip.isSelected())
		{
			//target Return date container
			returndate=driver.findElement(By.id("ReturnDate"));
			
			//Write condition statement
			if(returndate.isDisplayed())
				System.out.println("As expected return date displayed on roundtrip selection");
			else
				System.err.println("Return date not visible on roundtrip selection");
			
			
		}
		else
			System.err.println("Roundtrip is not selected, Return date not  validated");
		
		
		
		/*
		 * Testcase:-->
		 * 		verify triptype functionality for Oneway
		 * 	Steps:-->
		 * 		launch browser and load cleartrip webpage
		 * 		select oneway radio button
		 * 	Expected:-->
		 * 		system should hide return date container 
		 */
		
		//click oneway radio button
		WebElement oneway=driver.findElement(By.xpath("//input[@value='OneWay']"));
		oneway.click();
		
		
		if(oneway.isSelected())
		{
			
			//accept condition on element hidden status
			if(!returndate.isDisplayed())  //!--NOT
				System.out.println("As expected return date hidden on oneway selection");
			else
				System.err.println("Return date visible on onway selection");
		
		}
		else
			System.err.println("Precondition failed oneway not selected");
		

		
		Thread.sleep(5000);
		driver.close();

	}

}
