package excel_package;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import jxl.Sheet;
import jxl.Workbook;

public class Excel_Read_Class {

	public static void main(String[] args) 
	{
		
		try {
			
			//How to Create connection from selenium to excel sheet
			FileInputStream fi=new FileInputStream("Testdata\\Excel_inputdata.xls");
			//Create Connection for workbook
			Workbook wbook=Workbook.getWorkbook(fi);
			//Craete Connection for sheet
			Sheet wsht=wbook.getSheet("URL");
			
			//How to read the data from excel sheet in Runtime
			String app_url=wsht.getCell(0,1).getContents();
			System.out.println(app_url);
			
			//Application
			WebDriver driver=new ChromeDriver();
			driver.navigate().to(app_url);
			driver.manage().window().maximize();
			
			//Another sheet
			Sheet wsht1=wbook.getSheet("FB_Creation");
			
			//How many rows are present in Current excel sheet in Runtime
			int rc=wsht1.getRows();
			System.out.println("Rows Count:---"+rc);
			
			//For loops
			
			for (int i =1; i < rc; i++) 
			{
				
				String fn=wsht1.getCell(0,i).getContents();
				String ln=wsht1.getCell(1,i).getContents();
				String mob=wsht1.getCell(2,i).getContents();
				String pwd=wsht1.getCell(3,i).getContents();
				String da=wsht1.getCell(4,i).getContents();
				String mon=wsht1.getCell(5,i).getContents();
				String yer=wsht1.getCell(6,i).getContents();
				
				//FirstName
				driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).clear();
				driver.findElement(By.xpath("//input[contains(@id,'u_0_j')]")).sendKeys(fn);
				
				//Lastname
				driver.findElement(By.cssSelector("input[name='lastname']")).clear();
				driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys(ln);
				
				//Mobile
				driver.findElement(By.cssSelector("input[aria-label*='Mobile number']")).clear();
				driver.findElement(By.cssSelector("input[aria-label*='Mobile number']")).sendKeys(mob);
				
				//password
				driver.findElement(By.xpath("//*[starts-with(@id,'u_0_v')]")).clear();
				driver.findElement(By.xpath("//*[starts-with(@id,'u_0_v')]")).sendKeys(pwd);
				
				//day
				new Select(driver.findElement(By.cssSelector("#day"))).selectByVisibleText(da);
				//month
				new Select(driver.findElement(By.id("month"))).selectByVisibleText(mon);
				
				//year
				new Select(driver.findElement(By.name("birthday_year"))).selectByVisibleText(yer);
			}
			
		
			
			
			
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
