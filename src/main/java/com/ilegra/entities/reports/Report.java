package com.ilegra.entities.reports;

import com.ilegra.entities.EntitiesManager;
import com.ilegra.entities.Sales;
import com.ilegra.entities.Salesman;

public class Report {
	private EntitiesManager entitiesManager;

	public Report(EntitiesManager entitiesManager) {
		this.entitiesManager = entitiesManager;
	}

	public int getSalesmanQt() {
		return entitiesManager.getSalesmanList().size();
	}

	public int getCustomerQt() {
		return entitiesManager.getCustomerList().size();
	}

	public int getIdExpensiveSale() {
		Sales mostExpensive = null;

		for (Sales sales : entitiesManager.getSalesList()) {
			if (mostExpensive == null) {
				mostExpensive = sales;
			}
			if (sales.getTotal() > mostExpensive.getTotal()) {
				mostExpensive = sales;
			}
		}
		return mostExpensive.getSaleId();
	}

	public String getWorstSalesman() {
		Salesman worstSalesman = null;

		for (Salesman salesman : entitiesManager.getSalesmanList()) {
			if (worstSalesman == null) {
				worstSalesman = salesman;
			}
			if (salesman.getSalary() < worstSalesman.getSalary()) {
				worstSalesman = salesman;
			}
		}
		return worstSalesman.getName();
	}
}
