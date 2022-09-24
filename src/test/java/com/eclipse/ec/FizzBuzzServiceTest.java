package com.eclipse.ec;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.eclipse.ec.fizzbuzz.FizzBuzzService;

public class FizzBuzzServiceTest {

	@Test
	public void shoulReturn1For1() {
		// given
		int one = 1;
		FizzBuzzService fb = new FizzBuzzService();
		
		// when
		List<String> result = fb.map(Arrays.asList(one)); // mapuuje - przeksztalca na cos
		
		// then
		assertEquals("1", result.get(0));
				
	}
	
	@Test
	public void shoulReturnFizzFor3() {
		// given
		int three = 3;
		FizzBuzzService fb = new FizzBuzzService();
		
		// when
		List<String> result = fb.map(Arrays.asList(three)); // mapuuje - przeksztalca na cos
		
		// then
		assertEquals("Fizz", result.get(0));
				
	}
	@Test
	public void shoulReturnBuzzFor5() {
		// given
		int five = 5;
		FizzBuzzService fb = new FizzBuzzService();
		
		// when
		List<String> result = fb.map(Arrays.asList(five));
		
		// then
		assertEquals("Buzz", result.get(0));
				
	}
	@Test
	public void shoulReturnFizzBuzzFor15() {
		// given
		int fifteen = 15;
		FizzBuzzService fb = new FizzBuzzService();
		
		// when
		List<String> result = fb.map(Arrays.asList(fifteen));
		
		// then
		assertEquals("FizzBuzz", result.get(0));
				
	}
	
}
