package com.infy.all;

import java.util.List;

public class LengthOfLongestString {

	public static void main(String[] args) {
		List<String> items = List.of("dog", "elephant", "cat");
		int length = items.stream()
						  .reduce((str1,str2) -> str1.length() > str2.length() ? str1 : str2)
						  .get()
						  .length();
		System.out.println("Length of the longest string of the list is: "+length);
	}

}
