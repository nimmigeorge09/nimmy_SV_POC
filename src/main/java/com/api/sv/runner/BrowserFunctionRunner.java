package com.api.sv.runner;

/*import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/main/java/com/api/sv/featurefiles/browserfunction.feature"},
		glue= {"com.api.sv.stepdfn"}
		)

public class BrowserFunctionRunner {

}*/





import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = {"src/main/java/com/api/sv/featurefiles/browserfunction.feature"},
		glue= {"com.api.sv.stepdfn"}
		)

public class BrowserFunctionRunner extends AbstractTestNGCucumberTests{

}
