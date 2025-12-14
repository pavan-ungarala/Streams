package com.infy.entity;

public class Item {
	private String itemName;

	public Item(String itemName) {
		super();
		this.itemName = itemName;
	}

	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + "]";
	}
	
}
