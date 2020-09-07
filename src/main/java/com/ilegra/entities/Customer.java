package com.ilegra.entities;

public class Customer {
	public final byte idClass = 002;
	private String cnpj;
	private String name;
	private String businessArea;
	
	public Customer(String cnpj, String name, String businessArea) {
		this.cnpj = cnpj;
		this.name = name;
		this.businessArea = businessArea;
	}

	public byte getIdClass() {
		return idClass;
	}

	public String getCnpj() {
		return cnpj;
	}

	public String getName() {
		return name;
	}

	public String getBusinessArea() {
		return businessArea;
	}
}
