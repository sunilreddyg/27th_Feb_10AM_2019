package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_PageSource 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Example:--> Verify tile,url,text and element available
		 * 				at current pagesource.
		 */
		
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		String exp_title="Selenium - Web Browser Automation";
		String exp_url="https://www.seleniumhq.org/";
		String Exp_element_id="q";
		
		
		//Get Current window pagesource
		String Runtime_pageSource=driver.getPageSource();
		
		//Verify Element presented at source
		if(Runtime_pageSource.contains(Exp_element_id))
		{
			WebElement Search=driver.findElement(By.id("q"));
			Search.clear();
			Search.sendKeys("Selenium");
		}
		else
		{
			System.out.println("Element not presented at source");
		}
		
		
		
		
		//Verify title presented at source
		if(Runtime_pageSource.contains(exp_title))
			System.out.println("Expected title presented at source");
		else
			System.out.println("Expected title not presented at source");
		
		

	}

}
