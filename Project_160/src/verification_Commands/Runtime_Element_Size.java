package verification_Commands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Runtime_Element_Size 
{

	public static void main(String[] args) 
	{
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//identify sensex tab
		WebElement Sensex_tab=driver.findElement(By.xpath("//a[contains(@id,'InvestRec')]"));
		
		
		//Get Element Dimension
		Dimension obj_dim=Sensex_tab.getSize();
		//Get object height and width using dimension
		int Obj_height=obj_dim.getHeight();
		int Obj_width=obj_dim.getWidth();
		
		System.out.println("Objec height is => "+Obj_height);
		System.out.println("Objec width is => "+Obj_width);
		
		

	}

}
