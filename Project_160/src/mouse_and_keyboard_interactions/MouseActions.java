package mouse_and_keyboard_interactions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) 
	{
	
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.domainname.in");
		driver.manage().window().maximize();

		//Enable mouse and keyboard interactions on automation browser.
		Actions action=new Actions(driver);
		
		//Target WebElement 
		WebElement Element=driver.findElement(By.id("XYZ"));
		
		//Click on WebElement
		action.click(Element).perform();
		
		//Double click on WebElement
		action.doubleClick(Element).perform();

		//Right click on webElement
		action.contextClick(Element).perform();
		
		//Move to WebElement
		action.moveToElement(Element).perform();
		
		//Click and Hold on WebElement
		action.clickAndHold(Element).perform();
		
		//Release cursor on webElement
		action.release(Element).perform();
		
		WebElement src=driver.findElement(By.id("x"));
		WebElement dst=driver.findElement(By.id("y"));
		//drag and drop
		action.dragAndDrop(src, dst).perform();
		//Drag and drop by
		action.dragAndDropBy(src, 100, 200).perform();
		
		//Drag and drop action using mouse commands
		action.clickAndHold(src).moveToElement(dst).release(src).build().perform();
		
		
		//Keyboard Actions
		action.sendKeys(Keys.TAB).perform();			//onpage
		action.sendKeys(Element, Keys.TAB).perform();   //on location
		
		
		action.keyDown(Keys.CONTROL).perform();       	  //onpage
		action.keyDown(Element,Keys.CONTROL).perform();   //on location
		
		
		
		action.keyUp(Keys.CONTROL).perform();           //on page 
		action.keyUp(Element,Keys.CONTROL).perform();   //on location
		
		
		
		
	}

}
