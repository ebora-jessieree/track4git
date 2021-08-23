package org.ssglobal.training.codes;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class TestMathematics {

	private Mathematics math;
	
	@BeforeEach
	public void setup() {
		math = new Mathematics();
	}
	
	//This is sunny day
	@ParameterizedTest
	@MethodSource(value = {"mathProvider1", "mathProvider2"})
	public void testDivideCorrectData(int[] testData) {
		Assertions.assertDoesNotThrow(()->{
			int result = math.divide(testData[0], testData[1]);
			Assertions.assertEquals(testData[2], result);
		});
	}
	
	
	//rainy day
	@ParameterizedTest
	@MethodSource(value = {"mathProvider3"})
	public void testDivideIncorrectData(int[] testData) {
		Assertions.assertThrows(ArithmeticException.class, ()->{
			int result = math.divide(testData[0], testData[1]);
			Assertions.assertNotEquals(testData[2],result);
		});
	}
	
	@AfterEach
	public void teardown() {
		math = null;
	}
	
	//Custom Test Data(Method source provider) --should be private static and Stream
	//NoList here
	private static Stream<int[]> mathProvider1(){
		return Stream.of(new int[] {1,2,0},new int[] {5,2,2},new int[] {10,2,5});
	}
	
	private static Stream<int[]> mathProvider2(){
		return Stream.of(new int[] {1,2,0},new int[] {5,2,2},new int[] {10,2,5});
	}
	
	private static Stream<int[]> mathProvider3(){
		return Stream.of(new int[] {1,2,1},new int[] {5,0,0},new int[] {-10,-2,-5});
	}
	
}
