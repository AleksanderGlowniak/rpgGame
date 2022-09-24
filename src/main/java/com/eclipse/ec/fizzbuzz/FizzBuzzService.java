package com.eclipse.ec.fizzbuzz;

import java.util.List;

import com.eclipse.ec.interfaces.NumbersRepository;

public class FizzBuzzService {
	
	private NumbersRepository numbersRepository;
	public FizzBuzzService() {}
	public FizzBuzzService(NumbersRepository numbersRepository) {
		this.numbersRepository = numbersRepository;
	}
	public List<String> mapFromRepository(){
		List <Integer> numbers = numbersRepository.getNumbersToMap();
		return map(numbers);
	}
	
	public List<String> map(List<Integer> numbers) {
		List<String> result = numbers.stream().map(number ->{
		StringBuilder sb = new StringBuilder();
		if (number % 3 == 0) {
			sb.append("Fizz");
		}
		if (number % 5 == 0) {
			sb.append("Buzz");
		}
		
		return sb.isEmpty() ? number + "" : sb.toString();
	}).toList();
		
		return result;
	}
	
}
