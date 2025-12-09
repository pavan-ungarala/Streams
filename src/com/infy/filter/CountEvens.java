//. Filter and count evens.
package com.infy.filter;

import java.util.List;

public class CountEvens {

	public static void main(String[] args) {
		List<Integer> nums = List.of(1, 4, 5, 8, 10, 11, 14);
		int count = nums.stream()
						.filter(num -> num%2 ==0)
						.toList().size();
		System.out.println("Count of even numbers are: "+count);

	}

}
