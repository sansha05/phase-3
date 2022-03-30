package com.usejunit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class UseJunit {
	
	@Test
	void testOneBegin() {
		Assertions.assertSame("sharma", "sharma");
	}
	
	@Test
	void testTwoBegin() {
		Assertions.assertNotSame("sharma", "sandeep");
	}

}
