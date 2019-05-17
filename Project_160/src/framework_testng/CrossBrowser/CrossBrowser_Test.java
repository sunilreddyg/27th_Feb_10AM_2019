package framework_testng.CrossBrowser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser_Test 
{
	public WebDriver driver;
	
	@Test(priority=0)
	@Parameters("browsername")  //Parameter from suite file
	public void launchBrowser(String browser)
	{
		switch (browser) 
		{
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "ie":
			driver=new InternetExplorerDriver();
			break;

		default:System.out.println("browser mismatch");
			break;
		}
	}
	
	
	@Test(priority=1)
	@Parameters("appurl")   //Parameter from suite file
	public void loadApp(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Test(priority=2)
	public void flight_search() throws Exception
	{
		Thread.sleep(5000);
		
		//Type referal text into textbox
		driver.findElement(By.id("FromTag")).clear();
		driver.findElement(By.id("FromTag")).sendKeys("HYD");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Hyderabad, IN - Rajiv Gandhi International (HYD)")).click();
				
				
		//Type text
		driver.findElement(By.id("ToTag")).clear();
		driver.findElement(By.id("ToTag")).sendKeys("JAI");
		Thread.sleep(2000);
		driver.findElement(By.linkText("Jaipur, IN - Sanganeer (JAI)")).click();
				
		//select date from datepicker
		driver.findElement(By.linkText("24")).click();
				

	}
	
	@Test(priority=3)
	public void closeBrowser() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.close();
	}
	

}
