package javascript;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Window_Scroll
{

	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
	
		
		//Scroll window
		((JavascriptExecutor)driver).executeScript("window.scroll(100,700)");
		
		//Scroll window
		((JavascriptExecutor)driver).executeScript("window.scroll(500,100)");
		
		
	}

}
