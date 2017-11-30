package com.Framework;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverImp {
	
	private static WebDriver mdriver;
	
	/**
	This is constructor and empty for now 
	**/
	public void webdriverImp()
	{
		
	}
	public void waitTillElementAppears(WebElement element,int waittime)
	{
		WebDriverWait wait = new WebDriverWait(mdriver, waittime);
		wait.until(ExpectedConditions.visibilityOf(element));		
	}
	
	public void FluentWait(By E, int waittime)
	{
		WebDriverWait wait = new WebDriverWait(mdriver, waittime);
		
	}

	public static void setup()
	{
		System.setProperty("webdriver.chrome.driver", "ThirdParty//chromedriver_win32//chromedriver.exe");
		mdriver = new ChromeDriver();
		mdriver.get("https://login.salesforce.com/");
		mdriver.manage().window().maximize();
		mdriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	public static void tearDown()
	{
		mdriver.close();
		
	}
	
	public static WebDriver getDriver()
	{
		return mdriver;
	}

}
