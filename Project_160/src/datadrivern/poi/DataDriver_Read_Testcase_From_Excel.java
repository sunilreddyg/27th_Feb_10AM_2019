package datadrivern.poi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDriver_Read_Testcase_From_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		String filepath="D:\\sunill\\27th_Feb_10AM_2019\\Project_160\\TestData\\";
		//Target Inputstream file..
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("File located");
		
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		
		//Using book target sheet
		XSSFSheet sht=book.getSheet("Sheet2");
	
		//Target first row
		XSSFRow row=sht.getRow(1);
		
		
		//Get Url from cell
		String Appurl=row.getCell(1).getStringCellValue();
		//browser initiation
		WebDriver driver=new ChromeDriver();
		//load webpage 
		driver.get(Appurl);   //Appurl input form excel
		driver.manage().window().maximize();
		
		//Get Signin button locator from Excel
		String Singin_btn_locator=row.getCell(2).getStringCellValue();
		driver.findElement(By.xpath(Singin_btn_locator)).click();
		
		
		//Get email locator and xpath from excel
		String Email_locator=row.getCell(3).getStringCellValue();
		String Email_input=row.getCell(4).getStringCellValue();
		driver.findElement(By.xpath(Email_locator)).clear();
		driver.findElement(By.xpath(Email_locator)).sendKeys(Email_input);
		
		//Get Email next button locator from excel
		String Next_btn=row.getCell(5).getStringCellValue();
		driver.findElement(By.xpath(Next_btn)).click();
		
		
		
		
	}

}
