package com.Maven.DemoMavenArtifact;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.KlovReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {
    
    private static ExtentReports extent;
    
    public static ExtentReports getInstance() {
    	if (extent == null)
    		createInstance("test-output/extent.html");
    	
        return extent;
    }
    
    public static ExtentReports createInstance(String fileName) {
        ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
        htmlReporter.config().setTestViewChartLocation(ChartLocation.BOTTOM);
        htmlReporter.config().setChartVisibilityOnOpen(true);
        htmlReporter.config().setTheme(Theme.STANDARD);
        htmlReporter.config().setDocumentTitle(fileName);
        htmlReporter.config().setEncoding("utf-8");
        htmlReporter.config().setReportName(fileName);
        
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
		
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter,klov);
        
        return extent;
    }
}
