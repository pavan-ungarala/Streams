//Partition numbers into prime vs non-prime
package com.infy.all;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimePartition {
	
	public static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		return IntStream.rangeClosed(2, (int)Math.sqrt(num)).allMatch(n -> num%n != 0);
	}
	
	public static void main(String[] args) {
		List<Integer> nums = List.of(2, 3, 4, 5, 9, 11, 15, 17);
		Map<Boolean, List<Integer>> partationMap = nums.stream()
													   .collect(Collectors.partitioningBy(PrimePartition :: isPrime));
		System.out.println("Prime numbers "+partationMap.get(true));
		System.out.println("Non-prime numbers are "+partationMap.get(false));

	}

}
