package com.cybertek.library.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "@target/rerun.txt",  // feature file will read my feature files
        glue = "com/cybertek/library/step_definitions"

)

public class FailedTestRunner {
}
