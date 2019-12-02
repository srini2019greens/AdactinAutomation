package com.cucumber.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.base.AllMethods;
import com.cucumber.helper.ConfigReader;
import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {
		"com.cucumber.listener.ExtentCucumberFormatter:src\\test\\resource\\com\\cucumber\\reports\\ExtentReport\\extent.html",
		"json:src\\test\\resource\\com\\cucumber\\reports\\report.json",
		"junit:src\\test\\resource\\com\\cucumber\\reports\\report.xml",
		"html:src\\test\\resource\\com\\cucumber\\reports\\" }, 
		features = "src\\test\\java\\com\\cucumber\\feature\\Adactin.feature", 
		glue = "com.cucumber.stepdefinition",
		dryRun = false, strict = true, monochrome = true,tags="@TC_101")

public class TestRunner extends AllMethods{

	@BeforeClass
	public static void browserLaunch() throws Throwable {
		ConfigReader cr = new ConfigReader();
		driver = gettingBrowser(cr.getBrowserName());
	}

	@AfterClass
	public static void quit() {
		//driver.quit();
		Reporter.loadXMLConfig(new File(
				System.getProperty("user.dir") + "\\src\\test\\resource\\com\\cucumber\\prop\\extent-config.xml"));
	}

}
