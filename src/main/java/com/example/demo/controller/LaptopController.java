package com.example.demo.controller;

import com.example.demo.Laptop;
import com.example.demo.repository.LaptopRepository;
import com.example.demo.service.CsvToElasticsearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/laptops")
public class LaptopController {

    @Autowired
    private LaptopRepository laptopRepository;

    @Autowired
    private CsvToElasticsearchService csvService;

    /**
     * Search laptops by brand.
     *
     * @param brand the brand name to search for
     * @return a list of laptops matching the brand
     */
    @GetMapping("/search/brand")
    public List<Laptop> searchByBrand(@RequestParam String brand) {
        return laptopRepository.findByBrand(brand);
    }

 // New search by color
    @GetMapping("/search/color")
    public List<Laptop> searchByColor(@RequestParam String color) {
        return laptopRepository.findByColor(color);
    }

    // New search by RAM
    @GetMapping("/search/ram")
    public List<Laptop> searchByRam(@RequestParam String ram) {
        return laptopRepository.findByRam(ram);
    }

    // New search by country of origin
    @GetMapping("/search/countryOfOrigin")
    public List<Laptop> searchByCountryOfOrigin(@RequestParam String countryOfOrigin) {
        return laptopRepository.findByCountryOfOrigin(countryOfOrigin);
    }
    
    /**
     * Search laptops by model.
     *
     * @param model the model name to search for
     * @return a list of laptops matching the model
     */
    @GetMapping("/search/model")
    public List<Laptop> searchByModel(@RequestParam String model) {
        return laptopRepository.findByModel(model);
    }

    /**
     * Add a laptop manually to Elasticsearch.
     *
     * @param laptop the laptop to add
     * @return the added laptop
     */
    @PostMapping("/add")
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        return laptopRepository.save(laptop);
    }

    /**
     * Retrieve all laptops.
     *
     * @return a list of all laptops
     */
    @GetMapping("/all")
    public Iterable<Laptop> getAllLaptops() {
        return laptopRepository.findAll();
    }

    /**
     * Upload CSV file for batch import.
     *
     * @param file the CSV file to upload
     * @return a response indicating success or failure
     */
    @PostMapping("/upload")
    public String uploadCSV(@RequestParam("file") MultipartFile file) {
        try {
            csvService.importCsvToElasticsearch(file); // Use MultipartFile version
            return "CSV file successfully uploaded and data imported to Elasticsearch!";
        } catch (Exception e) {
            return "Failed to upload CSV: " + e.getMessage();
        }
    }
}
