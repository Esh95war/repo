package com.qsp.GeneralUtil;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listner implements ITestListener {

	ExtentReports er;
	ExtentTest test;
	ExtentSparkReporter esr;
	
	public void onTestStart(ITestResult result) {
		String methodName=result.getName();
		Reporter.log("Test Case Started "+methodName,true);
		test=er.createTest(methodName);
	}

	public void onTestSuccess(ITestResult result) {
		String methodName=result.getName();
		Reporter.log("Test Case Executed Successfully "+methodName,true);
		
	}

	public void onTestFailure(ITestResult result) {
		String methodName=result.getName();
		Reporter.log("Test Case Failed "+methodName,true);
		
	}

	public void onTestSkipped(ITestResult result) {
		String methodName=result.getName();
		Reporter.log("Test Case Skipped "+methodName,true);
		test.log(Status.SKIP,"Test Case Skippeed"+methodName);
	}

	public void onStart(ITestContext context) {
		
		JavaUtil ju=new JavaUtil();
		String path=Iconstant.Reportpath+ju.generateDate()+ju.generateTime();
		
		esr=new ExtentSparkReporter(path+"/t1.html");
		
		esr.config().setReportName("EshWar");
		esr.config().setTheme(Theme.DARK);
		esr.config().setDocumentTitle("Vtiger");
		
		er=new ExtentReports();
		
		er.attachReporter(esr);
		er.setSystemInfo("Version Used", "11");
		er.setSystemInfo("Os", "Windows");
		er.setSystemInfo("System", "64");
		
	}

	public void onFinish(ITestContext context) {
		er.flush();
	}

}
