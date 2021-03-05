package com.fleetgru.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        features = "src/test/resources/features",
        glue = "com/fleetgru/stepdefinitions",
        dryRun = false,//if it is false it is redundant,means unnecessary, in case of true it is not.it should be mentioned.
        tags = "@smoke"
)
public class CukesRunner {
}
