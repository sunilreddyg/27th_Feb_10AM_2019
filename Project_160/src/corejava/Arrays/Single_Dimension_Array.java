package corejava.Arrays;

public class Single_Dimension_Array {

	public static void main(String[] args) 
	{
		
		/*
		 * Array:-->
		 * 		 => Collection of similar events
		 * 		 => Set of similar events we can store into single varaible..
		 */
		
		
		
		/*
		 * staticArray:-->
		 * 			We must set boundaries before store values.
		 * 			=> Array index starts from zero
		 */
		 String browsers[]=new String[4];
		 browsers[0]="chrome";
		 browsers[1]="firefox";
		 browsers[2]="opera";
		 browsers[3]="edge";
		 
		 System.out.println("printing last index value => "+browsers[3]);
		 
		 
		 
		 /*
		  * RuntimeArray:-->
		  * 		=> Also known as dynamic array
		  */
		 int val[]={100,200,300,400,500};
		 System.out.println("second index value is => "+val[2]);
		 
		 
		 
		 /*
		  * length:--> method return size of array
		  */
		 System.out.println("Array size is => "+val.length);
		
		
		

	}

}
