package framework_testng.Run_Keywords;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import java.lang.reflect.Method;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Run_Keywords extends Repository
{
	
	@Test
	public void verify_signup_link() 
	{
		Click_element(By.xpath("//a[contains(.,'Sign Up')]"));
		Assert.assertTrue(is_title_presented("Sign up"));
		System.out.println("Sign up link is verifed");
	}
	
	
	@Test
	public void verify_Signin_link() 
	{

		 Click_element(By.xpath("//a[contains(.,'Log In')]"));
		 Assert.assertEquals("Log in to Facebook | Facebook", driver.getTitle());
		 System.out.println("Verified Signin link");
	}
	
	@Test
	public void verify_Messenger_link() 
	{
		
		Click_element(By.xpath("//a[contains(.,'Log In')]"));
		Assert.assertTrue(is_title_presented("Messenger"));
		System.out.println("Verified messenger link");
	}

	@Test
	public void verify_Games_link() 
	{
		Click_element(By.xpath("//a[contains(.,'Log In')]"));
		Assert.assertEquals("Games", driver.getTitle());
		System.out.println("Verified games link");
	}

  
  

  @BeforeClass
  public void beforeClass() 
  {
	  LaunchBrowser("chrome");
	  set_timeout(30);
  }

  @AfterClass
  public void afterClass() throws Exception
  {
	  Thread.sleep(5000);
	  driver.close();
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  load_webpage("http://facebook.com");
  }

  @AfterMethod
  public void afterMethod(Method method) 
  {
	  Capturescreen(method.getName());
  }

}
