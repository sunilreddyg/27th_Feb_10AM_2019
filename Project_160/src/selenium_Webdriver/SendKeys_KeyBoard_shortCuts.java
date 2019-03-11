package selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys_KeyBoard_shortCuts 
{

	public static void main(String[] args)
	{
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("u_0_j")).clear();
		driver.findElement(By.id("u_0_j"))
		.sendKeys("Ajay",Keys.TAB,
				"Krishnan",Keys.TAB,
				"Ajaykrishnan@gmail.com",
				Keys.TAB,"Ajaykrishnan@gmail.com",
				Keys.TAB,"hello123456");
		
		
		//identify dropdown and perform keyboard shortcuts
		driver.findElement(By.id("day")).sendKeys("23");
		
		//Identify dropdown and perform keyboard shortcuts
		driver.findElement(By.id("month"))
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN);
		
		
		//selecting checkbox 
		driver.findElement(By.id("u_0_9")).sendKeys(Keys.SPACE);
		
		
		
		
		
	}

}
