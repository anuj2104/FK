package com.mmt.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.base.TestBase;
import com.mmt.qa.pages.Homepage;
import com.mmt.qa.pages.Loginpage;

public class Login_Page_Test extends TestBase
{
	Loginpage loginpage;
	Homepage homepage;
	public Login_Page_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		
		loginpage=new Loginpage();	
		
	}
	

	@Test(priority=1)
	public void loginpageTitleTest() throws InterruptedException
	{
		String title=loginpage.validateLoginpage();
		Assert.assertEquals(title,prop.getProperty("titlecheck") );
		Thread.sleep(4000);
	}
	
	
	@Test(priority=2)
	public void flipkartlogoimageTest() throws InterruptedException
	{
		boolean flag=loginpage.validateflipkartimage();
		Assert.assertTrue(flag);
		Thread.sleep(4000);
	}
	

	@Test(priority=3)
	
	public void loginTest() throws InterruptedException
	{
	   
	    homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(4000);
       
		//homepage=loginpage.loginPriority2(prop.getProperty("username"), prop.getProperty("password"));
		//Thread.sleep(4000);
	}


	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
	
	

}
