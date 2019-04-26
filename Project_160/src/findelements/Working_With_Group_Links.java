package findelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.python.modules.thread.thread;

public class Working_With_Group_Links {

	public static void main(String[] args) throws Exception 
	{
		/*
		 * Example:--> Identify group links at webpage. And
		 * 		operate each link using iterations.
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		//identify location of page links
		WebElement Page_links_location;
		Page_links_location=driver.findElement(By.cssSelector("div[class='jCqS _19iN'][data-reactid='240']"));
		//Find all links under page-links-location
		List<WebElement> All_links;
		All_links=Page_links_location.findElements(By.tagName("a"));
		
		//Iterate for number of link
		for (int i = 0; i < All_links.size(); i++)
		{
			//Get Each link using index number
			WebElement Each_link=All_links.get(i);
			//Get each link name and href property
			String linkname=Each_link.getText();
			String linkhref=Each_link.getAttribute("href");
			
			System.out.println(linkname+"  => "+linkhref);
			
			
			//Click each link
			Each_link.click();
			Thread.sleep(3000);
			
			//navigate back to mainpage
			driver.navigate().back();
			Thread.sleep(3000);
			
			//Restore all links to avoid "StaleElementReference" exception
			Page_links_location=driver.findElement(By.cssSelector("div[class='jCqS _19iN']"));
			All_links=Page_links_location.findElements(By.tagName("a"));
		}
		
		
		
	}

}
