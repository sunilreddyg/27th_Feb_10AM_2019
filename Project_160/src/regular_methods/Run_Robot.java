package regular_methods;

public class Run_Robot 
{

	public static void main(String[] args) 
	{
		/*
		 * Note:--> Without Static Access specifier any method
		 * 			we can using object creation.
		 * 
		 * 		Classname obj=new Classname();
		 * 		obj.methodname();
		 */
		Robot obj=new Robot();
		obj.Run();
		obj.Walk();
		
	}

}
