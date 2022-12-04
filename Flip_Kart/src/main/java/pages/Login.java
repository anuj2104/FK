/**
 * 
 */
package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

/**
 * @author Anuj
 *
 */
public class Login extends Base
{
    //page factory
	   
	@FindBy(xpath="//input[@class='_2zrpKA _1dBPDZ']")
	WebElement loginusername;
	
	@FindBy(xpath="//input[@class='_2zrpKA _3v41xv _1dBPDZ']")
	WebElement loginpassword;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginbutton;
	
	
	//page factory initialized
	
	public Login()
	{
		PageFactory.initElements(driver,this);
	}

	public void login_Method(String un,String pwd) throws InterruptedException
	{
	      loginusername.sendKeys(un);
	      Thread.sleep(4000);
	      loginpassword.sendKeys(pwd);
	      Thread.sleep(4000);
	      loginbutton.click();
	      Thread.sleep(3000);
	}
	
}
