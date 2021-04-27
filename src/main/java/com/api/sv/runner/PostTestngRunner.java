package com.api.sv.runner;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
@CucumberOptions(
		
				features={"src/main/java/com/api/sv/featurefiles/Login.feature",
						"src/main/java/com/api/sv/featurefiles/postfeature.feature",
						"src/main/java/com/api/sv/featurefiles/browserfunction.feature"},
				glue= {"com.api.sv.stepdfn"},
				monochrome =true
		
		
				)

public class PostTestngRunner extends AbstractTestNGCucumberTests{

}
