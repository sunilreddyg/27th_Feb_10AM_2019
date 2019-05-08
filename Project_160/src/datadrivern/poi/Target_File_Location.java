package datadrivern.poi;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Target_File_Location {

	public static void main(String[] args) 
	{
		
		
		try {
			
			String filepath="D:\\sunill\\27th_Feb_10AM_2019\\Project_160\\TestData\\";
			//Target Inputstream file..
			FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
			System.out.println("File located");
		
			//Access workbook
			XSSFWorkbook book=new XSSFWorkbook(fi);
			System.out.println("Workbook accessed with input file stream");
			
			//Target sheet using above book
			XSSFSheet sht=book.getSheet("Sheet1");
			
			//Target Row using above sheet
			XSSFRow row=sht.getRow(1);
			
			//Using row target cell
			XSSFCell cell=row.getCell(0);
			
			//Read Cell value
			String URL=cell.getStringCellValue();
			System.out.println("Application url is => "+URL);
			
			//Using referral row get cell data
			String CustomerID=row.getCell(1).getStringCellValue();
			System.out.println("Customer ID is => "+CustomerID);
			
			//Using sheet referral get perticular Row and Cell Data
			String User_PWD=sht.getRow(1).getCell(2).getStringCellValue();
			System.out.println("user password is => "+User_PWD);
			
			//change number cell to string manually at excel by adding <'>
		    String mobile=sht.getRow(1).getCell(3).getStringCellValue();
		    System.out.println("Mobile number is =>"+mobile);
		    
		    
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
