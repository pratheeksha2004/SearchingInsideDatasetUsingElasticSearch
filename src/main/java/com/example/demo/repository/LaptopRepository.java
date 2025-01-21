package com.example.demo.repository;

import com.example.demo.Laptop;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import java.util.List;

public interface LaptopRepository extends ElasticsearchRepository<Laptop, String> {

    // Find laptops by brand
    List<Laptop> findByBrand(String brand);

    // Find laptops by model
    List<Laptop> findByModel(String model);
    
    List<Laptop> findByColor(String color);

    // New Search by RAM
    List<Laptop> findByRam(String ram);

    // New Search by country of origin
    List<Laptop> findByCountryOfOrigin(String countryOfOrigin);
}
