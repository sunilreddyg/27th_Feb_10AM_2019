package waitcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Until_Inputvalue_LoadAt_Editbox {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		//Locate element and store into referral
		By Email_locator=By.id("identifierId");
		
		//Enter email and press enter key at keyboard
		driver.findElement(Email_locator).clear();
		driver.findElement(Email_locator)
		.sendKeys("mindq");
		
		//Apply explicit wait until required text visible at editbox.
		new WebDriverWait(driver, 50).until
		(ExpectedConditions.textToBePresentInElementValue(Email_locator, "mindqdsnr"));
		System.out.println("mindqdsnr text visible at editbox as input");
		

	}

}
