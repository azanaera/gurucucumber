package main;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {
                     "classpath:features/guru.feature",
//                     "classpath:features/sample.feature",
                   },
        glue = {"classpath:step_definitions"},
        plugin = {"pretty"})
public class RunCucumberTest {
}