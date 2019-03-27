package variables;

public class DataTypes {

	public static void main(String[] args) 
	{
		
		/*
		 * Int:-->  Only accept numeric values
		 * 			Default value is  -- [0]
		 */
		int a=100;
		int b=200;
		
		//condut addition between two numbers
		int c=a+b;
		System.out.println("total value is => "+c);
		
		
		/*
		 * boolean:--> only accept true/false
		 * 			   Default value is --> [false]
		 */
		boolean flag=true;
		System.out.println("status is => "+flag);
		
		
		/*
		 * String:-->  Allow set of charcters to store.
		 * 			   Default value is --> [NULL]
		 */
		String name="MQ-dsnr";
		String mobile="9030248855";
		String Address="#310, sreeman rama towers, chaitanyapuri";
		
		
		System.out.println(name+"    "+mobile+"    "+Address);
		
		
	}

}
