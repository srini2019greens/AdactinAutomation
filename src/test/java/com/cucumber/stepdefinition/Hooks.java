package com.cucumber.stepdefinition;

import java.io.File;

import com.cucumber.base.AllMethods;
import com.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Before
	public static void beforeHooks() throws Throwable {
	}
	
	@After
	public static void afterHooks(Scenario scenario) throws Throwable {
		if (scenario.isFailed()) {
			File des=AllMethods.screenShot(scenario.getName());
			Reporter.addScreenCaptureFromPath(des.getAbsolutePath());
		}
		
	}
}
