package variables.Global_Variables;

public class Run_HelperClass 
{

	public static void main(String[] args)
	{
	
			//Create object for class
			Helper obj=new Helper();
			
			//Assign data to global variable
			obj.url="http://facebook.com";
			obj.launchBrowser();
			
			//Assing value to global variable
			obj.email="9030248855";
			obj.pwd="hello123455";
			obj.User_Signin();
			
			

	}

}
