package org.ssglobal.training.codes;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class TestFunList {

	private FunList funList; //this should always be private
	private Word word;
	
	@BeforeEach //This is called fixtures
	public void setup() {
		//System.out.println("Initialization");
		funList = new FunList("test/config/myfile.txt");
	}
	
	//Sunny Day Testing
	
	//Testing on count returning a value
	@Disabled
	@Test
	public void testCountEqualsValue() {
		long count = funList.countWords();
		Assertions.assertEquals(6, count); //left side is expected output	
	}
	
	@Disabled
	@Test
	public void testCountNonNegativeFile1() {
		long count = funList.countWords();
		Assertions.assertTrue(count >= 0); //you can put conditional here	
	}
	
	@Test
	public void testCountNonNegativeFile2() {
		FunList funList = new FunList("test/config/myfile2.txt");
		long count = funList.countWords();
		Assertions.assertEquals(0, count);
		funList = null;	
	}
	
	@Disabled
	@Test
	public void testContentListNotNull() {
		List<String> temp = funList.getContentList();
		Assertions.assertNotNull(temp);

	}
	
	@Disabled
	@Test
	public void testSameContentArrays() {
		Assertions.assertDoesNotThrow(()->{
			String[] content = {"The Quick Brown Fox Jumps Over The Lazy Dog"};//"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy", "Dog"
			String[] temp = funList.getContentArray();
			Assertions.assertSame(content, temp);
		});
	}
	
	
	//Enum Constant Objects or pointers pointing to one object
	@Disabled
	@Test
	public void testSameContentArraysRainy() {
		Assertions.assertThrows(ClassCastException.class, ()->{
			String[] content = {"The Quick Brown Fox Jumps Over The Lazy Dog"};//"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy", "Dog"
			String[] temp = funList.getContentArray();
			Assertions.assertSame(content, temp);
		});
	}

	@Disabled
	@Test
	public void testSameContentArraysValue() {
		Assertions.assertDoesNotThrow(()->{
			String[] content = {"The Quick Brown Fox Jumps Over The Lazy Dog"};//"The", "Quick", "Brown", "Fox", "Jumps", "Over", "The", "Lazy", "Dog"
			String[] temp = funList.getContentArray();
			Assertions.assertEquals(content, temp);
		});
		
	}
	
	//Rainy Day Testing
	@Disabled
	@Test
	public void testCountNonNegativeFile1Rainy() {
		long count = funList.countWords();
		Assertions.assertFalse(count <= 0); 
	}
	
	@Disabled
	@Test
	public void testCountNonNegativeFile2Rainy() {
		FunList funList = new FunList("test/config/myfile2.txt");
		long count = funList.countWords();
		Assertions.assertNotEquals(6, count);
		funList = null;	
	}
	
	@Disabled
	@Test
	public void testContentListNotNullRainy() {
		List<String> temp = funList.getContentList();
		Assertions.assertNull(temp);
	}
	
	@Test
	public void testDisplayInSeconds() {
		Assertions.assertTimeout(Duration.ofSeconds(2), ()->{
			funList.showLines();
		});
		
	}
	
	@Test
	public void testDisplayInMillis() {
		Assertions.assertTimeout(Duration.ofMillis(10), ()->{
			funList.showLines();
		});
		
	}
	
	@RepeatedTest(value = 5)
	public void testSameContentArraysValueRepeat() {
		String[] content = {"The Quick Brown Fox Jumps Over The Lazy Dog"};
		String[] temp = funList.getContentArray();
		Assertions.assertEquals(content, temp);
	}
	
	@AfterEach
	public void teardown() {
		//System.out.println("Destroy");
		funList = null;
	}
	
} 
//Setup, Exercise, Verify, Teardown
//1 setup and 1 teardown for every test case class
