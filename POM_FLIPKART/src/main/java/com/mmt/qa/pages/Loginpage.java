package com.mmt.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.qa.base.TestBase;

public class Loginpage extends TestBase
{

	//page factory or object repository
	
	@FindBy(xpath="//button[@class='_2AkmmA _29YdH8']")
	WebElement crossButton;
	
	@FindBy(xpath="//a[@href='/account/login?ret=/']")
	WebElement loginAndSignup;
	
	@FindBy(xpath="//input[@class='_2zrpKA']")
	WebElement username;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement continueButton;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI jUwFiZ']")
	WebElement loginWithpassword;
	
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@class='_2AkmmA _1LctnI _7UHT_c']")
	WebElement loginbutton;	

	@FindBy(xpath="//img[@src='//img1a.flixcart.com/www/linchpin/fk-cp-zion/img/flipkart-plus_4ee2f9.png']")
	WebElement flipkartimage;
	
	public Loginpage()
	{
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	
	public String validateLoginpage()
	{
		return driver.getTitle();
	}
	 
	public boolean validateflipkartimage()
	{
		return flipkartimage.isDisplayed();
	}

	//handle login page by try,,,,,catch
	

	
	public Homepage login(String un, String pwd) throws InterruptedException
	{
		crossButton.click();
		Thread.sleep(4000);
		
		loginAndSignup.click();
		Thread.sleep(4000);
		
		username.sendKeys(un);
		Thread.sleep(4000);
	/*	
	  if(driver.findElements(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).size()!=0){
		 
		  continueButton.click();
			Thread.sleep(4000);
	  }	
	  else{
		  System.out.println("not there");
	  }
		
	  if(driver.findElements(By.xpath("//button[@class='_2AkmmA _1LctnI jUwFiZ']")).size()!=0){ 
		  continueButton.click();
			Thread.sleep(4000);
	  }	
	  else{
		  System.out.println("not there psaaa");
	  }
	  
	*/
		List<WebElement> passwo = driver.findElements(By.xpath("//input[@type='password']"));
		  if(passwo.size()!=0){
			  System.out.println(passwo.size());
			  passwo.get(0).sendKeys(pwd);
				Thread.sleep(4000);
				loginbutton.click();
				System.out.println("password dfdf sdf s");
				Thread.sleep(4000);
				
				
				
		  }	
		  else{
			  loginPriority2(un,pwd);
		  }
		  return new Homepage();
	}
	

	public Homepage loginPriority2(String un,String pwd) throws InterruptedException
	{
		
		
		System.out.println("initialized after first method failed to execute");
		        crossButton.click();
	            Thread.sleep(4000);
				
				loginAndSignup.click();
				Thread.sleep(4000);
				
				username.sendKeys(un);
				Thread.sleep(4000);
				
				continueButton.click();
				Thread.sleep(4000);
				
				continueButton.click();
				Thread.sleep(4000);
				
				password.sendKeys(pwd);
				Thread.sleep(4000);
				
				loginbutton.click();
				Thread.sleep(4000);
				
				
				return new Homepage();
	}
	
	

}
