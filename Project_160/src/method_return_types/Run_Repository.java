package method_return_types;

public class Run_Repository {

	public static void main(String[] args)
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		//Verify title presented at webpage using keyword
		if(obj.is_title_presented("Facebook – log in or sign up"))
			System.out.println("expected title presented");
		else
			System.out.println("title mismatch for facebook page");
		
		
		//Verify url presented at webpage using keyword
		if(obj.isUrl_Presented("https://www.facebook.com/"))
			System.out.println("Expected url presented");
		else
			System.out.println("Wrong url presented");
		
		//Verify text presented at webpage using keyword
		if(obj.isText_visibleAt_Webpage("Create an account"))
			System.out.println("text visible at webpage");
		else
			System.out.println("text not visible at webpage");
		
		
		//Verif alert presented
		if(obj.isAlert_presented())
		{
			obj.CloseAlert();
		}
		else
		{
			System.out.println("Alert not presented");
		}

	}

}
