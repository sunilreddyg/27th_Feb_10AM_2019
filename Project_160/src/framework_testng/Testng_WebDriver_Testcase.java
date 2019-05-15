package framework_testng;


import java.io.File;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Testng_WebDriver_Testcase 
{
	WebDriver driver;  //global variable with static access specifier

	@BeforeClass
	public void BeforeClass() 
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@AfterClass
	public void AfterClass() throws Exception 
	{
		Thread.sleep(5000);
		driver.close();
	}

	@BeforeMethod
	public void BeforeMethod() throws Exception
	{
		driver.get("http://facebook.com");
	}

	@AfterMethod
	public void AfterMethod(Method method) throws Exception 
	{
		Thread.sleep(3000);
		//Get system Default date
		Date d=new Date();
		//Create simple date format
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Convert default date using simple date format
		String time=sdf.format(d);
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\"+time+method.getName()+".png"));
			
	
	}

	@Test
	public void verify_signup_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Sign Up')]")).click();
		Assert.assertEquals("Sign up for Facebook | Facebook", driver.getTitle());
		System.out.println("Sign up link is verifed");
	}
	
	@Test
	public void verify_Signin_link() 
	{

		 driver.findElement(By.xpath("//a[contains(.,'Log In')]")).click();
		 Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		 System.out.println("Verified Signin link");
	}
	
	@Test
	public void verify_Messenger_link() 
	{
		
		driver.findElement(By.xpath("//a[contains(.,'Messenger')]")).click();
		Assert.assertEquals("Messenger", driver.getTitle());
		System.out.println("Verified messenger link");
	}

	@Test
	public void verify_Games_link() 
	{
		driver.findElement(By.xpath("//a[contains(.,'Games')]")).click();
		Assert.assertEquals("Games", driver.getTitle());
		System.out.println("Verified games link");
	}


}
