package framework_testng.Run_Keywords;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
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
	
	
	
	//===================User_defined_keywords
	
	
	/*
	 * Keywordname:--> Method verify title presented at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	 */
	public boolean is_title_presented(String exp_title)
	{
		try {
			
			boolean flag=wait.until(ExpectedConditions.titleContains(exp_title));
			return flag;
			
		} catch (TimeoutException e) {
			return false;
		}
	}
	
	
	/*
	 * MethodName:--> Verify url presented at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public boolean isUrl_Presented(String Exp_Url)
	{
		try {
			
			boolean flag=wait.until(ExpectedConditions.urlContains(Exp_Url));
			return flag;
			
		} catch (TimeoutException e) {
			return false;
		}
	}
	
	
	
	/*
	 * MethodName:--> Method verify text visible at webpage
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	
	public boolean isText_visibleAt_Webpage(String Exp_text)
	{
		//Identify page
		WebElement page=driver.findElement(By.tagName("body"));
		//Capture page visible text
		String page_visibleText=page.getText();
		//Verify expected text visible at webpage
		boolean flag=page_visibleText.contains(Exp_text);
		return flag;
	}
	
	
	/*
	 * MethodName:--> Method verify Alert presented at webpage and return boolean value
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public boolean isAlert_presented()
	{
		try {
			
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	
	/*
	 * MethodName:--> Accept or dismiss alert window
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public void CloseAlert()
	{
		if(isAlert_presented())
		{
			driver.switchTo().alert().accept();
		}
		
	}
	
	
	
	/*
	 * MethodName:--> Method return selected row and cell value [From static table]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	public WebElement Get_Static_Webtable_Cell(String TableXpath,int Row, int Cell)
	{
		//Identify Webtable
		WebElement table=driver.findElement(By.xpath(TableXpath));
		
		//Find number of rows available at webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		//Target Required row
		WebElement SelectedRow=rows.get(Row);
		
		//using selected row find list of cells
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//Target Required Cell
		WebElement Webtable_cell=cells.get(Cell);
		
		return Webtable_cell;
	}
	
	
	
	
	/*
	 * MethodName:--> Method return selected Record referal cell [From Dynamic table]
	 * Author:-->
	 * CreatedON:-->
	 * ReviewedBy:-->
	 * Parametersused:-->
	 * Lasupdated Date:--->
	*/
	
	public WebElement Get_Dynaic_Webtable_Cell(String TableXpath, String Recordname,int Cell)
	{
		//Identify Webtable
		WebElement table=driver.findElement(By.xpath(TableXpath));
		
		//Find number of rows available at webtable
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		
		boolean flag=false;
		WebElement Webtable_Cell = null;
		//Iterate for number of rows
		for (int i = 1; i < rows.size(); i++) 
		{
			
			//target Each Dynamic row at table
			WebElement DynamicRow=rows.get(i);
			
			//Capture text on Each Row
			String RowText=DynamicRow.getText();
			
			//Accept Condition where any record match in dynamic row
			if(RowText.contains(Recordname))
			{
				flag=true;
				System.out.println("Row Number is => "+i);
				
				//using Dynamic row find List of Cells
				List<WebElement> cells=DynamicRow.findElements(By.tagName("td"));
				
				//Target Required Cell
				Webtable_Cell=cells.get(Cell);
				break;  //stop Iteration
				
			}
		}//for
		
		 System.out.println("Record avaiable status is => "+flag);
		 return Webtable_Cell;
		
	}//Method
	
	
	
	

}
