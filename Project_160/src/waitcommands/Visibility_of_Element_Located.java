package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Visibility_of_Element_Located 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();    //launch browser
		driver.get("http://gmail.com");		//load webpage
		driver.manage().window().maximize();    //maximize window [optional]
		
		
		//Identify email location and enter text
		driver.findElement(By.id("identifierId")).clear();
		driver.findElement(By.id("identifierId"))
		.sendKeys("qadarshan@gmail.com");
		

		//Create Object for Explicit wait
		WebDriverWait wait=new WebDriverWait(driver, 50);
		
		//Identify element using locator class
		By Password_locator=By.name("password");
		//Set timeout untile expected element visible at webpage
		WebElement Password_Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(Password_locator));
		Password_Editbox.clear();
		Password_Editbox.sendKeys("Hello12345");
		
		
		System.out.println("Element is visible");
		
		
	}

}
