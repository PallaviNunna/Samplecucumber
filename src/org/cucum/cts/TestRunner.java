package org.cucum.cts;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="Feature\\Demoqa.feature",glue="StepDef")
public class TestRunner {

}
