package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Frame_With_Index {

	public static void main(String[] args) 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.manage().window().maximize();
		
		
		//Switch to frame using index number
		driver.switchTo().frame(0);
		
		//click link under frame
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		

	}

}
