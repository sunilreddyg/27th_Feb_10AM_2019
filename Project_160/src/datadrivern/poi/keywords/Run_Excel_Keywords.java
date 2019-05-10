package datadrivern.poi.keywords;

public class Run_Excel_Keywords 
{

	public static void main(String[] args)
	{
		
		ExcelKeywords.getExcel_connection("InputData.xlsx", "Sheet3");
		for (int i = 5; i <= ExcelKeywords.sht.getLastRowNum(); i++) 
		{
			String username=ExcelKeywords.getcelldata(i, 0);
			System.out.println(username);
			
			ExcelKeywords.write_celldata(i, 2, "testpass");
		}
		ExcelKeywords.Create_excel_output("OP1.xlsx");
		
		

	}

}
