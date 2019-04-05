package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Location 
{

	public static void main(String[] args) 
	{
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//identify sensex tab
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
		
		
		//Get Element point at webapge
		Point Obj_point=Sensex_tab.getLocation();
		//using object point get x and y coordinates
		int Obj_x=Obj_point.getX();
		int Obj_y=Obj_point.getY();
		
		System.out.println("Obj x coordinates are => "+Obj_x);
		System.out.println("Obj y coordinates are => "+Obj_y);
		
		
		//Verify Element visibility of object using coordinates..
		if(Obj_x > 0)
			System.out.println("Element visible at webpage");
		else
			System.out.println("Element not visible at webpage");
	}

}
