package corejava.Collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Interface 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Set:--> Unorder collection of objects.Set Doesn't accept duplicates
		 */
		      Set<String> set=new HashSet<String>();
		      set.add("IDE");
		      set.add("RC");
		      set.add("WD");
		      set.add("GRID");
		      set.add("APPIUM");
		      set.add("BDD");
		      set.add("WD");

		      
		      //Get size of collection of objects
		      int length=set.size();
		      System.out.println("Size of objects is => "+length);
		      
		      //Remove object for Set interface
		      set.remove("BDD");
		      
		      //Verify object contains under Set interface
		      boolean flag=set.contains("APPIUM");
		      System.out.println("Object available status is => "+flag);
		      
		      //Read Next iterator
		      String Next_itr=set.iterator().next();
		      System.out.println("next iterator object is => "+Next_itr);
		      
		      
		      //Apply foreach loop to print all objects
		      for (String Eachobject : set) 
		      {
				System.out.println("=> "+Eachobject);
			  }
		      
		      
		      
		      
		      
		

	}

}
