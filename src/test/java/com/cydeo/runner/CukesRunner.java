package com.cydeo.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/CukerRunner.html",
        features = "src/test/resources/features/eating_cucumber.feature",
        glue = "com/cydeo/step_definitions",
        dryRun = false,
        tags = "@Regression"
)
public class CukesRunner {


}
