package method_parameters;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Repository 
{
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	/*
	 * Keywordname:-->  Launch diff browsers [Firefox,Chrome,IE]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void LaunchBrowser(String browsername)
	{
		switch (browsername) 
		{
		case "firefox":
			driver=new FirefoxDriver();
			break;
			
		case "chrome":
			driver=new ChromeDriver();
			break;
			
		case "ie":
			driver=new InternetExplorerDriver();
			break;
			
			
		default:System.out.println("browser mismatch");
			break;
		}
	}
	
	
	/*
	 * Keywordname:-->  load webapplication url to browser window
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void load_webpage(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	
	/*
	 * Keywordname:-->  set dynamic timeout [Implicit/explicit]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void set_timeout(int time_in_seconds)
	{
		//Implicit wait timeout
		driver.manage().timeouts().implicitlyWait(time_in_seconds, TimeUnit.SECONDS);
		//Explicit wait timeout
		wait=new WebDriverWait(driver, time_in_seconds);
	}
	
	
	
	/*
	 * Keywordname:-->  Enter text into editbox using xpath locator
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void Enter_text(String elemnet_Xpath,String inputdata)
	{
		WebElement Editbox=driver.findElement(By.xpath(elemnet_Xpath));
		Editbox.clear();
		Editbox.sendKeys(inputdata);
	}
	
	
	
	/*
	 * Keywordname:-->  Enter text into editbox using WebElement [Pagefactory keyword]
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void Enter_text(WebElement Element,String inputdata)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOf(Element));
		Editbox.clear();
		Editbox.sendKeys(inputdata);
	}
	
	/*
	 * Keywordname:-->  Enter text into editbox using Locator
	 * Author:-->
	 * CreatedOn:-->
	 * ReviewedBy:-->
	 * parametersUsed:-->
	 * LastUpdatedDate:-->
	 */
	public void Enter_text(By locator,String inputdata)
	{
		WebElement Editbox=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		Editbox.clear();
		Editbox.sendKeys(inputdata);
	}
	
	
	/*
	 * MethodName:--> Select Dropdown using optioname
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public  void Select_dropdown(By locator, String Option_name)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Select(Dropdown).selectByVisibleText(Option_name);
		
	}
	
	
	/*
	 * MethodName:--> Select Dropdown using optioname [For pagefactory]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public  void Select_dropdown(WebElement Element, String Option_name)
	{
		WebElement Dropdown=wait.until(ExpectedConditions.visibilityOf(Element));
		new Select(Dropdown).selectByVisibleText(Option_name);
		
	}
	
	

	/*
	 * MethodName:--> Click Element [Radiobutton, checkbox,link,button,list,image...etc]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public  void Click_element(By locator)
	{
		driver.findElement(locator).click();
	}
	
	
	/*
	 * MethodName:--> waitandclick [Radiobutton, checkbox,link,button,list,image...etc]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Wait_and_click(By locator)
	{
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	

	/*
	 * MethodName:--> waitforElementto visisble
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void wait_for_Element_visible(By locator)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	
	/*
	 * MethodName:-->Mouse hover on element
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void MouseHover(By locator)
	{
		WebElement Element=wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		new Actions(driver).moveToElement(Element).perform();
	}
	
	
	/*
	 * MethodName:-->ContextClick
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void RightClick_OnElement(By locator)
	{
		WebElement Element=driver.findElement(locator);
		new Actions(driver).contextClick(Element).perform();
	}
	
	
	/*
	 * MethodName:-->switch to window using window title
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void switchto_window(String window_title)
	{
		//Get all window dyamic id's
		Set<String> allwindows=driver.getWindowHandles();
				
		//Apply foreach loop ot iterate 
		for (String Eachwindow : allwindows) 
		{
			driver.switchTo().window(Eachwindow);
			//Get Current window at runtime
			String pagetitle=driver.getTitle();
					
			if(pagetitle.contains(window_title))
			{
				break;  //At what window title break iteration.It keep window controls on same window.
			}
				
		}	
	}
	
	
	/*
	 * MethodName:-->Capture Screenshot
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public void Capturescreen(String Imagename) 
	{
		//Java time stamp..
		DateFormat df=new SimpleDateFormat("yyyy/MMM/dd/ hh-mm-ss");
		//Get System Data
		Date d=new Date();   //import java.util;
		//Using simple formatter change system data..
		String time=df.format(d);
		
		System.out.println(d.toString());
		
		
		try {
			
			File src1=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src1, new File("screens\\"+time+Imagename+".png"));

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
