package corejava.Loops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Group_Links {

	public static void main(String[] args) throws Exception 
	{
		//browser initiation command
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String links[]={"Sign Up","Log In","Messenger","Find Friends"};
		
		//iterate for expected array length 
		for (int i = 0; i < links.length; i++) 
		{
			driver.findElement(By.linkText(links[i])).click();
			Thread.sleep(3000);
			
			System.out.println(links[i]+" -->  runtime title is => "+driver.getTitle());
			
			driver.navigate().back();
			Thread.sleep(3000);
			
			
		}
		

	}

}
