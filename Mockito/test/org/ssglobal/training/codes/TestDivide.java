package org.ssglobal.training.codes;

import static org.mockito.BDDMockito.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.verify;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestDivide {

	@Mock
	private Divide divide;
	
	@InjectMocks
	private Mathematics math;
	
	@BeforeEach
	public void setup() {
		//MockitoAnnotations.initMocks(this);
		math = new Mathematics(divide);
	}
	
	@Test
	public void testComplexOp() {
		//create a mock - Arrange
		when(divide.div(anyInt(), isA(Integer.class))).thenReturn(1);
		
		//SUT - Act
		double result = math.complexOp(0, 0);
		Assertions.assertEquals(1999.00, result);
		
		//Verification - Assert
		verify(divide, times(2)).div(0, 0);
		
	}
	
	
	@AfterEach
	public void teardown() {
		
	}
}
