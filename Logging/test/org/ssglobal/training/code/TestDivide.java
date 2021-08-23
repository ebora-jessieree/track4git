package org.ssglobal.training.code;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestDivide {

	private Divide divide;
	
	@BeforeEach
	public void setup() {
		divide = new Divide();
	}
	
	@Test
	public void testDiv() {
		Assertions.assertThrows(ArithmeticException.class, ()->{
			divide.div(0, 0);
		});
	}
	
	@AfterEach
	public void teardown() {
		
	}
}
