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
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import rogeriolucon.locadora.DAO.DaoException;
import rogeriolucon.locadora.DAO.VehicleDAO;
import rogeriolucon.locadora.interfaces.FinancialServiceInterface;
import rogeriolucon.locadora.interfaces.RentServiceInterface;
import rogeriolucon.locadora.interfaces.TradeServiceInterface;
import rogeriolucon.locadora.model.Model;
import rogeriolucon.locadora.model.RentOperation;
import rogeriolucon.locadora.model.TradeOperation;
import rogeriolucon.locadora.model.Vehicle;
import static rogeriolucon.locadora.views.MainView.MY_DATA_F;

/**
 *
 * @author rolucon
 */
public class MainService implements RentServiceInterface, TradeServiceInterface, FinancialServiceInterface {
    private TradeService tradeService = new TradeService();
    private RentService rentService = new RentService();
    private FinancialService financialService;
    private VehicleService vehilceService = new VehicleService();
    private Map<Integer,Vehicle> vehicleMap = new HashMap<>();
    
    public MainService() {
//        generateList();
        VehicleDAO dao = new VehicleDAO();
        try {
            vehicleMap = dao.selectAll();
        } catch (DaoException ex) {
            Logger.getLogger(MainService.class.getName()).log(Level.SEVERE, null, ex);
        }
        financialService = new FinancialService(tradeService.getSales(),
                tradeService.getPurchases(), rentService.getAllRentOperations());
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
    public boolean sellVehicle(Vehicle vehicle){
        vehicle.setSold(true);
        if(tradeService.sellVehicle(vehicle)){
            vehicleMap.remove(vehicle.getId());
            financialService.addSalesBalance(vehicle.getPrice());
            return true;
        }
        return false;
    }
    @Override
    public boolean purchaseVehicle(Vehicle vehicle){
        if(tradeService.purchaseVehicle(vehicle)){
//            vehicle.setId(vehicleMap.size());
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
        rent.getVehicle().setAvailability(false);
        rent.getVehicle().setKm(rent.getKm());
        rent.getVehicle().setTank(rent.getTank());
        if(rentService.rentVehicle(rent)){
            financialService.addRentBalance(rent.getValue());
            //Setar veiculo para indisponivel
            return true;
        }else{
            rent.getVehicle().setAvailability(true);
        }
        return false;
    }

    @Override
    public boolean devolutionVehicle(RentOperation rent) {
        rent.getVehicle().setAvailability(true);
        rent.getVehicle().setKm(rent.getFinalKm());
        rent.getVehicle().setTank(rent.getFinalTank());
        if(rentService.devolutionVehicle(rent)){
            rent.getVehicle().setAvailability(true);
            financialService.addRentBalance(rent.devolutionDif());
            return true;
        }else {
            rent.getVehicle().setAvailability(false);
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
    public double rentBalance(){
     return financialService.rentBalance();
    }
    
    @Override
    public double salesBalance(){
        return financialService.salesBalance();
    }
    
    @Override
    public double purchaseBalance(){
        return financialService.purchaseBalance();
    }
    
    @Override
    public double getBalance(){
        return  financialService.getBalance();
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
    public double depreciationPerKm() {
        return financialService.depreciationPerKm();
    }
    
    public List<String> getBrandNames(){
        return vehilceService.getBrandNames();
    }
    
    public List<Model> getModelByBrandName(String name) throws Exception{
        return vehilceService.getModelByBrandName(name);
    }
    
    // Gerando lista de testes
    private void generateList(){
        for (int i = 0; i < 5; i++) {
            Vehicle aux = new Vehicle();
            aux.setId(i);
            aux.setCategory(Vehicle.Category.ECO);
//            aux.setBrand(Vehicle.Brand.FORD);
            aux.setTank(Vehicle.Tank.HALF);
            aux.setModel("Modelo: " + i);
            aux.setKm(i * 5);
            aux.setPrice(1000.0 * i);
            aux.setPlate("ABC-123"+i);
            aux.setAvailability(true);
            purchaseVehicle(aux);
        }
//        DateTimeFormatter dtf = DateTimeFormatter.ofPattern(MY_DATA_F);
//
//        RentOperation rent = new RentOperation();
//        rent.setVehicle(vehicleMap.get(0));
//        rent.setKm(100);
//        rent.setTank((Vehicle.Tank.FULL));
//        rent.setDate(LocalDate.parse("2020-06-03"));
//        rent.setExpirationDate(LocalDate.parse("2020-06-04"));
//        rent.setValue(45);
//        rentVehicle(rent);
    }
}
