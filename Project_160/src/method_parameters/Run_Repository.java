package method_parameters;

import org.openqa.selenium.By;

public class Run_Repository {

	public static void main(String[] args)
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("http://facebook.com");
		obj.set_timeout(30);
		
		
		//Enter text into editbox using keyword
		obj.Enter_text("//input[@id='u_0_j']", "Akash");
		obj.Enter_text("//input[contains(@id,'u_0_l')]", "Kiran");
		
		//Enter text into editbox using keyword
		obj.Enter_text(By.cssSelector("#u_0_o"), "Akashkiran@gmail.com");
		obj.Enter_text(By.id("u_0_r"),"Akashkiran@gmail.com");
		
		//Select Dropdown option
		obj.Select_dropdown(By.xpath("//select[@id='day']"), "13");
		obj.Select_dropdown(By.xpath("//select[@id='month']"), "Jul");
		obj.Select_dropdown(By.xpath("//select[@id='year']"), "1990");
		
		
		
		
	}

}
