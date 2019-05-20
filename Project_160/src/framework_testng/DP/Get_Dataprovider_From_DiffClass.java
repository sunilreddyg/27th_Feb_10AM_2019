package framework_testng.DP;

import org.testng.annotations.Test;

public class Get_Dataprovider_From_DiffClass 
{

	
	@Test(dataProvider="userdata",dataProviderClass=InputData.class)
	public void getData(String Browser_name,String browser_version)
	{
		System.out.println(Browser_name+"   "+browser_version);
	}
	
	
	
	
}
