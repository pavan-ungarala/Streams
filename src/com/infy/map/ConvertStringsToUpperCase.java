//Convert list of strings to uppercase
package com.infy.map;

import java.util.List;

public class ConvertStringsToUpperCase {

	public static void main(String[] args) {
		List<String> names = List.of("alice", "bob", "charlie");
		System.out.println("List of strings before modified");
		names.forEach(name -> System.out.print(name + "  "));
		names = names.stream()
					 .map(name -> name.toUpperCase())
					 .toList();
		System.out.println();
		System.out.println("List of strings after modified by Streams");
		names.forEach(name -> System.out.print(name + "  "));
	}

}
