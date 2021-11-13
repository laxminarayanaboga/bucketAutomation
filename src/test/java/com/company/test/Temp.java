package com.company.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Component;

import com.company.BucketAutomationApplication;
import com.company.domain.entity.TestScenario;
import com.company.domain.repository.HelloWorld;
import com.company.domain.repository.TestScenarioRepository;

@Component
public class Temp {
	public @Autowired TestScenarioRepository testScenarioRepository;
	
	
	public static void main(String[] args) {
		HelloWorld h = new HelloWorld();
		System.out.println(h.hello);
		TestScenario  asd = new TestScenario();
		asd.getEnvironment();
	}
	
	public void asdf() {
		testScenarioRepository.getTestScenario(null);
	}
	
	
}
