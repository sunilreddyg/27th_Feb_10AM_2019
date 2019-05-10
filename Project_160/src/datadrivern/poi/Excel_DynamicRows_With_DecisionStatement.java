package datadrivern.poi;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_DynamicRows_With_DecisionStatement
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
		XSSFSheet sht=book.getSheet("Sheet4");
		
		
		//Get number of rows data available in excel
		int LR_count=sht.getLastRowNum();
		

		//iterate using for loop
		for (int i = 5; i <= LR_count; i++) 
		{
			
			//Get dynamic row data
			String Exe_status=sht.getRow(i).getCell(2).getStringCellValue();
			
			//Accept Condition When execution status return Y
			if(Exe_status.equalsIgnoreCase("y"))
			{
				
				//Get username and password inputs from dynamic row
				String username=sht.getRow(i).getCell(0).getStringCellValue();
				String password=sht.getRow(i).getCell(1).getStringCellValue();
				
				
				System.out.println(username+"   "+password);
				
				
				//get Scenario type from excel
				String Stype=sht.getRow(i).getCell(3).getStringCellValue();
				
				if(Stype.equalsIgnoreCase("p"))
				{
					System.out.println(username+ " ==>positive output captured");
				}
				else if(Stype.equalsIgnoreCase("n"))
				{
					System.out.println(username+ " ==>negative output captured");
				}
				else if(Stype.equalsIgnoreCase("text"))
				{
					System.out.println(username+ " ==>text output captured");
				}
				else if(Stype.equalsIgnoreCase("alert"))
				{
					System.out.println(username+ " ==>alert output captured");
				}
				else
					System.out.println(username+" ==>Scenario type mismatch");
			}
			
			
		}

	}

}
