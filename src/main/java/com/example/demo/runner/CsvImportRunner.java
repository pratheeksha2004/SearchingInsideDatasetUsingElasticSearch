package com.example.demo.runner;

import com.example.demo.service.CsvToElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CsvImportRunner implements CommandLineRunner {

    @Autowired
    private CsvToElasticsearchService csvService;

    @Override
    public void run(String... args) throws Exception {
        // Provide the absolute path to your CSV file
        String filePath = "E:\\Aaruni\\ryans_laptop_inventory.csv";

        System.out.println("Starting CSV import process...");
        csvService.importCsvToElasticsearch(filePath); // Now works with file path
        System.out.println("CSV import process completed.");
    }
}
