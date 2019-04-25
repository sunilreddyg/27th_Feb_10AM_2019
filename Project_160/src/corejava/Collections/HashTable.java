package corejava.Collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args) 
	{
		
		/*
		 *  Hash accept objects to store using key and value, Hashset
		 *  allow pair values to store.
		 */
		
		
		Hashtable<Integer, String> hash = new Hashtable<Integer,String>();
		hash.put(1,"IDE"); 
		hash.put(2,"RC");
		hash.put(3,"WD");
		hash.put(4,"GRID");
		hash.put(5,"APPIUM");
		
		
		//using keyname get keyvalue
		String toolname=hash.get(3);
		System.out.println("toolname is => "+toolname);
		
		
		//Get All keyvalue usng keset
		Set<Integer> keys=hash.keySet();
		for (Integer eachkey : keys) 
		{
			//using each keyname return key value
			System.out.println(hash.get(eachkey));
		}
		
		
		
		
        
        
        
		

	}

}
