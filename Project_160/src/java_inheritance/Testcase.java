package java_inheritance;

public class Testcase extends Helper
{
	
	public void precondition()
	{
		//launch browser
		browser_launch();
		load_application();
		
	}
	
	
	public void verify_login()
	{
		//Enter email
		Enter_text();
		//Enter password
		Enter_text();
		//click signin button
		click_element();
	}


}
