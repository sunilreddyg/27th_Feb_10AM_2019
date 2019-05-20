package framework_testng.BeforeTest_and_AfterTest;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Test_For_Firefox
{
	
	

	  @AfterTest
	  public void afterTest() 
	  {
		  System.out.println("posttest after firefox launch ");
	  }
	  
	  
}
