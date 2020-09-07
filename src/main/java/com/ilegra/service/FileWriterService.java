package com.ilegra.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.nio.file.Path;

import com.ilegra.entities.reports.Report;

public class FileWriterService {
	private static final String homePathOut = System.getProperty("user.home") + "\\data\\out\\";
	
	public static void write(Report report, Path fileName) throws FileNotFoundException {
		PrintStream printStream = new PrintStream(new File(homePathOut + fileName.getFileName().toString()));
		printStream.append("Quantidade de clientes no arquivo de entrada: " + report.getCustomerQt() + "\r\n");
		printStream.append("Quantidade de vendedores no arquivo de entrada: " + report.getSalesmanQt() + "\r\n");
		printStream.append("ID da venda mais cara: " + report.getIdExpensiveSale() + "\r\n");
		printStream.append("O pior vendedor por critério de salário é o: " + report.getWorstSalesman());
		
		printStream.close();
	}
}
