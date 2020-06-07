/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import rogeriolucon.locadora.interfaces.FinancialServiceInterface;
import rogeriolucon.locadora.interfaces.RentServiceInterface;
import rogeriolucon.locadora.interfaces.TradeServiceInterface;
import rogeriolucon.locadora.model.RentOperation;
import rogeriolucon.locadora.model.TradeOperation;
import rogeriolucon.locadora.model.Vehicle;
import static rogeriolucon.locadora.views.MainView.MY_DATA_F;

/**
 *
 * @author rolucon
 */
public class VehicleService implements RentServiceInterface, TradeServiceInterface, FinancialServiceInterface {
    private TradeService tradeService = new TradeService();
    private RentService rentService = new RentService();
    private FinancialService financialService = new FinancialService();
    private Map<Integer,Vehicle> vehicleMap = new HashMap<>();
    
    public VehicleService() {
        generateList();
    }
    //Propios
    public ArrayList<Vehicle> getOwnVehicles(){
        return new ArrayList(vehicleMap.values());
    }
    
    public ArrayList<Vehicle> getAvailable() {
        Map<Integer, Vehicle> filtered = vehicleMap.entrySet().stream()
                .filter(map -> map.getValue().isAvailability() == true)
                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
        Collection<Vehicle> values = filtered.values();
        return new ArrayList<>(values);
    }
    //Trade
    @Override
    public boolean sellVehicle(TradeOperation trade){
        if(tradeService.sellVehicle(trade)){
            vehicleMap.remove(trade.getVehicle().getId());
            financialService.addSalesBalance(trade.getValue());
            return true;
        }
        return false;
    }
    @Override
    public boolean purchaseVehicle(Vehicle vehicle){
        if(tradeService.purchaseVehicle(vehicle)){
            vehicle.setId(vehicleMap.size());
            vehicleMap.put(vehicle.getId(), vehicle);
            financialService.addPurchaseBalance(vehicle.getPrice());
            return true;
        }
        return false;
    }
    
    @Override
    public ArrayList<TradeOperation> getSales() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TradeOperation> getPurchases() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<TradeOperation> getAllTradeOperations() {
        return tradeService.getAllTradeOperations();
    }
    //Rent
    @Override
    public boolean rentVehicle(RentOperation rent) {
        if(rentService.rentVehicle(rent)){
            Vehicle vehicle = vehicleMap.get(rent.getVehicle().getId());
            vehicle.setAvailability(false);
            financialService.addRentBalance(rent.getValue());
            //Setar veiculo para indisponivel
            return true;
        }
        return false;
    }

    @Override
    public boolean devolutionVehicle(RentOperation rent) {
        if(rentService.devolutionVehicle(rent)){
            rent.getVehicle().setAvailability(true);
            financialService.addRentBalance(rent.devolutionDif());
            return true;
        }
        return false;
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
    
    @Override
    public void changeConfig(double rentValuePerDay, double depreciationPerDay) {
        financialService.changeConfig(rentValuePerDay, depreciationPerDay);
    }

    @Override
    public double rentValuePerDay() {
        return financialService.rentValuePerDay();
    }

    @Override
    public double depreciationPerDay() {
        return financialService.depreciationPerDay();
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
            aux.setPlate("ABC-123"+i);
            aux.setAvailability(true);
            vehicleMap.put(aux.getId(), aux);
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(MY_DATA_F);

        RentOperation rent = new RentOperation();
        rent.setVehicle(vehicleMap.get(0));
        rent.setKm(100);
        rent.setTank((Vehicle.Tank.FULL));
        rent.setDate(LocalDate.parse("2020-06-03"));
        rent.setExpirationDate(LocalDate.parse("2020-06-04"));
        rentVehicle(rent);
    }
}
