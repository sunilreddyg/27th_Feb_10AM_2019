package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class Robot_Copy_String {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		//Launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String text="Selenium automate web browser interfaces";
		
		//Select Text
		StringSelection Stext=new StringSelection(text);
		//Get system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//set Content to clipboard
		clipboard.setContents(Stext, Stext);
		
		
		//Pefrom ctrl+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		//Press S key
		robot.keyPress(KeyEvent.VK_S);
		//Keyup control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		
		//Add text to Clipbord at runtime
		String path="C:\\Users\\Administrator\\git\\27th_Feb_10AM_2019\\Project_160\\src\\robot_actions\\OP.txt";
		StringSelection Spath=new StringSelection(path);
		clipboard.setContents(Spath, Spath);
		
		
		//Pefrom ctrl+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Keyup control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
	
		
		
		
		


	}

}
