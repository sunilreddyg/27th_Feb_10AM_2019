package switchcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo_Active_Element {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/free-job-alerts");
		driver.manage().window().maximize();
		
		
		WebElement Exp_salary_btn=driver.findElement(By.xpath("//input[@id='cjaMinSal']"));
		Exp_salary_btn.click();
		Thread.sleep(3000);
		
		//Command target active element at webpage..
		driver.switchTo().activeElement()
		.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		
		
		

	}

}
