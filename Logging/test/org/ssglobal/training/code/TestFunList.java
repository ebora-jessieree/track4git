package org.ssglobal.training.code;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFunList {

	private FunList funList;
	
	@BeforeEach
	public void setup() {
		funList = new FunList();
	}
	
	@Test
	public void testEnableDisplay() {
		funList.enableDisplay();
	}
	
	@Test
	public void testShowLines() {
		funList.showLines();
	}
	
	
	@AfterEach
	public void teardown() {
		
	}
}
