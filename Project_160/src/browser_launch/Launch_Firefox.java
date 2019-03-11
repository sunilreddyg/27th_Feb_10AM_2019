package browser_launch;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Firefox
{

	public static void main(String[] args)
	{
		/*
		 * Download geckodriver server:-->
		 * 
		 * 			=> URL:--> https://github.com/mozilla/geckodriver/releases/tag/v0.24.0
		 * 			=> Download latest version w.r.t  Operating systems
		 * 						Firefox => 65+
		 * 						gecodriver version:-->v0.24.0
		 * 			=> Download zip format file for windows and unzip file
		 * 						to project folder.
		 */
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		FirefoxDriver firefox=new FirefoxDriver();
		firefox.get("http://seleniumhq.org");
		
		
		
		
	}

}
