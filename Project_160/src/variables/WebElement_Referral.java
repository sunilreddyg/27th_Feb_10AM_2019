package variables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WebElement_Referral {

	public static void main(String[] args) 
	{
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		
		//Regulat syntax without reuse-code
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("9030248855");
		
		//WebElement-referral syntax
		WebElement Password_Element=driver.findElement(By.id("pass"));
		Password_Element.clear();
		Password_Element.sendKeys("Hello12345");
		
		//Locator and WebElement referral
		By Login_btn_locator=By.id("loginbutton");
		WebElement Login_btn_Element=driver.findElement(Login_btn_locator);
		Login_btn_Element.click();
		
	

	}

}
