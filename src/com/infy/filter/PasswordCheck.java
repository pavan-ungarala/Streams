////. Check if any password has length ≥ 12 and contains a digit.
package com.infy.filter;

import java.util.List;

public class PasswordCheck {

	public static void main(String[] args) {
		List<String> passwords = List.of("short", "longpassword1", "SecurePass1234");
		System.out.println("List before checked the criteria");
		passwords.forEach(pwd -> System.out.print(pwd+"   "));
		System.out.println();
		passwords = passwords.stream().filter(pwd -> pwd.matches("^(?=.*\\d).{12,}$")).toList();
		System.out.println("List after checked the criteria");
		passwords.forEach(pwd -> System.out.print(pwd+"   "));
	}

}
