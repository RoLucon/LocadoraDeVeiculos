/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.crypto.AEADBadTagException;
import rogeriolucon.locadora.interfaces.TradeServiceInterface;
import rogeriolucon.locadora.DAO.*;
import rogeriolucon.locadora.model.TradeOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class TradeService implements TradeServiceInterface {
    public ArrayList<TradeOperation> purchasedVehicles;
    public ArrayList<TradeOperation> soldVehicles;

    public TradeService() {
        try {
            TradeOperationDAO tradeDao = new TradeOperationDAO();
            Map<Integer, TradeOperation> operations  = tradeDao.selectAll();
            if(operations == null){
                purchasedVehicles = new ArrayList<>();
                soldVehicles = new ArrayList<>();
                return;
            }
            Map aux = operations.entrySet().stream()
                    .filter(map -> map.getValue().getType() == TradeOperation.Type.COMPRA)
                    .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
            Collection<TradeOperation> valuesS = aux.values();
            purchasedVehicles = new ArrayList<>(valuesS);
            
            aux = operations.entrySet().stream()
                    .filter(map -> map.getValue().getType() == TradeOperation.Type.VENDA)
                    .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
            Collection<TradeOperation> valuesP = aux.values();
            soldVehicles = new ArrayList<>(valuesP);
                    } catch (DaoException ex) {
            Logger.getLogger(TradeService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    public boolean sellVehicle(Vehicle vehicle){
        try {
            TradeOperation trade = new TradeOperation();
            VehicleDAO vehicleDao = new VehicleDAO();
            trade.setType(TradeOperation.Type.VENDA);
            trade.setVehicle(vehicle);
            trade.setValue(vehicle.getPrice());
            trade.setKm(vehicle.getKm());
            trade.setTank(vehicle.getTank());
            trade.setDate(LocalDate.now());
            TradeOperationDAO tradeDao = new TradeOperationDAO();
            int tradeId = tradeDao.insert(trade);
            if(tradeId >= 0){
                soldVehicles.add(trade);
                vehicleDao.update(trade.getVehicle());
            }
            return true;
        } catch (DaoException ex) {
            Logger.getLogger(TradeService.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    @Override
    public boolean purchaseVehicle(Vehicle vehicle){
        
        TradeOperationDAO tradeDao = new TradeOperationDAO();
        VehicleDAO vehicleDao = new VehicleDAO();
        try {
            int id = vehicleDao.insert(vehicle);
            
            if(id < 0){
                return false;
            }
            else{
                vehicle.setId(id);
                System.out.println("TUDO CERTO");
            }
            TradeOperation trade = new TradeOperation();
            trade.setType(TradeOperation.Type.COMPRA);
            trade.setVehicle(vehicle);
            trade.setDate(LocalDate.now());
            trade.setTank(vehicle.getTank());
            trade.setValue(vehicle.getPrice());
            purchasedVehicles.add(trade);
            int tradeId = tradeDao.insert(trade);
            if(tradeId >= 0){
                soldVehicles.add(trade);
            }
        } catch (DaoException ex) {
            Logger.getLogger(TradeService.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Passar para o banco
        return true;
    }

    @Override
    public ArrayList<TradeOperation> getSales() {
        return soldVehicles;
    }

    @Override
    public ArrayList<TradeOperation> getPurchases() {
        return purchasedVehicles;
    }

    @Override
    public ArrayList<TradeOperation> getAllTradeOperations() {
        ArrayList<TradeOperation> aux = new ArrayList(soldVehicles);
        aux.addAll(purchasedVehicles);
        return aux;
    }
}
