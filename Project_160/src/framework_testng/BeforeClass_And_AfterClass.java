package framework_testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class BeforeClass_And_AfterClass {

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("pre-condition");
  }

  @AfterClass
  public void afterClass() 
  {
	  System.out.println("post-condition");
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
