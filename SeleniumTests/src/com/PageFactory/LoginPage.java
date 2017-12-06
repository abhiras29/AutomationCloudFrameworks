package com.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	private WebElement username;
	private WebElement password;
	private WebElement submit;
	
	public LoginPage(WebDriver driver){
		
		username=driver.findElement(By.id("username"));
		password=driver.findElement(By.id("password"));
		submit=driver.findElement(By.id("Login"));
	}
	
	public WebElement Username()
	{
		return username;
	}
	
	public WebElement Password()
	{
		return password;
	}
	
	public WebElement SubmitBtn()
	{
		return submit;
	}
}
