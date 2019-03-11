package browser_launch;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Launch_IE_browser 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Download IEdriverServer.exe file
		 * 	=> URl:--> https://www.seleniumhq.org/download/
		 * 	=> Under The Internet Explorer Driver Server download
		 * 			zip format file w.r.t selenium and hotspot version.
		 * 
		 * 	IE browser version:-->   8,9,10,11 
		 * 
		 *  security info:-->
		 *  		Disable all security and popup blockers before automation
		 */
		
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("http://google.com");

	}

}
