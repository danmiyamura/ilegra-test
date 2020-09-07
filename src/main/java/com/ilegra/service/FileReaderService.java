package com.ilegra.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import com.ilegra.entities.Customer;
import com.ilegra.entities.EntitiesManager;
import com.ilegra.entities.Order;
import com.ilegra.entities.Sales;
import com.ilegra.entities.Salesman;

public class FileReaderService {

	private EntitiesManager entitiesManager;

	public FileReaderService() {
		this.entitiesManager = new EntitiesManager();
	}

	public EntitiesManager reader(Path file) throws IOException {
		BufferedReader buffRead = new BufferedReader(new FileReader(file.toString()));

		String line = null;
		String[] lineType = null;

		while (true) {
			line = buffRead.readLine();
			if (line != null) {
				lineType = line.split("ç");
				if (lineType != null) {

					switch (lineType[0]) {
					case ("001"):
						this.entitiesManager.getSalesmanList()
								.add(new Salesman(lineType[1], lineType[2], Double.parseDouble(lineType[3])));
						break;

					case ("002"):
						this.entitiesManager.getCustomerList().add(new Customer(lineType[1], lineType[2], lineType[3]));
						break;

					case ("003"):
						String orderLine = lineType[2].replaceAll("\\[|\\]", "");
						String[] orderSplit = orderLine.split(",");
						String[] itemSplit = null;

						List<Order> orders = new ArrayList<Order>();

						for (String order : orderSplit) {
							itemSplit = order.split("-");
							orders.add(new Order(Integer.parseInt(itemSplit[0]), Integer.parseInt(itemSplit[1]),
									Double.parseDouble(itemSplit[2])));
						}

						this.entitiesManager.getSalesList()
								.add(new Sales(Integer.parseInt(lineType[1]), orders, lineType[3]));

						break;

					default:
						break;
					}
				}

			} else
				break;
		}
		buffRead.close();

		return entitiesManager;
	}
}
