package com.sconto;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = "com/sconto/stepDefinitions",
tags = "@LoginPositive",
plugin = {"pretty","json:build/cucumber-report.json"})
public class TestRunner {
}


//$()-> only one element
//$$() -> list elements
//buttons.get(0).click();
//check all elements -> $$("locator").shouldHave(size());