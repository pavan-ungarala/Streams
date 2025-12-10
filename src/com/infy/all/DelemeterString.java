package com.infy.all;

import java.util.List;
import java.util.stream.Collectors;

public class DelemeterString {

	public static void main(String[] args) {
		List<String> tags = List.of("java", "streams", "api");
		String finalString = tags.stream()
								 .collect(Collectors.joining("|"))
								 .toString();
		System.out.println(finalString);
	}

}
