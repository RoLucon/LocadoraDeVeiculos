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
        System.out.println("Veiculo add");
        return true;
    }
    
    private void generateList(){
        int id = 0;
        
        for (int i = 0; i < 2; i++) {
            Vehicle aux = new Vehicle();
            aux.setId(id);
            aux.setCategory(Vehicle.Category.ECO);
            aux.setBrand(Vehicle.Brand.FORD);
            aux.setModel("Modelo: " + i);
            aux.setKm(i * 5);
            aux.setPrice(i * 100);
            list.add(aux);
        }
    }
}
