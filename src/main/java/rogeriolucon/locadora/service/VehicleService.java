/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import rogeriolucon.locadora.model.RentOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class VehicleService {
    private TradeService tradeService = new TradeService();
    private RentService rentService = new RentService();
    private Map<Integer,Vehicle> vehicleMap = new HashMap<>();
    
    public VehicleService() {
        generateList();
    }
    
    public boolean sellVehicle(Vehicle vehicle){
        if(tradeService.purchaseVehicle(vehicle)){
            vehicleMap.remove(vehicle.getId());
            return true;
        }
        return false;
    }
    
    public boolean rentVehicle(RentOperation rent){
        if(rentService.rentlVehicle(rent)){
            Vehicle vehicle = vehicleMap.get(rent.getVehicle().getId());
            return true;
        }
        return false;
    }
    
    public boolean devolutionVehicle(){
        return true;
    }
    
    public boolean purchaseVehicle(Vehicle vehicle){
        if(tradeService.purchaseVehicle(vehicle)){
            vehicleMap.put(vehicle.getId(), vehicle);
            return true;
        }
        return false;
    }
    
    public ArrayList<Vehicle> getList(){
        return new ArrayList(vehicleMap.values());
    }
    
    public ArrayList<RentOperation> getRenteds(){
        return rentService.getRenteds();
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
            vehicleMap.put(aux.getId(), aux);
        }
    }
}
