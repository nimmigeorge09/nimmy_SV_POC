package com.api.sv.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class GeneralHooks {
	
	@Before
	public void setup(Scenario name) {
		System.out.println("======Before Hook=====");
		System.out.println("******Name: "+ name.getName()+"*****");
		System.out.println("#####status:"+ name.getStatus()+"###");
	}
	
	@After
	public void teardown(Scenario name) {
		System.out.println("=========After Hook======");
		System.out.println("******Name: "+ name.getName()+"*****");
		System.out.println("#####status:"+ name.getStatus()+"###");
	}

}
