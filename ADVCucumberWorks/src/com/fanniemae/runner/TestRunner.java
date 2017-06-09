package com.fanniemae.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"Features/com/fanniemae/feature"},
		glue={"com.fanniemae.step"},
		plugin={"pretty","html:target/cucumber-html-report"},
		//output to console
		monochrome=true
		//tags={"@Smoke"}
		//tags={"@Sanity"}
		
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
