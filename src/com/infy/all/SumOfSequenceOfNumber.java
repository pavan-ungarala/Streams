//Compute the sum of squares of numbers greater than 5.
package com.infy.all;

import java.util.List;

public class SumOfSequenceOfNumber {

	public static void main(String[] args) {
		List<Integer> nums = List.of(3, 5, 7, 2, 2, 9, 10, 12);
		int sum = nums.stream().filter(num -> num >5).reduce(0, (add,n) -> add+(n*n));
		System.out.println("sum of squares of numbers greater than 5: "+sum);
	}

}
