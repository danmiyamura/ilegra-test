package com.ilegra.service;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class DirectoryService {
	private final String homePath = System.getProperty("user.home") + "\\data";
	private final String homePathIn = homePath + "\\in";
	private final String homePathOut = homePath + "\\out";

	public void watchDirectory() throws IOException {
		WatchService watchService = FileSystems.getDefault().newWatchService();

		Path directory = Paths.get(homePathIn);

		WatchKey watchKey = directory.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);

		while (true) {
			for (WatchEvent<?> event : watchKey.pollEvents()) {
				Path file = directory.resolve((Path) event.context());
				System.out.println("Arquivo inserido: " + file);

				new ReportService(file);
			}
		}
	}

	public DirectoryService directoryValidation() {
		File dataDirectory = new File(homePath);

		if (!dataDirectory.exists()) {
			System.out.println("Diretório data não existe.");
			dataDirectory.mkdirs();
			File inDirectory = new File(homePathIn);
			File outDirectory = new File(homePathOut);
			inDirectory.mkdir();
			outDirectory.mkdir();
			System.out.println("Diretórios criados com sucesso. Insira os arquivos no caminho " + homePathIn);
		} else {
			System.out.println("Insira os arquivos no caminho " + homePathIn);
		}
		return this;
	}
}
