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
    
    private void generateList(){
        int id = 0;
        
        for (int i = 0; i < 15; i++) {
            Vehicle aux = new Vehicle();
            aux.setId(id);
            aux.setType(Vehicle.Type.ECO);
            aux.setBrand(Vehicle.Brand.FORD);
            aux.setModel("Modelo: " + i);
            aux.setKm(i * 5);
            aux.setPrice(i * 100);
            list.add(aux);
        }
    }
}
