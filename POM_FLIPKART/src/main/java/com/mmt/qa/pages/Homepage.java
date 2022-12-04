package com.mmt.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mmt.qa.base.TestBase;

public class Homepage extends TestBase
{

	
	@FindBy(xpath="//input[@class='LM6RPg']")
	WebElement searchbox;
	
	@FindBy(xpath="//button[@class='vh79eN']")
	WebElement searchbox_button;
	
	@FindBy(xpath="//div[contains(text(),'My Account')]")
	WebElement myaccount;
	
	@FindBy(xpath="//*[@id='container']/div/div[1]/div[1]/div[2]/div[4]/div/div/span/div")
	WebElement more;
	
	@FindBy(xpath="//a[@href='/viewcart?otracker=Cart_Icon_Click']")
	WebElement cart;
	
	
	
	public Homepage()
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public String verifyPageTitle()
	{
		System.out.println("before HomePage get title suite");
		return driver.getTitle();
	}
	
	
	public Searchpage  clickonsearchbox() throws InterruptedException
	{
		searchbox.sendKeys("mobile");
		Thread.sleep(6000);
		searchbox_button.click();
	    Thread.sleep(6000);
		
		return new Searchpage();
	}
	
	
	public Myaccountpage clickonmyaccount()
	{
		myaccount.click();
		return new Myaccountpage();
	}
	
	public Morepage clickonmore()
	{
		more.click();
		return new Morepage();
	}
	
	
	public Cartpage clickoncart()
	{
		cart.click();
		return new Cartpage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
