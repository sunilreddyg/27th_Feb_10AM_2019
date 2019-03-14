package selenium_Webdriver.Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Multiple_Selection_Maximum_limit {

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Write a program to verify multiple selection dropdown
		 * allow maximum options as  2.
		 */
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
	
		/*
		 * Using javascript executor convert single option dropdown to multiple
		 * 		selection dropdown.
		 */
		((JavascriptExecutor)driver).executeScript("document.getElementById"
				+ "('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		//Method return multple selection state in true/false
		boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);
		
		//Write decision statement to Select multiple options
		if(flag==true)
		{
					Select OpenAccount=new Select(driver.findElement(By.id("open_account")));
					OpenAccount.deselectAll();  //We can deselect only on multiple seleciton type
					OpenAccount.selectByIndex(1);
					OpenAccount.selectByIndex(3);
					OpenAccount.selectByIndex(5);
					
					//Get size of selection
					int count=OpenAccount.getAllSelectedOptions().size();
					if(count > 2)
					{
						System.out.println("TestFail:--> Accepting more than 2 options");
					}
					else if(count == 2)
					{
						System.out.println("Testpass:--> Accepted selected maximum options 2");
					}
					
		}
		else
		{
			System.out.println("Dropdown is a single option selection type");
		}
				

	}

}
