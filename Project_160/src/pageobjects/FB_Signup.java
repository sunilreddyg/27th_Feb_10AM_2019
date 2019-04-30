package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FB_Signup 
{
		
	
	@FindBy(how=How.ID,using="u_0_j") 
	WebElement Firstname_EB;
	
	@FindBy(how=How.XPATH,using="//input[contains(@name,'lastname')]") 
	WebElement Surname_EB;
	
	@FindBy(id="u_0_o")
	WebElement Mobile_or_Email_EB;
	
	
	@FindBy(xpath = "//input[@id='u_0_r']")
	WebElement Retype_email_EB;
	
	
	@FindBy(xpath = "//input[contains(@id,'u_0_v')]")
	WebElement password_EB;
	
	@FindBy(xpath = "//select[@title='Day']")
	WebElement Day_DD;
	
	@FindBy(xpath = "//select[@title='month']")
	WebElement Month_DD;
	
	@FindBy(xpath = "//select[@title='year']")
	WebElement Year_DD;
	
	@FindBy(how=How.TAG_NAME,using="a")
	List<WebElement> All_links;
	
	
	//InputData
	public String IP_Firstname="Arjun";
	public String IP_Secondname="Akash";
	public String IP_Mobile_or_Email="ArjunAkash@gmail.com";
	public String IP_Retype_Email="ArjunAkash@gmail.com";
	public String IP_password="hello123456";
	public String IP_day="22";

	
}
