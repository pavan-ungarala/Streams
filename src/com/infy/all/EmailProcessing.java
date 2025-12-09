////Find the first email ending with @example.com or return "NotFound".
package com.infy.all;

import java.util.List;

public class EmailProcessing {

	public static void main(String[] args) {
		List<String> emails = List.of("a@sample.com", "b@example.com", "c@test.com");
		String found = emails.stream().findFirst().stream().anyMatch(str -> str.endsWith("@example.com")) ? "Required email found" : "Required email not found";
		System.out.println("Found status: "+found);
	}

}
