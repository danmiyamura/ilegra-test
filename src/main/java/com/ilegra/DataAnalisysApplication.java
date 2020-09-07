package com.ilegra;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ilegra.service.DirectoryService;

@SpringBootApplication
public class DataAnalisysApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DataAnalisysApplication.class, args);
		
		runReport();

	}
	
	public static void runReport() throws IOException {
		new DirectoryService().directoryValidation().watchDirectory();
	}
}
