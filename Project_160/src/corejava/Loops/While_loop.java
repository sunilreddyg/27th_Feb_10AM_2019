package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class While_loop {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * While:-->  Is a condition based loop it accept iteration when condition
		 * 			  return true and stop iteration when condition return false.
		 * 
		 */
		
		
		/*
		 * Example print numbers from 1 to 20
		 */
		
		int i=1;
		while(i <= 20)
		{
			
			System.out.println(i);
			i=i+1;
		}
		
		
		
		/*
		 * Example:--> Using while loop wait until element displayed at webpage
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		
		//Identify Retype email
		WebElement Retype_email=driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		
		int j=0;
		//Accept loop on condition true
		while(!Retype_email.isDisplayed())
		{
			j=j+1;
			Thread.sleep(1000);
			if(j==30)
			{
				throw new Exception("Timeout completed element not visible at webpage");
			}
		}
		
		System.out.println("Element displayed");
		
		
		
		
		
		
		
		
		
		
		
	}

}
