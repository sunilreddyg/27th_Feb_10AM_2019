package sikuli_Scripting;

import org.sikuli.script.Screen;
import org.sikuli.script.SikuliException;

public class Sikuli_Script1 
{

	public static void main(String[] args) throws SikuliException, Exception
	{
		
		Thread.sleep(5000);
		
		String image_path="D:\\sunill\\27th_Feb_10AM_2019\\Project_160\\sikuli_Screens\\";
		//Create object for sikuli
		Screen sikuli=new Screen();
		sikuli.doubleClick(image_path+"Cisco_Icon.png");
		Thread.sleep(10000);
	
		
		//Click next button
		sikuli.click(image_path+"Next_btn.png");
		
		
	}

}
