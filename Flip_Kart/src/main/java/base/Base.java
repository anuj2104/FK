/**
 * 
 */
package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Anuj
 *
 */
public class Base
{
   public static Properties prop;
   public static  WebDriver driver;
	public Base()
	{
	     System.out.println("initialize construction");
		 prop= new Properties();	
		try {
			FileInputStream fis=new FileInputStream("D:\\Workplace_Eclipse\\FlipKart\\src\\main\\java\\"
				                                      	+ "cofiguration\\config.properties");
			prop.load(fis);
			System.out.println("property file loaded");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public void base_method() 
	{
		String browsername=prop.getProperty("browser");
		if(browsername.equals("chrome"))
{		
		 System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
}
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(4,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
/*	
	public static void main(String[] args) throws InterruptedException
	{
	Base objbase=new Base();
	objbase.base_method();
	System.out.println("cleared Base");
	}	
*/
}
