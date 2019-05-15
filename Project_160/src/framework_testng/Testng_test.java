package framework_testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testng_test
{
  @Test //invoke method execution without main method and object creation.
  public void tcoo1() 
  {
	 Reporter.log("tc001 executed successfull");
  }
  
  @Test //invoke method execution without main method and object creation.
  public void tcoo2() 
  {
	 Reporter.log("tc002 executed successfull");
  }
  
  @Test //invoke method execution without main method and object creation.
  public void tcoo3() 
  {
	 Reporter.log("tc003 executed successfull");
  }
  
  
}
