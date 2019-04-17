package waitcommands;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Wait_and_verify_title 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org");
		driver.manage().window().maximize();
		
		
		String Exp_title="Selenium - Web Browser Automation";
		
		
		//Create object for explicit
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(Exp_title));
		System.out.println("Seleniumhq homepage title verified");
		
		
		
		//Identify Downlaod link
		WebElement Element=driver.findElement(By.xpath("//a[@title='Get Selenium']"));
		Element.click();
		
		
		//Wait until partial title load
		wait.until(ExpectedConditions.titleContains("Download"));
		System.out.println("Download page verified");
		
	
		
		/*
		 * Note:--> Explicitwait throws "Timeout exception" In case
		 * 			expected behaviour not found.
		 */
	}

}
