package com.swaglabs.login.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources",
        glue = "com/swaglabs/login/step_definitions",
        tags = "@wip"

)
public class CukesRunner {
}
