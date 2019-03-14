package selenium_Webdriver.Dropdown;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Multiple_option_Selection {

	public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		driver.manage().window().maximize();
		
		
		//Method return multple selection state in true/false
		boolean flag=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag);
		

		/*
		 * Using javascript executor convert single option dropdown to multiple
		 * 		selection dropdown.
		 */
		((JavascriptExecutor)driver).executeScript("document.getElementById"
				+ "('open_account').setAttribute('multiple','multiple')");
		Thread.sleep(5000);
		
		
		//Method return multple selection state in true/false
		boolean flag1=new Select(driver.findElement(By.id("open_account"))).isMultiple();
		System.out.println("Dropdown multiple selection state is => "+flag1);
		

		//Write decision statement to Select multiple options
		if(flag1==true)
		{
			Select OpenAccount=new Select(driver.findElement(By.id("open_account")));
			OpenAccount.deselectAll();  //We can deselect only on multiple seleciton type
			OpenAccount.selectByIndex(1);
			OpenAccount.selectByIndex(3);
			OpenAccount.selectByIndex(5);
		}
		else
		{
			System.out.println("Dropdown is a single option selection type");
		}
		
		
	}

}
