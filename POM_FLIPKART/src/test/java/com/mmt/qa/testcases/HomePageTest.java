package com.mmt.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mmt.qa.base.TestBase;
import com.mmt.qa.pages.Homepage;
import com.mmt.qa.pages.Loginpage;

public class HomePageTest  extends TestBase
{

	Loginpage loginpage;
	Homepage homepage;
	
	public  HomePageTest()
	{
		super();
		
	}
	
	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		
		//homepage=new Homepage();
		
		loginpage=new Loginpage();
		homepage=loginpage.login(prop.getProperty("username"),prop.getProperty("password"));
	  
	
	}
	

	@Test(priority=1)
	public void verifyHomePageTitileTest()
	{
		//String titleCheck="Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
		String homePageTitle=homepage.verifyPageTitle();
		System.out.println(homePageTitle);
		Assert.assertEquals(homePageTitle,prop.getProperty("titlecheck"),prop.getProperty("message"));
	}
	
	@Test(priority=2)
	public void  searchindexTest() throws InterruptedException 
	{
		
		homepage.clickonsearchbox();
	}
	
	@AfterMethod
	
		public void teardown()
		{
			driver.quit();
		}
	
	
	
	
	
	
	
	
	
}
