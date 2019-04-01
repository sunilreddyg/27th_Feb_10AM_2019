package corejava.conditional_Statements;

public class Decision_StateMents
{

	public static void main(String[] args) 
	{
		
		
		/*
		 * If:-->
		 * 		Is a conditional statement which allow any block
		 * 		of statements to execute...
		 * 	
		 * 	Note:--> Any single decision to execute if statement is useufll
		 * 		--> If accept only boolean value..
		 */
		  
		
		String day="sunday";
		
		if(day=="sunday")
		{
			System.out.println("Sunday is holiday");
		}
		
		
		
		/*
		 * IF-ElSE:-->
		 * 		=> double decision statement
		 */
		int Age=16;
		if(Age>18)
		{
			System.out.println("Age match");
		}
		else
		{
			System.out.println("Age mismatch");
		}
		
		
		
		/*
		 * Else-if
		 * 		=> Multiple decision to execute.
		 */
		String wday="thu";
		
		if(wday=="sun")
		{
			System.out.println("Sun");
		}
		else if(wday=="mon")
		{
			System.out.println("mon");
		}
		else if(wday=="tue")
		{
			System.out.println("tue");
		}
		else if(wday=="wed")
		{
			System.out.println("wed");
		}
		else if(wday=="thu")
		{
			System.out.println("thu");
		}
		else
		{
			System.out.println("Day mismatch");
		}
		
		
		
		
		/*
		 * Switch-case:-->
		 * 		It execute multiple decisions same as else if statement.
		 * 		But only diff switch case execute exact decision whitout
		 * 		checking every statement.
		 */
		String browser="ie";
		switch (browser) 
		{
		case "chrome":
			    System.out.println("Chrome browser launched");
			break;
			
		case "firefox":
			 System.out.println("firefox browser launched");
			break;
			
			
		case "ie":
			System.out.println("ie browser launched");
			break;

		default: System.out.println("browser mismatch");
			break;
		}
		
		
		
		
		
		

	}

}
