/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.interfaces;

import java.util.ArrayList;
import rogeriolucon.locadora.model.TradeOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public interface TradeServiceInterface {
    boolean sellVehicle(TradeOperation trade);
    boolean purchaseVehicle(Vehicle vehicle);
    ArrayList<TradeOperation> getSales();
    ArrayList<TradeOperation> getPurchases();
    ArrayList<TradeOperation> getAllTradeOperations();
}
