/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import rogeriolucon.locadora.interfaces.TradeServiceInterface;
import rogeriolucon.locadora.DAO.*;
import rogeriolucon.locadora.model.TradeOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class TradeService implements TradeServiceInterface {
    public ArrayList<TradeOperation> purchasedVehicles = new ArrayList();
    public ArrayList<TradeOperation> soldVehicles = new ArrayList();
    
    @Override
    public boolean sellVehicle(TradeOperation trade){
        trade.setType(TradeOperation.Type.VENDA);
        soldVehicles.add(trade);
        //Passar para o banco
        return true;
    }
    @Override
    public boolean purchaseVehicle(Vehicle vehicle){
        TradeOperation trade = new TradeOperation();
        trade.setType(TradeOperation.Type.COMPRA);
        trade.setVehicle(vehicle);
        trade.setDate(LocalDate.now());
        purchasedVehicles.add(trade);
        VehicleDAO dao = new VehicleDAO();
        try {
            int id = dao.insert(vehicle);
            if(id < 0){
                System.out.println("ERRO DE ID");
                return false;
            }
            else{
                vehicle.setId(id);
                System.out.println("TUDO CERTO");
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
