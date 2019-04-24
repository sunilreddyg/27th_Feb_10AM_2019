package corejava.Arrays;

public class Double_Dimension_Array 
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * Note:--> Double dimension array represent table datadriven format
		 * 			to store values.
		 */
		
		
		//Static Array:--> 
		String data[][]=new String[3][2];
		
		//1st row data
		data[0][0]="user1";
		data[0][1]="pwd1";
		
		//2st row data
		data[1][0]="user2";
		data[1][1]="pwd2";
		
		//3rd row data
		data[2][0]="user3";
		data[2][1]="pwd3";
		
		
		//Get Double dimension array value
		System.out.println("value is => "+data[1][0]);
		
		
		
		
		
		//Runtime double dimension array:-->
		String browser_data[][]=
			{
					{"firefox","65"},
					{"chrome","73"},
					{"ie","11"},
			};
		
		
		//Print chrome value
		System.out.println("browsername is => "+browser_data[1][0]);
		
		


	}

}
