package com.wordpress.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Login.feature"},
        plugin = {"pretty", "html:target/cucumber-html", "json:target/json/json-login.json"},
        glue = {"com.wordpress.stepdefinitions"}

)
public class LoginTestRunner {

}
