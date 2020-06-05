/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import rogeriolucon.locadora.interfaces.RentServiceInterface;
import rogeriolucon.locadora.model.RentOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class VehicleService implements RentServiceInterface {
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
    
    public ArrayList<Vehicle> getAvailable() {
        Map<Integer, Vehicle> filtered = vehicleMap.entrySet().stream()
                .filter(map -> map.getValue().isAvailability() == true)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        Collection<Vehicle> values = filtered.values();
        return new ArrayList<>(values);
    }

    @Override
    public boolean rentVehicle(RentOperation rent) {
        if(rentService.rentVehicle(rent)){
            Vehicle vehicle = vehicleMap.get(rent.getVehicle().getId());
            vehicle.setAvailability(false);
            //Setar veiculo para indisponivel
            return true;
        }
        return false;
    }

    @Override
    public boolean devolutionVehicle(RentOperation rent) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<RentOperation> getRenteds(){
        return rentService.getRenteds();
    }
    
    @Override
    public ArrayList<RentOperation> getReturneds() {
        return rentService.getReturneds();
    }

    @Override
    public ArrayList<RentOperation> getAllRentOperations() {
        return rentService.getAllRentOperations();
    }
    
    // Gerando lista de testes
    private void generateList(){
        for (int i = 0; i < 5; i++) {
            Vehicle aux = new Vehicle();
            aux.setId(i);
            aux.setCategory(Vehicle.Category.ECO);
            aux.setBrand(Vehicle.Brand.FORD);
            aux.setModel("Modelo: " + i);
            aux.setKm(i * 5);
            aux.setPrice(1000.0 * i);
            aux.setAvailability(true);
            vehicleMap.put(aux.getId(), aux);
        }
    }
}
