package sikuli_Scripting;

import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Firefox_browser {

	public static void main(String[] args) throws SikuliException, InterruptedException 
	{
		
		
		String filepath="D:\\sunill\\21st_Jan_2019_6PM\\SBI_Insurance\\Screens\\";
		Thread.sleep(5000);
		
		//Create object for Sikuli
		Screen sikuli=new Screen();
		sikuli.doubleClick(filepath+"Ficon.png");
		Thread.sleep(10000);
		
		sikuli.type(filepath+"Search.png", "selenium");
		Thread.sleep(5000);
		
		sikuli.click(filepath+"Go.png");
		Thread.sleep(5000);
		
		
	/*	sikuli.findText("Selenium - Web Browser Automation");
		System.out.println("Text found");*/
		
		sikuli.click(filepath+"Link_Selenium.png");

	}

}
