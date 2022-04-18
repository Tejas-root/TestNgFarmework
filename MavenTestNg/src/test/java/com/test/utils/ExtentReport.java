package com.test.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReport {

	
static ExtentReports extent;
	
	public static ExtentReports getReportObject() {
		String path = "test-output/TestNGReport.html";
		ExtentHtmlReporter reporter = new ExtentHtmlReporter(path);
		reporter.config().setReportName("Test Automation Report");
		reporter.config().setDocumentTitle("Queue Codes Test Report");
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Host Name", "Tejas");
		extent.setSystemInfo("User Name", "Tejas");
		return extent;
	}
	
	
}
