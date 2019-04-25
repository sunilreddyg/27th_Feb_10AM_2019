package corejava.Collections;

import java.util.ArrayList;
import java.util.List;

public class List_interface {

	public static void main(String[] args) 
	{
		
			/*
			 * list:--> List store object inorder and accept duplicates
			 */
		
			  List<String> list=new ArrayList<String>();
			  list.add("IDE");
			  list.add("RC");
			  list.add("WD");
			  list.add("GRID");
			  list.add("APPIUM");
			  list.add("BDD");
			  list.add("WD");
			  
			  
			  //Get count of objects under list
			  int length=list.size();
			  System.out.println("Count of object at list is => "+length);
			  
			  
			  /*
			   * get;--> is a method under list interface it allow any object
			   * 		to get using index number.
			   */
			  String object=list.get(4);
			  System.out.println("4th index object under list is => "+object);
			  
			  
			  
			  //Print All object under list using for loop
			  for (int i = 0; i < length; i++) 
			  {
				  String each_object=list.get(i);
				  System.out.println("=> "+each_object);
			  } 
			  
			  
			  
			  //Print All object under list using foreach loop
			  for (String each_item : list) 
			  {
				System.out.println("#  "+each_item);
			  }
			  
			  
			  
	}

}
