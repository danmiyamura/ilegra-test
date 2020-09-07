package com.ilegra.service;

import java.io.IOException;
import java.nio.file.Path;

import com.ilegra.entities.reports.Report;

public class ReportService {
	private FileReaderService fileReaderService;
	private Report report;

	public ReportService(Path file) throws IOException {
		this.fileReaderService = new FileReaderService();
		this.report = new Report(this.fileReaderService.reader(file));
		FileWriterService.write(report, file);
	}
}
