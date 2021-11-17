package com.qascript.stepDefs;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@Cucumber.Options(
        features="src/test/java/com/features",
        glue = "stepDefinition",
        monochrome=true
)
public class TestRunner {
}
