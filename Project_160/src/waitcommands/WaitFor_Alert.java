package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitFor_Alert {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.firstnaukri.com/jobs-internship");
		driver.manage().window().maximize();
		
		//Identify Location
		WebElement Search_btn=driver.findElement(By.cssSelector("input[value='Search']"));
		//Search_btn.click();
		
		
		//Wait for alert presented at browser window
		new WebDriverWait(driver, 30).until(ExpectedConditions.alertIsPresent()).accept();
		System.out.println("Alert presented and closed");
		
		//Close alert without apply switch command
		//ExpectedConditions.alertIsPresent().apply(driver).accept();

	}

}
