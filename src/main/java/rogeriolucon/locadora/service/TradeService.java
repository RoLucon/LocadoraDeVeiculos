/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.util.ArrayList;
import rogeriolucon.locadora.model.TradeOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class TradeService {
    public ArrayList<TradeOperation> purchasedVehicles = new ArrayList();
    public ArrayList<TradeOperation> soldVehicles = new ArrayList();
    
    public boolean sellVehicle(Vehicle vehicle){
        TradeOperation trade = new TradeOperation();
        trade.setType(TradeOperation.Type.VENDA);
        trade.setVehicle(vehicle);
        soldVehicles.add(trade);
        //Passar para o banco
        return true;
    }
    
    public boolean purchaseVehicle(Vehicle vehicle){
        TradeOperation trade = new TradeOperation();
        trade.setType(TradeOperation.Type.COMPRA);
        trade.setVehicle(vehicle);
        purchasedVehicles.add(trade);
        //Passar para o banco
        return true;
    }
}
