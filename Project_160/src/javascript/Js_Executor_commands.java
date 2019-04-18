package javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Js_Executor_commands {

	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//Enable javascript executor on automation browser
		JavascriptExecutor js=((JavascriptExecutor)driver);
		
		//Type text into editbox using javascript
		js.executeScript("document.getElementById('u_0_j').value='NewUser'");
		js.executeScript("document.getElementById('u_0_l').value='WebDriver'");		
				
		//Type text into editbox using xpath
		WebElement Mobile_editbox=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		js.executeScript("arguments[0].value='Newuserwebdriver@gmail.com'", Mobile_editbox);
		
		//Javascript executor using xpath 
		WebElement Day_Dropdown=driver.findElement(By.xpath("//select[@aria-label='Day']"));
		//Select dropdown option
		js.executeScript("arguments[0].value='19'", Day_Dropdown);  //Dropdown option value property..
		
		
		//Javascript executor using xpath 
		WebElement Month_Dropdown=driver.findElement(By.xpath("//select[@aria-label='Month']"));
		//select dropdown option
		js.executeScript("arguments[0].value='11'", Month_Dropdown);
		
		//select radio button
		WebElement Female_radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='1']"));
		js.executeScript("arguments[0].click()",Female_radio_btn);
		Thread.sleep(4000);
				
		//select radio button
		WebElement male_radio_btn=driver.findElement(By.cssSelector("input[type='radio'][value='2']"));
		js.executeScript("arguments[0].checked=true",male_radio_btn);
				
				
				
		
		
		
	}
}
