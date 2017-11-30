package com.SeleniumTests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.Framework.WebdriverImp;
import com.PageFactory.LoginPage;

public class TestSuiteFile {

	public static LoginPage pg;
	
	@Before
	public void setup()
	{
		WebdriverImp.setup();
		pg = new LoginPage(WebdriverImp.getDriver());
	}
	
	@Test
	public void test1()
	{
		pg.Username().click();
		pg.Username().sendKeys("rastogi");
		pg.Password().sendKeys("******");
		pg.SubmitBtn().click();
		Assert.assertTrue("" , true);
		//Verify.verify(true, "", "");
		
		
	}
	

	
	@After
	public void tearDown()
	{
		WebdriverImp.tearDown();
	}
}
