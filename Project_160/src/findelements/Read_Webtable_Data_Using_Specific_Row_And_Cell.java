package findelements;


import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Read_Webtable_Data_Using_Specific_Row_And_Cell 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Example:--> Read Data from webtable using specific and row and cell.
		 */
		
		//browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.icicidirect.com/idirectcontent/Markets/MarketOverview.aspx");
		driver.manage().window().maximize();
		
		
		//Identify markets link
		WebElement Markets_link=driver.findElement(By.xpath("//a[contains(.,'markets')]"));
		Markets_link.click();
		
		
		//Identify Webtable
		WebElement table=driver.findElement(By.xpath("//div[@id='pnl_Bse']/table"));
		
		//Find list of Rows under table
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		System.out.println("List of rows available under table => "+rows.size());
		
		//Get object from list using index number
		WebElement SelectedRow=rows.get(4);
		
		//Find list of cell under selected row
		List<WebElement> cells=SelectedRow.findElements(By.tagName("td"));
		
		//target 0 cell and 3rd cell
		String CompanyName=cells.get(0).getText();
		String HighPrice=cells.get(3).getText();
		
		System.out.println("Company name => "+CompanyName+" :-- And Highprice is => "+HighPrice);
	}

}
