//Join with delimiter to produce "java | streams | api".
package com.infy.map;

import java.util.List;

public class DelimiterString {

	public static void main(String[] args) {
		List<String> tags = List.of("java", "streams", "api");
		String finalString = tags.stream().map(str -> str+" | ").toString(); 
		System.out.println(finalString);
	}

}