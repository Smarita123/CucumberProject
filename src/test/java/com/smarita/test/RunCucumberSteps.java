package com.smarita.test;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, features = "src/test/resources",glue="com.smarita.test", plugin = {"pretty", "html:target/cucumber-report.html"},publish = true)
public class RunCucumberSteps {

}