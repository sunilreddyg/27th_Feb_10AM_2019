package encapsulation;

public class UserData 
{
	//All variables declared as private so that in other classes it won't be visible
	private String name;
	private String email;
	private String mobile;
	
	
	//Setter method intilize value to private variable with help of prameters
	public void set_name(String New_name)
	{
		name=New_name;
	}
	
	//Setter method intilize value to private variable with help of prameters
	public void set_email(String New_email)
	{
		email=New_email;
	}
	
	//Setter method intilize value to private variable with help of prameters
	public void set_mobile(String New_mobile)
	{
		mobile=New_mobile;
	}
	
	//Method initialized data to methodname
	public String get_name()
	{
		return name;
	}
	
	//Method initialized data to methodname
	public String get_email()
	{
		return email;
	}
	
	//Method initialized data to methodname
	public String get_mobile()
	{
		return mobile;
	}
	

}
