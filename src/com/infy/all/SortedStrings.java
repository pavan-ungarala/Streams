//Return a list of unique names in uppercase, sorted alphabetically.
package com.infy.all;

import java.util.List;
import java.util.stream.Collectors;

public class SortedStrings {

	public static void main(String[] args) {
		List<String> names = List.of("alice", "Bob", "charlie", "bob");
		System.out.println("List of names before processed");
		names.forEach(name -> System.out.print(name+" "));
		names = names.stream().map(name -> name.toUpperCase()).distinct().sorted().collect(Collectors.toList());
		System.out.println();
		System.out.println("List of names after processed");
		names.forEach(name -> System.out.print(name+" "));
	}

}
