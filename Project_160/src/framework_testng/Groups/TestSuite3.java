package framework_testng.Groups;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestSuite3 
{
	
	  @Test(groups="G1")
	  public void tc007() 
	  {
		  Reporter.log("tc007  Executed",true);
	  }
	  
	  
	  @Test(groups="G2")
	  public void tc008()
	  {
		  Reporter.log("Tc008 executed",true);
	  }
	  

}
