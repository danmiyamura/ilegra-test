package com.ilegra.entities;

import java.util.ArrayList;
import java.util.List;

public class EntitiesManager {
	private List<Salesman> salesmanList;
	private List<Customer> customerList;
	private List<Sales> salesList;

	public EntitiesManager() {
		this.salesmanList = new ArrayList<Salesman>();
		this.customerList = new ArrayList<Customer>();
		this.salesList = new ArrayList<Sales>();
	}

	public List<Salesman> getSalesmanList() {
		return salesmanList;
	}

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public List<Sales> getSalesList() {
		return salesList;
	}
}
