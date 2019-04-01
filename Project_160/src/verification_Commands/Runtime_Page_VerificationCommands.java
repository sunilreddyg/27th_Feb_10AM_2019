package verification_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Page_VerificationCommands 
{

	public static void main(String[] args)
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Capture current window title
		String Runtime_title=driver.getTitle();
		System.out.println("Current window title is => "+Runtime_title);
		
		//Capture current window URL
		String Runtime_url=driver.getCurrentUrl();
		System.out.println("Current window url is =>"+Runtime_url);
		
		
		//Capture Current window PageSource
		String Runtime_pageSource=driver.getPageSource();
		//System.out.println(Runtime_pageSource);
		
		//Capture Current window DynamiC ID
		String DynamicWindowID=driver.getWindowHandle();
		System.out.println(DynamicWindowID);

	}

}
