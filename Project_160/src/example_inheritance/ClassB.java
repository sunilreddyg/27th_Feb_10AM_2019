package example_inheritance;

public class ClassB extends ClassA
{
	
	Double price=1000.12;   //Global variable
	
	void method2()
	{
		
		System.out.println("method 2 Running");
		
		method1();//From ClassA
		System.out.println(toolname);   //From ClassA
		
	}
	
	
	public static void main(String args[])
	{
		//Create object for ClassB 
		//It can access parent ClassA and Child ClassB methods and variable
		
		ClassB obj=new ClassB();
		obj.method1();   //from ClassA
		obj.method2();   //from ClassB
		
		//It can Access Only parent class A methods and variables
		ClassA ref=new ClassB();
		ref.method1();  //from classA
		
	
	}
	
	

}
