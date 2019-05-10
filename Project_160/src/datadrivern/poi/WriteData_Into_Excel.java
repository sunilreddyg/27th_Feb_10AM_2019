package datadrivern.poi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData_Into_Excel 
{

	public static void main(String[] args) throws IOException 
	{
		//Target file 
		String filepath="D:\\sunill\\27th_Feb_10AM_2019\\Project_160\\TestData\\";
		FileInputStream fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("file located");
				
		//Access workbook
		XSSFWorkbook book=new XSSFWorkbook(fi);
		//Get Sheet acces using above book referal
		XSSFSheet sht=book.getSheet("Sheet1");
		
		
		//Write data into existing row and existing cell
		sht.getRow(1).getCell(2).setCellValue("Newpwd123");
		
		//Write date into existing row and New cell
		sht.getRow(1).createCell(6).setCellValue("Testpass");

		//Write Data into new row and new cell
		sht.createRow(2).createCell(0).setCellValue("http://facebook.com");
		
		
		//Create output workbook
		book.write(new FileOutputStream(filepath+"OP.xlsx"));
		book.close();  //Write and Save Data into Excel
		

	}

}
