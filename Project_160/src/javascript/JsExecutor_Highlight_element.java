package javascript;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor_Highlight_element 
{

	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	
		//Create Interface for JsExecutor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Identify element
		WebElement text=driver.findElement(By.xpath("//span[contains(.,'Create an account')]"));
		
		//Highlight text using jsexecutor
		js.executeScript("arguments[0].style.backgroundColor='yellow'",text);
		
		//Set outline for text
		js.executeScript("arguments[0].style.outline ='red solid 2px'",text);
		Thread.sleep(5000);
		
		
		//take screen shot of webpage
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\Signup_header.png"));
		
		
		
		
		//To clear javascript executor effects refresh page once
		driver.navigate().refresh();
		
		

		
	}

}
