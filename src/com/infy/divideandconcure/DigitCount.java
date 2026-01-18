package com.infy.divideandconcure;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//Count the digits of an large integer and take the sum number into an another list.
public class DigitCount {
	
	public static int countDigits(int number) {
		int sum = 0;
		while(number > 0) {
			sum += number %10;
			number = number/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> numbers = List.of(231,360,49,52,9,44,7,55,10,22,12,11,7,0,3);
		List<Integer> countNumbers = numbers.stream()
										    .map(num -> DigitCount.countDigits(num))
										    .toList();
		System.out.println("Sum of all added digits of the list is::: ");
		countNumbers.stream().forEach(num -> System.out.print(num+" "));
	}

}
