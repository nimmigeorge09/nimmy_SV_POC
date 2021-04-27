package com.api.sv.cucumber;

public class BaseClass {
	private String featureName;
	private String scenarioName;
	
	public String getFeaturename() {
		return featureName;
	}
	public String getScenarioname() {
		return scenarioName;
	}
	public BaseClass()
	{
		featureName="BDD";
		scenarioName="DI";
	}
	

}
