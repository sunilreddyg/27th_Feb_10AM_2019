package datadrivern.poi;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadData_From_Multiple_Rows {

	public static void main(String[] args) throws IOException 
	{
		String filepath="D:\\sunill\\27th_Feb_10AM_2019\\Project_160\\TestData\\";
		//Target Inputstream file..
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("File located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Using book target sheet
		XSSFSheet sht=book.getSheet("Sheet3");
		
		
		//Get number of rows data available in excel
		int LR_count=sht.getLastRowNum();
		
		
		//Browser initiation
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		//iterate using for loop
		for (int i = 5; i <= LR_count; i++) 
		{
			//Get Dynamic row data from excel
			String username=sht.getRow(i).getCell(0).getStringCellValue();
			String password=sht.getRow(i).getCell(1).getStringCellValue();
			
			//Get static data from sheet..
		
			//Get Url From Excel
			String Url=sht.getRow(0).getCell(1).getStringCellValue();
			//Load webpage to browser window
			driver.get(Url);
			
			//Get Locator from excel
			String Email_locator=sht.getRow(1).getCell(1).getStringCellValue();
			String Password_locator=sht.getRow(2).getCell(1).getStringCellValue();
			String Login_btn_locator=sht.getRow(3).getCell(1).getStringCellValue();
			
			//Perfrom login scenario
			driver.findElement(By.xpath(Email_locator)).clear();
			driver.findElement(By.xpath(Email_locator)).sendKeys(username);
			
			driver.findElement(By.xpath(Password_locator)).clear();
			driver.findElement(By.xpath(Password_locator)).sendKeys(password);
			
		}
		

	}

}
