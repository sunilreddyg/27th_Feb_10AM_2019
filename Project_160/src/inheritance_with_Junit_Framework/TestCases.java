package inheritance_with_Junit_Framework;

import org.openqa.selenium.By;

public class TestCases extends Helper_Repository
{
	
	/*
	 * Method:--> Emailvalidation
	 */
	public void Email_validation(String UID)
	{
		Enter_text("//input[@id='i0116']", UID);
		driver.findElement(By.id("idSIButton9")).click();   //Global variable from Helper_Repository class
		
	}
	

}
