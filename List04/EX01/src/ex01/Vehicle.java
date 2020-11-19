/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex01;

/**
 *
 * @author gabriel
 */
public class Vehicle {
    private String model;
    private String manufacturer;
    private int year;
    private int numberOfDoors;
    private int numberOfWheels;
    private String color;
    private int numberOfGears;
    
    public void setModel(String model) {
        this.model = model;
    }
    
    public String getModel() {
        return this.model;
    }
    
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    
    public String getManufacturer() {
        return this.manufacturer;
    }
    
    public void setYear(int year) {
        this.year = year;
    }
    
    public int getYear() {
        return this.year;
    }
    
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
    
    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }
    
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
    
    public int getNumberOfWheels() {
        return this.numberOfWheels;
    }
    
    public void setColor(String color) {
        this.color = color;
    }
    
    public String getColor() {
        return this.color;
    }
    
    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }
    
    public int getNumberOfGears() {
        return this.numberOfGears;
    }
    
    public void showVehicle(){
        System.out.println("Ano do Veículo: " + getYear());   
        System.out.println("Cor do Veículo: " + getColor());   
        System.out.println("Fabricante do Veículo: " + getManufacturer());   
        System.out.println("Modelo do Veículo: " + getModel());   
        System.out.println("Nº Marchas do Veículo: " + getNumberOfGears());   
        System.out.println("Nº Portas do Veículo: " + getNumberOfDoors());   
        System.out.println("Nº Rodas do Veículo: " + getNumberOfWheels());   
    }
}
