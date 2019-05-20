package framework_testng.DP;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class InputData 
{
  @Test(dataProvider = "dp")
  public void userinfo(String name,String mobile)
  {
	  
	  System.out.println(name+"   "+mobile);
	 
  }

  
  
  @DataProvider
  public Object[][] dp() 
  {
    return new Object[][] 
    {
      new Object[] {"Akash","9030248855"  },
      new Object[] {"shankar","9030244488" },
      new Object[] {"vijay","9652485452" },
    };
  }
  
  
  @DataProvider
  public  static String[][] userdata()
  {
	  String data[][]=
		  {
				  {"firefox","65"},
				  {"chrome","73"},
				  {"ie","11"},  
		  };
	  return data;
  }
  
  
  
  
  
}
