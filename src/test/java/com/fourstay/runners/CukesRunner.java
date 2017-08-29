package com.fourstay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "html:target/cucumber-reports",
		"json:target/cucumber.json" }, features = "src/test/resources/features", glue = "com/fourstay/step_definitions", tags = "@Assignment", dryRun = false)
public class CukesRunner {
	// My name is CAgri and I am adding this comment to show that I know how to
	// update
	// a java project and push and commit to GitHub back.

	/*
	 * I can do it too
	 */

}