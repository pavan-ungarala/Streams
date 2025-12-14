//Stable pagination: return page k of size n sorted by price asc / name asc.
package com.infy.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.infy.entity.Product;

public class StablePagination {

	public static void main(String[] args) {
		List<Product> products = List.of(new Product("P1", 10.0), new Product("P2", 8.5), new Product("P3", 10.0));
		int k = 1;
		int n = 2;
		List<Product> page = products.stream()
									 .sorted(Comparator.comparing(Product::getPrice)
									 .thenComparing(Product::getName))
									 .skip((k-1L)*n)
									 .limit(n)
									 .collect(Collectors.toList());
		System.out.println("Page "+k +": "+page);
	}

}
