package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Method_Description 
{
	
	@Test(description="Verifying login with valid data",priority=0)
	public void method1()
	{
		Reporter.log("method 1 executed");
	}
	
	@Test(description="verifying login with invalid data")
	public void method2()
	{
		Reporter.log("method 2 executed");
	}
	
	@Test
	public void verifying_login_without_data()
	{
		Reporter.log("method 3 executed");
	}

}
