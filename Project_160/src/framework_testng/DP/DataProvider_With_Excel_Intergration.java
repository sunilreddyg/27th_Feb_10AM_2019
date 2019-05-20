package framework_testng.DP;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_With_Excel_Intergration 
{
	 FileInputStream fi;
	 XSSFWorkbook book;
	 XSSFSheet sht;
	 XSSFRow row;
	 String filepath="D:\\sunill\\27th_Feb_10AM_2019\\Project_160\\Testdata\\";
	
	 
	 @Test(dataProvider="userdata")
	 public void Verify_Operator(String Operator,String Mobile)
	 {
		 
	 }
	 
	 
	 
	 
	 
	 

	@DataProvider
	public String[][] userdata()
	{
		int LRnum=sht.getLastRowNum();
		System.out.println("Row number is => "+LRnum);
		String data[][];
		data=new String[LRnum+1][2];
		
		for (int i = 0; i <= LRnum; i++) 
		{
			
			//Iterate for number of cell
			for (int j = 0; j <=1; j++)
			{
				data[i][j]=sht.getRow(i).getCell(j).getStringCellValue();
			}
		}
		
		
		return data;
	}
	
	
	
	
	
	@BeforeClass
	public void setUpBeforeClass() throws Exception 
	{
		fi=new FileInputStream(filepath+"InputData.xlsx");
		System.out.println("file located");
		book=new XSSFWorkbook(fi);
		sht=book.getSheet("Sheet7");
		
		
	}


	@AfterClass
	public void tearDownAfterClass() throws Exception 
	{
		book.close();
	}
	

}
