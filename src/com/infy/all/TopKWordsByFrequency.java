//Return top k words by frequency, tie-break alphabetically
package com.infy.all;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TopKWordsByFrequency {

	public static void main(String[] args) {
		List<String> words = List.of("a", "b", "a", "c", "b", "a"); 
		int k=2;
		List<String> topFrequencyList = words.stream()
											 .collect(Collectors.groupingBy(word -> word, Collectors.counting()))
											 .entrySet().stream()
											 //sorted frequency in desc then alphabetically asc
											 .sorted(Comparator.<Map.Entry<String, Long>>comparingLong(Map.Entry::getValue).reversed()
													 .thenComparing(Map.Entry::getKey))
											 .limit(k)
											 .map(Map.Entry::getKey)
											 .collect(Collectors.toList());
		System.out.println("top "+k+" words: "+topFrequencyList);
	}

}
