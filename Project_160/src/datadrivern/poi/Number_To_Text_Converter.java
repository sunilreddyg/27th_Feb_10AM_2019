package datadrivern.poi;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Number_To_Text_Converter 
{

	public static void main(String[] args) throws IOException
	{
	
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
		
		//Example:--> Convert Numeric cell value to text..
		
		//Taret 5th Numeric Cell
		Double Mobile=row.getCell(5).getNumericCellValue();
		//Using Double Format convert Number to text
		String New_MobileNumber=NumberToTextConverter.toText(Mobile);
		System.out.println("Mobile number in text format => "+New_MobileNumber);
	}

}
