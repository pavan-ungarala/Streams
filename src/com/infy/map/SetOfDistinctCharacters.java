//Get a set of distinct characters across all words
package com.infy.map;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SetOfDistinctCharacters {

	public static void main(String[] args) {
		List<String> words = List.of("apple", "banana");
		Set<Character> charSet = words.stream().flatMap(word -> word.chars().mapToObj(c -> (char)c)).collect(Collectors.toSet());
		System.out.println("Distinct characters are:::");
		charSet.forEach(ch -> System.out.print(ch+" "));
	}

}
