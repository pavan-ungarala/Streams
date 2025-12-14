//Find duplicate elements.
package com.infy.all;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateElementsList {

	public static void main(String[] args) {
		List<Integer> nums = List.of(3, 5, 7, 2, 2, 9, 10, 12, 9, 3, 3, 12);
		List<Integer> duplicates = nums.stream()
									   .collect(Collectors.groupingBy(num -> num, Collectors.counting()))  //count
									   .entrySet().stream()
									   .filter(entry -> entry.getValue() > 1)  //filter only duplicates
									   .map(Map.Entry::getKey)          //extract the element
									   .collect(Collectors.toList());
		System.out.println("Duplicate values are");
		duplicates.forEach(num -> System.out.print(num+" "));
	}

}
