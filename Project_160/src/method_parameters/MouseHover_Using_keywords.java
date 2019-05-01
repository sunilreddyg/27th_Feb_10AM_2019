package method_parameters;

import org.openqa.selenium.By;

public class MouseHover_Using_keywords {

	public static void main(String[] args)
	{
		
		//Create object for Repository
		Repository obj=new Repository();
		obj.LaunchBrowser("chrome");
		obj.load_webpage("https://www.hdfcbank.com/");
		obj.set_timeout(30);
		
		
		obj.MouseHover(By.xpath("//a[@href='/personal/products']"));
		obj.MouseHover(By.xpath("//a[@href='/personal/products/cards']"));
		obj.Wait_and_click(By.linkText("Credit Cards"));
		
		
		
	}

}
