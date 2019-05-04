package example_inheritance;

public class ClassC extends ClassB
{
	public int ID=100;
	
	public void method3()
	{
		System.out.println("method 3 executed");
	}
	
	
	
	public static void main(String args[])
	{
		
		ClassA obj=new ClassC();
		//Only parent Class A methods and variables
		obj.method1();
		System.out.println(obj.toolname);
		
		
		ClassB ref=new ClassC();
		//Only Parent classes  A and B methods
		System.out.println(ref.price);
		System.out.println(ref.toolname);
		ref.method1();
		ref.method2();
		
		
		
		//Can Access ClassA and ClassB and ClassC methods
		ClassC var=new ClassC();
		var.method1(); //From ClassA
		var.method2(); //From ClassB
		var.method3(); //From ClassC
		
		
		
		
		
	}

}
