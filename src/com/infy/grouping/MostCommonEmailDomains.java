//Find the most common email domain.
package com.infy.grouping;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class MostCommonEmailDomains {

	public static void main(String[] args) {
		List<String> emails = List.of("a@sample.com", "b@example.com", "c@example.com", "d@test.com");
		//First prepare the map then process the entries to find the repeated domain
		Map<String, Long> domainsMap = emails.stream()
											   .map(email -> email.substring(email.indexOf("@")+1))
											   .collect(Collectors.groupingBy(
													   domain -> domain, 
													   Collectors.counting()
													   ));
		Set<Entry<String,Long>> entrys = domainsMap.entrySet();
		String repeatedDomain = entrys.stream()
									  .max(Map.Entry.comparingByValue())
									  .map(Map.Entry::getKey)
									  .orElse("No domains found");
		
		//directly collect the repeated string value 
		/*	String repeated = emails.stream()
									.map(email -> email.substring(email.indexOf("@")+1))
									.collect(Collectors.groupingBy(
											domain -> domain,
											Collectors.counting()
											))
									.entrySet().stream()
									.max(Map.Entry.comparingByValue(null))
									.map(Map.Entry::getKey)
									.orElse("No domains found"); */
		System.out.println("Most repeated domsin is: "+repeatedDomain);
		

	}

}
