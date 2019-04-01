package verification_Commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_url {

	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://seleniumhq.org");
		driver.manage().window().maximize();
		
		
		//Capture runtime url
		String Runtime_url=driver.getCurrentUrl();

		//Store Expected url
		String exp_url="https://www.seleniumhq.org/";
		
		
		//Verify Runtime url contains expected url
		if(Runtime_url.contains(exp_url))
		{
			System.out.println("Expected url Presented");
		}
		else
		{
			System.err.println("Wrong url presented");
		}
		
	}

}
