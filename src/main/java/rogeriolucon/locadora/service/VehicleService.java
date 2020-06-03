/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.util.ArrayList;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class VehicleService {
    public ArrayList<Vehicle> list = new ArrayList<>();
    
    public VehicleService() {
        generateList();
    }
    
    
    // Testes
    public boolean addVehicle(Vehicle vehicle){
        list.add(vehicle);
        return true;
    }
    
    private void generateList(){
        
        for (int i = 0; i < 5; i++) {
            Vehicle aux = new Vehicle();
            aux.setId(i);
            aux.setCategory(Vehicle.Category.ECO);
            aux.setBrand(Vehicle.Brand.FORD);
            aux.setModel("Modelo: " + i);
            aux.setKm(i * 5);
            aux.setPrice(1000.0 * i);
            list.add(aux);
        }
    }
}
