package com.example.demo.service;

import com.example.demo.Laptop;
import com.example.demo.repository.LaptopRepository;
import com.opencsv.CSVReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

@Service
public class CsvToElasticsearchService {

    @Autowired
    private LaptopRepository laptopRepository;

    /**
     * Import CSV from file path to Elasticsearch.
     *
     * @param filePath the absolute path to the CSV file
     */
    public void importCsvToElasticsearch(String filePath) {
        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            importData(reader);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error occurred while importing data from CSV file path.");
        }
    }

    /**
     * Import CSV from MultipartFile to Elasticsearch.
     *
     * @param file the uploaded MultipartFile
     */
    public void importCsvToElasticsearch(MultipartFile file) {
        try (CSVReader reader = new CSVReader(new InputStreamReader(file.getInputStream()))) {
            importData(reader);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error occurred while importing data from uploaded CSV.");
        }
    }

    /**
     * Generic method to process CSV data.
     *
     * @param reader the CSVReader instance
     */
    private void importData(CSVReader reader) throws Exception {
        List<Laptop> laptops = new ArrayList<>();
        String[] line;

        // Skip the header row
        reader.readNext();

        // Read each row
        while ((line = reader.readNext()) != null) {
            Laptop laptop = new Laptop();
            laptop.setPartNo(line[4]);
            laptop.setBrand(line[1]);
            laptop.setModel(line[2]);
            laptop.setLaptopSeries(line[3]);
            laptop.setProcessorBrand(line[5]);
            laptop.setProcessorType(line[6]);
            laptop.setProcessorModel(line[7]);
            laptop.setProcessorCore(line[8]);
            laptop.setRam(line[9]);
            laptop.setRamType(line[10]);
            laptop.setHddRpm(line[11]);
            laptop.setInstalledSsdType(line[12]);
            laptop.setGraphicsChipset(line[13]);
            laptop.setGraphicsMemoryAccessibility(line[14]);
            laptop.setGraphicsMemory(line[15]);
            laptop.setDisplaySizeInch(line[16]);
            laptop.setDisplayType(line[17]);
            laptop.setDisplayResolution(line[18]);
            laptop.setTouchScreen(line[19]);
            laptop.setOpticalDrive(line[20]);
            laptop.setHdmiPort(line[21]);
            laptop.setLan(line[22]);
            laptop.setFingerPrintSensor(line[23]);
            laptop.setOperatingSystem(line[24]);
            laptop.setColor(line[25]);
            laptop.setWeightKg(line[26]);
            laptop.setPowerAdapter(line[27]);
            laptop.setWarranty(line[28]);
            laptop.setCountryOfOrigin(line[29]);

            laptops.add(laptop);
        }

        // Save all laptops to Elasticsearch
        laptopRepository.saveAll(laptops);
        System.out.println("Data successfully imported to Elasticsearch.");
    }
}
