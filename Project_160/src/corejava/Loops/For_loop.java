package corejava.Loops;

public class For_loop 
{

	public static void main(String[] args)
	{
		
		/*
		 * Example:-->
		 * 		Print number from 1 to 20
		 */
		for (int i = 1; i <= 20; i++)
		{
			System.out.println(i);
		}
		
		

		/*
		 * Exmaple:--> Conduct sum between 1 to 100
		 */
		int sum=0;
		for (int i = 1; i <= 100; i++)
		{
			sum=sum+i;
		}
		System.out.println("total value is => "+sum);
		
		
		/*
		 * Example:--> Print array next value using index value
		 */
		String tools[]={"IDE","RC","WD","GRID"};
		//Get length of array
		int itr=tools.length;
		
		//Iterate until array size.
		for (int i = 0; i < itr; i++) 
		{
			System.out.println(tools[i]);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
