package com.infy.evaluationQuestions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Find the occurrence of characters in the input string input = "Hello" by using streams
public class CharacterFrequency {

	public static void main(String[] args) {
		String input = "Hello";
		Map<Character, Long> frequencyMap = input.chars()
		     .mapToObj(c -> (char) c)
		     .collect(Collectors.groupingBy(c -> c, 
		    		                         //() -> new LinkedHashMap<Character, Long>(), 
		    		 						 LinkedHashMap :: new,
		    		                         Collectors.counting()
		    		                         ));
		System.out.println(frequencyMap);

	}

}
