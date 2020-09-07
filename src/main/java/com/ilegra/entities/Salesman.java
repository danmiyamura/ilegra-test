package com.ilegra.entities;

public class Salesman {
	public final byte idClass = 001;
	private String cpf;
	private String name;
	private double Salary;
	
	public Salesman(String cpf, String name, double salary) {
		this.cpf = cpf;
		this.name = name;
		Salary = salary;
	}
	
	public byte getIdClass() {
		return idClass;
	}
	public String getCpf() {
		return cpf;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return Salary;
	}
}
