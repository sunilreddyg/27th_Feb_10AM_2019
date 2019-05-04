package inheritance_with_Junit_Framework;

import org.junit.Test;
import org.openqa.selenium.By;

public class Junit_Runner extends TestCases
{

	@Test
	public void verify_Invalid_login_with_WrongDomain_Name() 
	{
		
		LaunchBrowser("chrome");
		load_webpage("http://outlook.com");
		set_timeout(30);
		
		//Click Signin button  [Driver form Helper_repository class]
		driver.findElement(By.xpath("//a[@class='linkButtonSigninHeader']")).click();
		
		//Calling method testcases class
		Email_validation("qadarshan.gajjala@gmail.com");
		//wait for error text to visible
		wait_for_Element_visible(By.xpath("//div[@id='usernameError']"));
		
		String exp_text="That Microsoft account doesn't exist. Enter a different account or get a new one.";
		if(isText_visibleAt_Webpage(exp_text))
			System.out.println("As expected error msg displayed");
		else
			System.out.println("Expected error msg not visible");
		
	}

}
