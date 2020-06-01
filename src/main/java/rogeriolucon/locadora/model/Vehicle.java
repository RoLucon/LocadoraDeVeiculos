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
    
    private Brand brand;
    private Type type;
    private Tank tank;
    private String model;
    private String year;
    private String plate;
    private double km;
    private boolean availability;
    
}
