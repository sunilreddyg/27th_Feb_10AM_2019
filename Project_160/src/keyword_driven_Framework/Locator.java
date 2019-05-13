package keyword_driven_Framework;

import org.openqa.selenium.By;

public class Locator 
{
	
	public static By convert_locator(String pname, String pvalue)
	{
		
		By by=null;
		
		switch (pname) {
		
		case "id":
			by=By.id(pvalue);
			break;
			
		case "name":
			by=By.name(pvalue);
			break;
			
		case "classname":
			by=By.className(pvalue);
			break;
			
		case "linktext":
			by=By.linkText(pvalue);
			break;
			
		case "partiallinktext":
			by=By.partialLinkText(pvalue);
			break;
			
		case "cssselector":
			by=By.cssSelector(pvalue);
			break;
			
		case "xpath":
			by=By.xpath(pvalue);
			break;
			
		case "tagname":
			by=By.tagName(pvalue);
			break;

		default:
			break;
		}
		
		return by;
		
	}
	
	

}
