package com.example.demo;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "laptop_inventory")
public class Laptop {

    @Id
    private String partNo; // Unique identifier
    private String brand;
    private String model;
    private String laptopSeries;
    private String processorBrand;
    private String processorType;
    private String processorModel;
    private String processorCore;
    private String ram;
    private String ramType;
    private String hddRpm;
    private String installedSsdType;
    private String graphicsChipset;
    private String graphicsMemoryAccessibility;
    private String graphicsMemory;
    private String displaySizeInch;
    private String displayType;
    private String displayResolution;
    private String touchScreen;
    private String opticalDrive;
    private String hdmiPort;
    private String lan;
    private String fingerPrintSensor;
    private String operatingSystem;
    private String color;
    private String weightKg;
    private String powerAdapter;
    private String warranty;
    private String countryOfOrigin;

    // Getters and setters for all fields

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLaptopSeries() {
        return laptopSeries;
    }

    public void setLaptopSeries(String laptopSeries) {
        this.laptopSeries = laptopSeries;
    }

    public String getProcessorBrand() {
        return processorBrand;
    }

    public void setProcessorBrand(String processorBrand) {
        this.processorBrand = processorBrand;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public void setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
    }

    public String getProcessorCore() {
        return processorCore;
    }

    public void setProcessorCore(String processorCore) {
        this.processorCore = processorCore;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getRamType() {
        return ramType;
    }

    public void setRamType(String ramType) {
        this.ramType = ramType;
    }

    public String getHddRpm() {
        return hddRpm;
    }

    public void setHddRpm(String hddRpm) {
        this.hddRpm = hddRpm;
    }

    public String getInstalledSsdType() {
        return installedSsdType;
    }

    public void setInstalledSsdType(String installedSsdType) {
        this.installedSsdType = installedSsdType;
    }

    public String getGraphicsChipset() {
        return graphicsChipset;
    }

    public void setGraphicsChipset(String graphicsChipset) {
        this.graphicsChipset = graphicsChipset;
    }

    public String getGraphicsMemoryAccessibility() {
        return graphicsMemoryAccessibility;
    }

    public void setGraphicsMemoryAccessibility(String graphicsMemoryAccessibility) {
        this.graphicsMemoryAccessibility = graphicsMemoryAccessibility;
    }

    public String getGraphicsMemory() {
        return graphicsMemory;
    }

    public void setGraphicsMemory(String graphicsMemory) {
        this.graphicsMemory = graphicsMemory;
    }

    public String getDisplaySizeInch() {
        return displaySizeInch;
    }

    public void setDisplaySizeInch(String displaySizeInch) {
        this.displaySizeInch = displaySizeInch;
    }

    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public String getTouchScreen() {
        return touchScreen;
    }

    public void setTouchScreen(String touchScreen) {
        this.touchScreen = touchScreen;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public void setOpticalDrive(String opticalDrive) {
        this.opticalDrive = opticalDrive;
    }

    public String getHdmiPort() {
        return hdmiPort;
    }

    public void setHdmiPort(String hdmiPort) {
        this.hdmiPort = hdmiPort;
    }

    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public String getFingerPrintSensor() {
        return fingerPrintSensor;
    }

    public void setFingerPrintSensor(String fingerPrintSensor) {
        this.fingerPrintSensor = fingerPrintSensor;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(String weightKg) {
        this.weightKg = weightKg;
    }

    public String getPowerAdapter() {
        return powerAdapter;
    }

    public void setPowerAdapter(String powerAdapter) {
        this.powerAdapter = powerAdapter;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }
}
