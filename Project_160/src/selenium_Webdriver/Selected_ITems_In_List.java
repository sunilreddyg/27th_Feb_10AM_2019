package selenium_Webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selected_ITems_In_List {

	public static void main(String[] args) throws Exception 
	{
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://outlook.live.com/");
		driver.manage().window().maximize();
		
		
		//Click Link
		driver.findElement(By.linkText("Create free account")).click();
		
		
		//Identify Editbox and type text into it
		driver.findElement(By.id("MemberName")).clear();
		driver.findElement(By.id("MemberName")).sendKeys("darshanqa123");
		
		//select domain option from list..

		//Click button to open list of domain names
		driver.findElement(By.id("domainLabel")).click();
		Thread.sleep(4000);  //Time to wait until Domain names displayed
		driver.findElement(By.linkText("hotmail.com")).click();
		
		//click next button
		driver.findElement(By.id("iSignupAction")).click();
	}

}
