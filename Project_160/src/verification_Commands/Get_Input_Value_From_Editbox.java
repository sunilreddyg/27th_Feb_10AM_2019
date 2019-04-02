package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Input_Value_From_Editbox 
{

	public static void main(String[] args) throws Exception 
	{
		
		/*
		 * Testcase:-->
		 * 			Verify correct operator and circle name displaye 
		 * 			w.r.t mobile number..
		 * Steps:-->
		 * 		Enter site url http://paytm.com
		 * 		Select Preapid Radio button
		 * 		Enter mobile number
		 * 
		 * Expected:-->	
		 * 		System should autogenarate  operator name circle name
		 * 
		 */
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
		
		//Identify postpaid radio button
		WebElement Post_paid_radio_btn=driver.findElement(By.xpath("//label[text()='Postpaid']"));
		Post_paid_radio_btn.click();
		
		
		//Identify mobile number editbox
		WebElement Mobile_num=driver.findElement(By.xpath("//input[@type='tel']"));
		Mobile_num.clear();
		Mobile_num.sendKeys("9030248855");
		Thread.sleep(5000);
		
		
		//Identify Operator editbox
		WebElement Operator_Editbox=driver.findElement(By.xpath("//label[text()='Operator']/preceding-sibling::input"));
		//Capture auto-genarated input value from editbox
		String Operatorname=Operator_Editbox.getAttribute("value");
		
		
		//Identify Circle editbox
		WebElement Circle_editbox=driver.findElement(By.xpath("//label[text()='Circle']/preceding-sibling::input"));
		//Capture auto-genarated input value from editbox
		String CircleName=Circle_editbox.getAttribute("value");
	
		
		
		//Verify Expected operator name circle displayed
		if(Operatorname.equals("Airtel"))
			System.out.println("Operator display as expected");
		else
			System.out.println("Wrong operator displayed");

		
		if(CircleName.equals("Andhra Pradesh"))
			System.out.println("Circel displayed at expected");
		else
			System.out.println("wrong circle name displayed");
		
		
	}

}
