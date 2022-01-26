package com.Adactin.stepDefenition;

import com.adactin.baseclass.Base_Class;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks extends Base_Class {
	
	@Before
	public void beforeHooks(Scenario scenario) {
		System.out.println("scenario name :" + scenario.getName());

	}
	@After
	public void afterHooks(Scenario scenario) throws Throwable {
		Status status = scenario.getStatus();
		System.out.println("status :" + status);
//		System.out.println("status :" + scenario.getStatus());

		if (scenario.isFailed()) {
			screenShot(scenario.getId());
			System.out.println("screenshot taken");
			
			
		} else {
			System.out.println("accees passed");

		}
		
			System.out.println("completed");
		

	}

}
