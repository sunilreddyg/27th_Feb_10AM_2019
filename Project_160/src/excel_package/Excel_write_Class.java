package excel_package;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel_write_Class {

	public static void main(String[] args) 
	{
		
		try {
			
			
			//how to Create Connection for  selenium to excel write 
			FileOutputStream fo=new FileOutputStream("Logfiles\\Excelout12.xls");
			//Create connection for excel write workbook
			WritableWorkbook wbook=Workbook.createWorkbook(fo);
			//Craete Connection for writablesheet
			WritableSheet wsht=wbook.createSheet("Result",0);
			WritableSheet wsht1=wbook.createSheet("Result1",1);
			
			//How to write data into excel sheet in Runtime
			Label ab=new Label(0, 0,"Application");
			wsht.addCell(ab);
			
			Label ac=new Label(0, 1,"http://www.gmail.com");
			wsht.addCell(ac);
			
			
			//Another sheet
			Label an=new Label(0, 0,"Fname");
			wsht1.addCell(an);
			
			Label am=new Label(0, 1,"mindq");
			wsht1.addCell(am);
			
		    wbook.write();
			wbook.close();
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
