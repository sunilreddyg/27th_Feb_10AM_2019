package variables;

public class String_Comparision_Commands 
{

	public static void main(String[] args) 
	{
		
		/*
		 * String:-->
		 * 		=> String is a non-primitive datatype.
		 * 		=> String also called as class,Because String
		 * 			contains set of events to validate stored
		 * 			characters..
		 */
		String act_result="Account created";
		String exp_result="Account Created";
		
		
		/*
		 * Equals:-->
		 * 			Methdo verify equal comparision between two strings and
		 * 			return boolean value true/false.
		 */
		
		boolean flag=act_result.equals(exp_result);
		System.out.println("Equal comparision is => "+flag);
		
		
		/*
		 * EqualIgnorecase:-->
		 * 			Method verify equal Comparision between two string with
		 * 			case-sensitive and return boolean value true/false.
		 */
		boolean flag1=act_result.equalsIgnoreCase(exp_result);
		System.out.println("EqualIngore case comparision is => "+flag1);
		
		
		/*
		 * Contains:-->
		 * 		Method verify sub String available at main String and
		 * 		return boolean value true/false.
		 */
		String result="Account 100 created succssfull";
		boolean flag2=result.contains("100");
		System.out.println("Sub String available status is => "+flag2);
		
		
		/*
		 * SubString:-->
		 * 		Method get sub String from main String.
		 */
		String Account_num="0000124578451212";
		String last_digit_num=Account_num.substring(10);
		System.out.println("Last 6 digit number in account is => "+last_digit_num);
		
		//Get middle characters using begin and end index
		String middle_digit_num=Account_num.substring(4, 10);
		System.out.println("middle digit number is => "+middle_digit_num);
		
		
		/*
		 * Length:-->
		 * 		Method return characters length in integer format.
		 */
		String Mobile="9030248855";
		int len=Mobile.length();
		System.out.println("Method number in number of charcters are => "+len);
		
		
		
		/*
		 * Trim;-->
		 * 		Method trim extra spaces
		 */
		String Pincode="    500076   ";
		System.out.println("before trim length of pincode is => "+Pincode.length());
		//Trim extra spaces
		String New_pincode=Pincode.trim();
		System.out.println("After trim length of pincode is => "+New_pincode.length());
		
		
		/*
		 * Starts-with:-->
		 * 		method verify character sequence start with expected
		 * 		sequance and return boolean value true/false.
		 */
		String IFSC_Code="HDFC000012";
		boolean flag3=IFSC_Code.startsWith("HDFC");
		System.out.println("IFSC code stats with HDFC Status is=> "+flag3);
		
		
		/*
		 * isemtpy:-->
		 * 		Method return boolean status on empty string.
		 */
		String var="";
		String var1="MQ";
		System.out.println("var empty status is => "+var.isEmpty());
		System.out.println("var1 empty status is => "+var1.isEmpty());
		
		
		/*
		 * ToLowerCase:-->
		 * 		Method convert uppercase charcters to lowercase
		 */
		String Toolname="WEBDRIVER";
		System.out.println("After convert to lowercase => "+Toolname.toLowerCase());
		
		
		
		
	}

}
