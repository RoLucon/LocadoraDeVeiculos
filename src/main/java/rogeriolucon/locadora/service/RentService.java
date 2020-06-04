/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rogeriolucon.locadora.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import rogeriolucon.locadora.model.RentOperation;
import rogeriolucon.locadora.model.TradeOperation;
import rogeriolucon.locadora.model.Vehicle;

/**
 *
 * @author rolucon
 */
public class RentService {
    public Map<Integer, RentOperation> rentedVehicles = new HashMap();
    public Map<Integer, RentOperation> returnedVehicles = new HashMap();
    
    public boolean rentlVehicle(RentOperation rent){
        rent.setType(RentOperation.Type.RETIRADA);
        rent.setContractOpen(true);
        rentedVehicles.put(rent.getVehicle().getId(), rent);
        //Passar para o banco
        return true;
    }
    
    public ArrayList<RentOperation> getRenteds(){
        return new ArrayList(rentedVehicles.values());
    }
    
    public boolean devolutionVehicle(RentOperation rent){
//        RentOperation rent = new RentOperation();
//        rent.setType(RentOperation.Type.DEVOLUÇÃO);
//        rent.setVehicle(vehicle);
//        returnedVehicles.put(vehicle.getId(), rent);
//        rentedVehicles.remove(rent);
        //Passar para o banco
        return true;
    }
}
