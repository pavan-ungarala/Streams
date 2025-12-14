//Flatten orders to get all unique item names across orders, sorted.
package com.infy.map;

import java.util.List;
import java.util.stream.Collectors;

import com.infy.entity.Item;
import com.infy.entity.Order;

public class FlattenMapItems {

	public static void main(String[] args) {
		List<Order> orders = List.of(new Order(1, List.of(new Item("Pen"), new Item("Book"))), 
				                           new Order(2, List.of(new Item("Book"), new Item("Pencil"))));
		List<String> items = orders.stream()
								   .flatMap(order -> order.getItems().stream())
								   .map(item -> item.getItemName())
								   .distinct()
								   .sorted()
								   .collect(Collectors.toList());
		System.out.println("Sorted items list from orders");
		items.forEach(item -> System.out.print(item+" "));
	}

}
