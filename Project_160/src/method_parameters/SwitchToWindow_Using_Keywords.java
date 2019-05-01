package method_parameters;

import org.openqa.selenium.By;

public class SwitchToWindow_Using_Keywords 
{

	public static void main(String[] args) 
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("https://www.hdfcbank.com/wholesale/default.htm");
		obj.set_timeout(30);
		
		obj.Select_dropdown(By.xpath("//select[@name='where']"), "ATM");
		obj.switchto_window("ATMs in India.");
		obj.wait_for_Element_visible(By.xpath("//select[@name='stateName']"));
		obj.Capturescreen("ATM window");
		
		obj.switchto_window("Wholesale Banking");
		obj.Capturescreen("Mainwindow");
		
		
		
		
		
		
		
		

	}

}
