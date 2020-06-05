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
import rogeriolucon.locadora.interfaces.RentServiceInterface;
import rogeriolucon.locadora.model.RentOperation;


/**
 *
 * @author rolucon
 */
public class RentService implements RentServiceInterface {
    public Map<Integer, RentOperation> rentedVehicles = new HashMap();
    public Map<Integer, RentOperation> returnedVehicles = new HashMap();
    
    @Override
    public boolean rentVehicle(RentOperation rent){
        rent.setType(RentOperation.Type.RETIRADA);
        rent.setContractOpen(true);
        rentedVehicles.put(rent.getVehicle().getId(), rent);
        //Passar para o banco
        return true;
    }
    
    @Override
    public boolean devolutionVehicle(RentOperation rent){
//        RentOperation rent = new RentOperation();
//        rent.setType(RentOperation.Type.DEVOLUÇÃO);
//        rent.setVehicle(vehicle);
//        returnedVehicles.put(vehicle.getId(), rent);
//        rentedVehicles.remove(rent);
        //Passar para o banco
        return true;
    }
    
    @Override
    public ArrayList<RentOperation> getRenteds(){
        return new ArrayList(rentedVehicles.values());
    }
    
    @Override
    public ArrayList<RentOperation> getReturneds(){
        return new ArrayList(rentedVehicles.values());
    }
    
    @Override
    public ArrayList<RentOperation> getAllRentOperations(){
        ArrayList<RentOperation> aux = new ArrayList(rentedVehicles.values());
        aux.addAll(new ArrayList(returnedVehicles.values()));
        return aux;
    }
}
