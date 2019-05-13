package keyword_driven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel 
{
	
	static FileInputStream fi;
	static FileOutputStream fo;
	static XSSFWorkbook book;
	static XSSFSheet sht;
	static XSSFRow row;
	static XSSFCell cell;
	static String filepath="C:\\Users\\Administrator\\git\\27th_Feb_10AM_2019\\Project_160\\src\\keyword_driven_Framework\\";
	
	
	/*
	 * Methodname:-->  Excel connecton with required sheet
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public static void excel_connection(String filename, String sheetname)
	{
		try {
			fi=new FileInputStream(filepath+filename);
			book=new XSSFWorkbook(fi);
			sht=book.getSheet(sheetname);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	
	/*
	 * Methodname:-->  Read Data from specific row and column
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public static String getcellData(int row , int col)
	{
		
		return sht.getRow(row).getCell(col).getStringCellValue();
		
	}
	
	
	/*
	 * Methodname:-->  Write cell data
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public static void writeCellData(int row, int col,String result)
	{
		sht.getRow(row).createCell(col).setCellValue(result);
	}
	
	
	
	/*
	 * Methodname:-->  Write cell data
	 * Author:-->
	 * Created on:-->
	 * parameters used:-->
	 */
	public static void Create_Excel_output(String output_filename)
	{
		try {
			book.write(new FileOutputStream(filepath+output_filename));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
