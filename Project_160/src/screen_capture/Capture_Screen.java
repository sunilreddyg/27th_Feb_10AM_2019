package screen_capture;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Capture_Screen 
{

	public static void main(String[] args) throws IOException, Exception 
	{
		//Browser initiation and loading webpage..
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		driver.manage().window().maximize();
		
				
		/*
		 * To use fileutils in selenium 3.6 above version below downloads required.
		 * 
		 * URL:--> https://commons.apache.org/proper/commons-io/download_io.cgi
		 * 		   Download binrary file  --> commons-io-2.6-bin.zip
		 * 		   Unzip file and configure all executable jar files to selenium-project.
		 */
		
		
		
		//Perform movetoelement action
		WebElement Aboutus_link=driver.findElement(By.xpath("//a[@title='About Us']"));
		new Actions(driver).moveToElement(Aboutus_link).perform();
		Thread.sleep(4000);
		
		
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("screens\\image.png"));
		

		
		/*
		 *  Note:-->
		 *  		WebDriver capture only visible screen at webpage, Because
		 *  		by using movetoelement command focus required element before
		 *  		taken screenshot.
		 *  
		 *  	=> WebDriver always override screen when ever we repeatedly execute
		 *  		syntax..
		 */
		
		
		
		

	}

}
