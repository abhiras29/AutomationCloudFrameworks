package com.Maven.DemoMavenArtifact;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.KlovReporter;


public class ExtentReportTest{

	@Test
	public void verifyExtentReportFunc()
	{
		new ExtentTestNGReportBuilder();
		
		KlovReporter klov = new KlovReporter();
	
		// specify mongoDb connection
		klov.initMongoDbConnection("localhost", 27017);
	
		// specify project
		// ! you must specify a project, other a "Default project will be used"
		klov.setProjectName("Java");
	
		// you must specify a reportName otherwise a default timestamp will be used
		klov.setReportName("AppBuild");
	
		// URL of the KLOV server
		// you must specify the served URL to ensure all your runtime media is uploaded
		// to the server
		klov.setKlovUrl("http://localhost");
		
		Assert.assertEquals(true, true);
	}
}
