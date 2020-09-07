package com.ilegra.entities;

import java.util.List;

public class Sales {
	public final byte idClass = 003;
	private int saleId;
	private List<Order> order;
	private String salesmanName;

	public Sales(int saleId, List<Order> order, String salesmanName) {
		this.saleId = saleId;
		this.order = order;
		this.salesmanName = salesmanName;
	}

	public byte getIdClass() {
		return idClass;
	}

	public int getSaleId() {
		return saleId;
	}

	public List<Order> getOrder() {
		return order;
	}

	public String getSalesmanName() {
		return salesmanName;
	}

	public double getTotal() {
		double total = 0;
		for (Order orderItem : order) {
			total += orderItem.getTotal();
		}
		return total;
	}
}