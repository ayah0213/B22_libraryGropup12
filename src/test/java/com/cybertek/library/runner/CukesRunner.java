package com.cybertek.library.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",//generate Json type of file,
                // where the result of of the running of our project will be stored in JSON format
                //We will use this file(cucumber.json)with a 3rd party tool which
                // will be reading this file and generate more understandable report

                "rerun:target/rerun.txt"// this plugin will allow us to store failed tests in a .txt file
                // we will have 2nd runner class which will be reading from this running only fails tests
        },
        features = "src/test/resources/features",
        glue = "com/cybertek/library/step_definitions" ,
        dryRun = true,
        tags = ""
)

public class CukesRunner {
}
