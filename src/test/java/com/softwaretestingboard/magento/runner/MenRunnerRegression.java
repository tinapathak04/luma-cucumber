package com.softwaretestingboard.magento.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/featurefile/Men.feature",
        glue = "com/nopcommerce/demo/cucumber",
        tags = "@regression",
        plugin = {"pretty", "html:target/cucumber-report/cucumber.html"} //for cucumber report
)
public class MenRunnerRegression {
}
