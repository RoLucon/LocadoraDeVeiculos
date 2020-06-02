/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.model;

/**
 *
 * @author rolucon
 */
public class Vehicle {
    
    public enum Brand {
        FORD, CHEVROLET, FIAT, AUDI, BMW, JEEP;
    }
    
    public enum Type {
        ECO, SEDAN, SUV, PRIMIUN
    }
    
    public enum Tank {
        LOW, FULL, HALF, QUARTER, THREE_QUARTER;
    }
    
    private int id;
    private Brand brand;
    private Type type;
    private Tank tank;
    private String model;
    private String year;
    private String plate;
    private double price;
    private double km;
    private boolean availability;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    
    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public double getPrice() {
        return km;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
 
}
