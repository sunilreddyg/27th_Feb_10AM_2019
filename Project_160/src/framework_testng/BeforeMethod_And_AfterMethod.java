package framework_testng;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class BeforeMethod_And_AfterMethod {
 
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("pre-condition");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("post-condition"+"\n");
  }
  
  @Test //invoke method execution without main method and object creation.
  public void tcoo1() 
  {
	 Reporter.log("tc001 executed successfull",true);
  }
  
  @Test //invoke method execution without main method and object creation.
  public void tcoo2() 
  {
	 Reporter.log("tc002 executed successfull",true);
  }
  
  @Test //invoke method execution without main method and object creation.
  public void tcoo3() 
  {
	 Reporter.log("tc003 executed successfull",true);
  }

  
  

}
