package com.api.sv.runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
					features = {"src/main/java/com/api/sv/featurefiles/postfeature.feature"},
					glue= {"com.api.sv.stepdfn","com.api.sv.hooks"}
				)


public class PostRunner {

}
