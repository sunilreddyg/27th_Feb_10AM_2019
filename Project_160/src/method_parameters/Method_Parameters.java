package method_parameters;

public class Method_Parameters 
{

	//method without parameters
	public void print_tool()
	{
		String name="WebDriver";
		System.out.println("Tool name is => "+name);
	}
	
	//method with single parameters
	public void print_tool(String tool)
	{
		String name=tool;
		System.out.println("Selenium => "+name);
	}
		
	public void print_tool(String tool,double price)
	{
		String name=tool;
		System.out.println("Selenium => "+name+" And price is => "+price);
	}
	
	
	
	public static void main(String[] args) 
	{
		
		//Create object for class
		Method_Parameters obj=new Method_Parameters();
		obj.print_tool();
		
		//Calling method with argument
		obj.print_tool("IDE");
		obj.print_tool("RC");
		obj.print_tool("WD");
		obj.print_tool("GRID");
		
		//Calling method with multiple parameters
		obj.print_tool("IDE", 100.00);
		obj.print_tool("RC", 110.32);
		

	}

}
