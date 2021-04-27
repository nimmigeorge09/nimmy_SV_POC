package com.api.sv.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"src/main/java/com/api/sv/featurefiles/WebelementEx.feature"},
		glue= {"com.api.sv.stepdfn"}
		)

public class WebelementFunctionRunner extends AbstractTestNGCucumberTests {

}
