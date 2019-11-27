package com.cucumber.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\com\\cucumber\\feature\\",
		glue="com.cucumber.stepdefinition"
		)
public class TestRunnerClass {
	
	@BeforeClass
	public static void driverInitization() {
		System.out.println("Driver initiazation");
	}

	@AfterClass
	public static void driverquit() {
		System.out.println("Quit");
	}
}
