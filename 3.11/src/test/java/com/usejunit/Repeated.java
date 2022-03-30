package com.usejunit;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;
import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

import com.calculate.Calculator;
 
@DisplayName("JUnit 5 Conditional Tests Example")
@RunWith(JUnitPlatform.class)
public class Repeated {
	
	
	@BeforeAll
	static void init() {
		System.out.println("test started");
	}
	
	@AfterAll
	static void end() {
		System.out.println("tests finished");
	}

	@BeforeEach
	void beforeEachTest() {
		System.out.println("before test executed");
	}
	
	@AfterEach
	void afterEachTest() {
		System.out.println("after test executed");
	}
	
	
	@Test
	@RepeatedTest(5)
	@DisplayName("add operation")
	void testCalculator() {
		Calculator add = new Calculator();
		Assertions.assertEquals(2, add.addNumber(1, 1));
	}
}

