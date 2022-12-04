/**
 * 
 */
package test_login;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.Login;

/**
 * @author Anuj
 *
 */
public class Login_Test extends Base
{
	Login loginpageobj;
   public Login_Test()
   {
	   super();
   }
   
   
   @BeforeMethod
   public void setup()
   {
	   base_method();
	    loginpageobj=new Login();
   }
   
   @Test
   public void logintest() throws InterruptedException
   {
	  loginpageobj.login_Method(prop.getProperty("username"),prop.getProperty("password"));
	  
	  Thread.sleep(4000);
   }
   
   @AfterMethod
   public void teardown()
   {
	   driver.quit();
   }
}
