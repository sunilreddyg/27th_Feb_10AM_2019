package browser_launch;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Chrome {

	public static void main(String[] args)
	{
		
		/*
		 * Before launch chrome browser download chromedriver
		 * 		=> https://sites.google.com/a/chromium.org/chromedriver/downloads
		 * 		=> Choose chromedriver version and chrome browser version
		 * 		=> Download zip format file and unzip to backup location
		 */
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		ChromeDriver chrome=new ChromeDriver();
		chrome.get("http://google.com");

	}

}
