package com.fb.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "..\\src\\test\\resources",
			glue = "com.fb",
			dryRun = false,
			monochrome = true,
			plugin = {"html:target/html","json:target/report.json"})
	
	public class TestRunner{
	
	
}
