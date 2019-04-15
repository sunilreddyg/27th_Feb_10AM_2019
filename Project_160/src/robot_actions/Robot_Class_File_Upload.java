package robot_actions;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Robot_Class_File_Upload 
{

	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://my.naukri.com/account/register/basicdetails");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[@value='exp']")).click();
		Thread.sleep(3000);
		
		WebElement Upload_resume=driver.findElement(By.xpath("//input[@type='file']"));
		Upload_resume.click();
		Thread.sleep(5000);
		
		String text = "C:\\Users\\Administrator\\Downloads\\Sunil.docx";
		StringSelection stringSelection = new StringSelection(text);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringSelection, stringSelection);
		
		
		//Create object for Robot framework
		Robot robot=new Robot();
		
		//paste copied string into File input
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Release key
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(5000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		

	}

}
