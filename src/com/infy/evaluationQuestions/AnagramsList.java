package com.infy.evaluationQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
 Given a list of strings, group them into lists of anagrams using Java Streams.
 Input: ["eat", "tea", "tan", "ate", "nat", "bat"]
 */
public class AnagramsList {
	
	public static String elementChars(String element) {
		char[] chars = element.toCharArray();
		Arrays.sort(chars);
		return new String(chars);
	}
	
	public static void main(String[] args) {
		List<String> elements = List.of("eat", "tea", "tan", "ate", "nat", "bat");
		Map<String, List<String>> anagramMap = elements.stream()
													   .collect(Collectors.groupingBy(elmnt -> AnagramsList.elementChars(elmnt),
															   () -> new LinkedHashMap<>(),
															   Collectors.toList()
															   ));
		anagramMap.values().forEach(anagrams -> System.out.println(anagrams));
	}

}
