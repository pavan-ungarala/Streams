//Produce a case-insensitive word frequency map (ignore punctuation)
package com.infy.grouping;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CaseInsensitiveWordFrequency {

	public static void main(String[] args) {
		String paragraph = "Streams make processing collections easy. Streams are powerful!";
		Map<String, Long> wordFrequency = new LinkedHashMap<>();
		wordFrequency = Arrays.stream(
											paragraph.toLowerCase()      //case insensitive
											.replaceAll("[^a-z\\s]", "") //remove punctuation
											.split("\\s+"))              //split by white space
										.collect(Collectors.groupingBy(
												    word -> word,         //group by words
													Collectors.counting() //count occurrences
										));
		System.out.println("Frequency of the case-insensitive words");
		wordFrequency.forEach((word, count) -> System.out.println(word+" : "+count));

	}

}
