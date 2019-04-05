package validationcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Runtime_IsEnabled 
{

	public static void main(String[] args) throws Exception 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		//Select Dropdown
		WebElement Open_account=driver.findElement(By.id("open_account"));
		//Use New Selector to get single option
		new Select(Open_account).selectByVisibleText("Corporate Account");
				
		//Target Webelement
		WebElement Open_my_account_btn=driver.findElement(By.xpath("//input[@value='Open my Account']"));
		Open_my_account_btn.click();
				
				
		Thread.sleep(5000);
		
		//Identify dropdown
		WebElement City=driver.findElement(By.id("FML_USR_ADDRSS_CTY_DROP"));
		
		//Select Any predefined city option at dropdown
		new Select(City).selectByIndex(4);
	
		//Expected [State] and [Others-editbox] should be disabled
		WebElement Others_editbox=driver.findElement(By.id("FML_USR_ADDRSS_CTY_OTHERS"));
		WebElement State_editbox=driver.findElement(By.id("FML_USR_ADDRSS_STTE_DIS"));
		
		
		//Write decision statement to verify disable
		if(!Others_editbox.isEnabled() &&   !State_editbox.isEnabled())
			System.out.println("As expected both editboxes are disabled, on Any city selection");
		else
			System.err.println("testfail editboxes expected to be disable");
		
		Thread.sleep(5000);
		//Select Ohters option at city dropdown
		new Select(City).selectByVisibleText("Others");
		
	
		
		
		//Expected [State] and [Others-editbox] should be Enabled
		//Write decision statement to verify enabled
		if(Others_editbox.isEnabled() &&   State_editbox.isEnabled())
			System.out.println("As expected both editboxes are enabled on others option selection");
		else
			System.err.println("testfail editboxes expected to be enabled");
		

	}

}
