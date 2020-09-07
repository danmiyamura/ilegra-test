package com.ilegra.entities;

public class Order {
	private int itemId;
	private int itemQt;
	private double itemPrice;

	public Order(int itemId, int itemQt, double itemPrice) {
		this.itemId = itemId;
		this.itemQt = itemQt;
		this.itemPrice = itemPrice;
	}

	public int getItemId() {
		return itemId;
	}

	public int getItemQt() {
		return itemQt;
	}

	public double getItemPrice() {
		return itemPrice;
	}

	@Override
	public String toString() {
		return itemId + "-" + itemQt + "-" + itemPrice;
	}

	public double getTotal() {
		return getItemPrice() * getItemQt();
	}
}
