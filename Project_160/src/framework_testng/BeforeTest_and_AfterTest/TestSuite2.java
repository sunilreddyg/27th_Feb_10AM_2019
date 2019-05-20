package framework_testng.BeforeTest_and_AfterTest;

import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestSuite2 
{
 

	  @Test
	  public void tc004() 
	  {
		 Reporter.log("tc004  Executed",true);
	  }
	  
	  @Test
	  public void tc005() 
	  {
		  Reporter.log("tc005  Executed",true);
	  }
	  
	  
	  @Test
	  public void tc006() 
	  {
		 
		  Reporter.log("Tc006 executed",true);
	  }
	  
	  
	
}
