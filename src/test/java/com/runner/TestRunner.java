package com.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@ RunWith(Cucumber.class)
@ CucumberOptions(features="src\\test\\resources\\Feature\\Facebook.feature",glue="com.stepdef",monochrome=true)
public class TestRunner {

}
 