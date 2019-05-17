package framework_testng.Suite_Parameter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Get_Parameters_From_Suite 
{
	public WebDriver driver;
	
	@Test(priority=0)
	@Parameters("browser_name")
	public void launch_browser(String bname)
	{
		if(bname.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
			Reporter.log("chrome browser launched");
		}
		else if(bname.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
			Reporter.log("firefox browser launched");
		}
	}
	
	@Test(priority=1)
	@Parameters("appurl")
	public void loadWebpage(String url)
	{
		driver.get(url);
		Reporter.log("Webpage load successfull");
	}
	
	
	@Test(priority=2)
	@Parameters({"uid","pwd"})
	public void User_login(String Auid,String Apwd)
	{
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(Auid);
		Reporter.log("Email enter successfull");
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(Apwd);
	}
	
	
	@Test(priority=3)
	@Parameters("Fname")
	public void User_registration(String firstname)
	{
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
	}
	
	
	
	

}
