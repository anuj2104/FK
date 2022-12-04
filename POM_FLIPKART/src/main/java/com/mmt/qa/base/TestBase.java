package com.mmt.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mmt.qa.utils.Testutil;

public class TestBase
{

	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
	// how to read properties file
	try {
	 prop=new Properties();
	FileInputStream ip= new FileInputStream("D:\\Anuj_java_selenium\\Immediate\\src"
			                              + "\\main\\java\\com\\mmt\\qa\\configuration\\configuration.properties");
	prop.load(ip);
	}catch(FileNotFoundException e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
}
	
	public static void initialization()
	{
	 String browsername=prop.getProperty("browser");
	 
	 if (browsername.equals("chrome"))
	 {
		 System.setProperty("webdriver.chrome.driver", "D:\\Anuj_java_selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver(); 
		
	 }
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().pageLoadTimeout(Testutil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS );
	  driver.manage().timeouts().implicitlyWait(Testutil.IMPLICITY_WAIT,TimeUnit.SECONDS);
	  
	  
	  driver.get(prop.getProperty("url"));
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	}
	
	
	
	
	
	
	
	
	
	
}
