package com.usejunit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class UseJunit {
	
	@BeforeAll
	static void beforeAnyTest() {
		System.out.println("before any test");
	}
	
	@BeforeEach
	void beforeEachTest() {
		System.out.println("before each test");
	}
	
	@AfterAll
	static void afterAnyTest() {
		System.out.println("after any test");
	}
	
	@AfterEach
	void afterEachTest() {
		System.out.println("after each test");
	}
	
	@Test
	void testOneBegin() {
		System.out.println("Test one started");
	}
	
	@Test
	void testTwoBegin() {
		System.out.println("Test two stared");
	}

}
