package com.Runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/feature/featureFile/AdminPage.feature",
                 glue = "StepDefinition", 
                 monochrome = true, 
		plugin = { "pretty", "io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm", "json:target/cucumber.json" })
public class Runner extends AbstractTestNGCucumberTests {

}
